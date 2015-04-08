package com.jiazy.areaview.util;

import java.io.InputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class AreaView0 extends ImageView {
	private boolean flag = true;  //为true表示首次进行放大缩小，解决首次缩放时出现最上层图片不同时缩放问题
	private long startTime;
    private long endTime;
    
	public Matrix matrix;

    static final int NONE = 0;
    static final int DRAG = 1;
    static final int ZOOM = 2;
    int mode = NONE;

    PointF last = new PointF();
    PointF start = new PointF();
    float minScale = 1f;
    float maxScale = 3f;
    float[] m;

    int viewWidth, viewHeight;
    static final int CLICK = 3;
    float saveScale = 1f;
    protected float origWidth, origHeight;
    int oldMeasuredWidth, oldMeasuredHeight;

    ScaleGestureDetector mScaleDetector;

    Context context;
	
	IAddAreaView iAddAreaView = null;  //初始化接口变量 
	
	public void setAreaView(IAddAreaView iAddAreaView) {  
		this.iAddAreaView = iAddAreaView;  
    }
	
	public AreaView0(Context context) {
		super(context);
		sharedConstructing(context);
	}

	public AreaView0(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		sharedConstructing(context);
	}

	public AreaView0(Context context, AttributeSet attrs) {
		super(context, attrs);
		sharedConstructing(context);
	}
	
	/**
	 * 说明:onTouchEvent方法中，
	 * 返回true表示组件需要拦截touch事件，
	 * 返回false表示不拦截,那么事件会继续分发到viewgroup中的其他child去
	 */
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		
		mScaleDetector.onTouchEvent(event);
        PointF curr = new PointF(event.getX(), event.getY());
        
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
            	last.set(curr);
                start.set(last);
                mode = DRAG;
                
                startTime = System.currentTimeMillis();
//                System.out.println("====startTime="+startTime);
                
                break;
                
            case MotionEvent.ACTION_MOVE:
                if (mode == DRAG) {
                    float deltaX = curr.x - last.x;
                    float deltaY = curr.y - last.y;
                    float fixTransX = getFixDragTrans(deltaX, viewWidth, origWidth * saveScale);
                    float fixTransY = getFixDragTrans(deltaY, viewHeight, origHeight * saveScale);
                    matrix.postTranslate(fixTransX, fixTransY);
                    fixTrans();
                    last.set(curr.x, curr.y);
                }
                break;

            case MotionEvent.ACTION_UP:
                mode = NONE;
                int xDiff = (int) Math.abs(curr.x - start.x);
                int yDiff = (int) Math.abs(curr.y - start.y);
                if (xDiff < CLICK && yDiff < CLICK)
                    performClick();
                
                endTime = System.currentTimeMillis();
//                System.out.println("====endTime="+endTime);
                break;

            case MotionEvent.ACTION_POINTER_UP:
                mode = NONE;
                break;
                
        }
        
        iAddAreaView.setAreaViewMatrix(matrix);
        
        if(flag){
        	changeImg(event); 
        	flag = false;
        }else if(endTime - startTime < 400 && action == MotionEvent.ACTION_UP){
        	changeImg(event); 
        }
        
        return true;
	}
	
	private boolean changeImg(MotionEvent event){
		Bitmap bitmap = getBitmap();
		
		int pixel = switchPixel(event, bitmap);
		String colorStr = Integer.toHexString(pixel);

		iAddAreaView.changeAreaView(colorStr);
		iAddAreaView.clickAreaView();
		
		return true;
	}
	
	public Bitmap getBitmap(){
		setDrawingCacheEnabled(true);// ImageView对象必须做如下设置后，才能获取其中的图像
		Bitmap bitmap = Bitmap.createBitmap(getDrawingCache());// 获取ImageView中的图像
		setDrawingCacheEnabled(false);//从ImaggeView对象中获取图像后，调用setDrawingCacheEnabled(false)清空画图缓
		
		return bitmap;
	}
	
	/**
	 * 获取某点上bitmap的颜色值
	 * @param event
	 * @param bitmap
	 * @return
	 */
	private int switchPixel(MotionEvent event, Bitmap bitmap){
		int x = (int) event.getX();
		int y = (int) event.getY();
		
		int w = bitmap.getWidth();
		int h = bitmap.getHeight();
		
		int width = getWidth();
		int height = getHeight();
		
		int pixel;
		try {
			//位图的坐标和MotionEvent的坐标不一致，需要通过一定比例进行转换
			pixel = bitmap.getPixel(x*w/width, y*h/height);
			
		} catch (Exception e) {
			pixel = 0;
		}
		
		return pixel;
	}
	
	private void sharedConstructing(Context context) {
        super.setClickable(true);
        this.context = context;
        mScaleDetector = new ScaleGestureDetector(context, new ScaleListener());
        matrix = new Matrix();
        m = new float[9];
        setImageMatrix(matrix);
        setScaleType(ScaleType.MATRIX);

    }

    public void setMaxZoom(float x) {
        maxScale = x;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            mode = ZOOM;
            return true;
        }

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            float mScaleFactor = detector.getScaleFactor();
            float origScale = saveScale;
            saveScale *= mScaleFactor;
            if (saveScale > maxScale) {
                saveScale = maxScale;
                mScaleFactor = maxScale / origScale;
            } else if (saveScale < minScale) {
                saveScale = minScale;
                mScaleFactor = minScale / origScale;
            }

            if (origWidth * saveScale <= viewWidth || origHeight * saveScale <= viewHeight)
                matrix.postScale(mScaleFactor, mScaleFactor, viewWidth / 2, viewHeight / 2);
            else
                matrix.postScale(mScaleFactor, mScaleFactor, detector.getFocusX(), detector.getFocusY());

            fixTrans();
            return true;
        }
    }

    void fixTrans() {
        matrix.getValues(m);
        float transX = m[Matrix.MTRANS_X];
        float transY = m[Matrix.MTRANS_Y];
        
        float fixTransX = getFixTrans(transX, viewWidth, origWidth * saveScale);
        float fixTransY = getFixTrans(transY, viewHeight, origHeight * saveScale);

        if (fixTransX != 0 || fixTransY != 0)
            matrix.postTranslate(fixTransX, fixTransY);
    }

    float getFixTrans(float trans, float viewSize, float contentSize) {
        float minTrans, maxTrans;

        if (contentSize <= viewSize) {
            minTrans = 0;
            maxTrans = viewSize - contentSize;
        } else {
            minTrans = viewSize - contentSize;
            maxTrans = 0;
        }

        if (trans < minTrans)
            return -trans + minTrans;
        if (trans > maxTrans)
            return -trans + maxTrans;
        return 0;
    }
    
    float getFixDragTrans(float delta, float viewSize, float contentSize) {
        if (contentSize <= viewSize) {
            return 0;
        }
        return delta;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        viewWidth = MeasureSpec.getSize(widthMeasureSpec);
        viewHeight = MeasureSpec.getSize(heightMeasureSpec);
        
        if (oldMeasuredHeight == viewWidth && oldMeasuredHeight == viewHeight
                || viewWidth == 0 || viewHeight == 0)
            return;
        oldMeasuredHeight = viewHeight;
        oldMeasuredWidth = viewWidth;

        if (saveScale == 1) {
            float scale;

            Drawable drawable = getDrawable();
            if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0)
                return;
            int bmWidth = drawable.getIntrinsicWidth();
            int bmHeight = drawable.getIntrinsicHeight();
            
            Log.d("bmSize", "bmWidth: " + bmWidth + " bmHeight : " + bmHeight);

            float scaleX = (float) viewWidth / (float) bmWidth;
            float scaleY = (float) viewHeight / (float) bmHeight;
            scale = Math.min(scaleX, scaleY);
            matrix.setScale(scale, scale);

            float redundantYSpace = (float) viewHeight - (scale * (float) bmHeight);
            float redundantXSpace = (float) viewWidth - (scale * (float) bmWidth);
            redundantYSpace /= (float) 2;
            redundantXSpace /= (float) 2;

            matrix.postTranslate(redundantXSpace, redundantYSpace);

            origWidth = viewWidth - 2 * redundantXSpace;
            origHeight = viewHeight - 2 * redundantYSpace;
            setImageMatrix(matrix);
        }
        fixTrans();
    }
	
    /** 
	 * 以最省内存的方式读取本地资源的图片 
	 * @param context 
	 * @param resId 
	 * @return 
	 */  
	public Bitmap readBitMap(Context context, int resId){  
	    BitmapFactory.Options opt = new BitmapFactory.Options();  
	    opt.inPreferredConfig = Bitmap.Config.RGB_565;   
	    opt.inPurgeable = true;  
	    opt.inInputShareable = true;  
	       //获取资源图片  
	    InputStream is = context.getResources().openRawResource(resId);  
	    
	    return BitmapFactory.decodeStream(is,null,opt);  
	} 
}
