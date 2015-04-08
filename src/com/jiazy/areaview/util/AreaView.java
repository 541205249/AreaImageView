package com.jiazy.areaview.util;

import java.io.InputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class AreaView extends ImageView {
    Context context;
	
	public AreaView(Context context) {
		super(context);
	}

	public AreaView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public AreaView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * 说明:onTouchEvent方法中，
	 * 返回true表示组件需要拦截touch事件，
	 * 返回false表示不拦截,那么事件会继续分发到viewgroup中的其他child去
	 */
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		//该控件为上层图片（单个省或单个市）,对事件不拦截
        return false;
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
