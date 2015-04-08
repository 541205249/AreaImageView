package com.jiazy.areaview;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.jiazy.areaview.R;
import com.jiazy.areaview.util.AreaView;
import com.jiazy.areaview.util.AreaView0;
import com.jiazy.areaview.util.AreaViewFactory;
import com.jiazy.areaview.util.IAddAreaView;

public class AreaViewProvinceActivity extends Activity {
	private Context context;
	public RelativeLayout myLayout;
	private String provinceFlag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		context = this;

		myLayout = new RelativeLayout(context);
		myLayout.setLayoutParams(new RelativeLayout.LayoutParams(
				RelativeLayout.LayoutParams.MATCH_PARENT,
				RelativeLayout.LayoutParams.MATCH_PARENT));
		
		initAreaView0();
		initAreaView(1);
		
		AreaView0 itemView0 = (AreaView0) myLayout.getChildAt(0);
		AreaView itemView1 = (AreaView) myLayout.getChildAt(1);
		
		Bitmap bitmap0 = null;
		Bitmap bitmap1 = null;
		provinceFlag = "全国";
		bitmap0 = itemView0.readBitMap(context, R.drawable.city_china);
		bitmap1 = itemView1.readBitMap(context, R.drawable.city_china_1);
		
		itemView0.setImageBitmap(bitmap0);
		itemView0.setTag(provinceFlag);
		
		itemView1.setImageBitmap(bitmap1);
		
		setContentView(myLayout);
		
	}
	
	/**
	 * 给AreaView设置缩放
	 * @param str
	 */
	public void setViewMatrix(Matrix matrix) {
		AreaView0 itemView0 = (AreaView0) myLayout.getChildAt(0);
		itemView0.setImageMatrix(matrix);
		itemView0.invalidate();
		
		if(myLayout.getChildAt(1) != null){
			AreaView itemView = (AreaView) myLayout.getChildAt(1);
			itemView.setScaleType(ScaleType.MATRIX);
			
			itemView.setImageMatrix(matrix);
			itemView.invalidate();
		}
		
		if(myLayout.getChildAt(2) != null){
			AreaView itemView = (AreaView) myLayout.getChildAt(2);
			itemView.setScaleType(ScaleType.MATRIX);
			
			itemView.setImageMatrix(matrix);
			itemView.invalidate();
		}
	}
	
	/**
	 * 给AreaView设置参数
	 * @param str
	 */
	public void setAreaViewAttr(String colorStr) {
		if(myLayout.getChildAt(2) == null){
			initAreaView(2);
		}
		
		AreaView itemView = (AreaView) myLayout.getChildAt(2);

		//设置参数
		new AreaViewFactory().putAreaViewValue(context, itemView, colorStr, provinceFlag);
	}

	/**
	 * 初始化AreaView
	 * 
	 */
	private void initAreaView(int index) {
		AreaView itemView = new AreaView(this);
		
		itemView.setScaleType(ScaleType.FIT_CENTER);
		itemView.setLayoutParams(new LayoutParams(
				LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		
		myLayout.addView(itemView, index);
		
	}
	
	/**
	 * 初始化AreaView0
	 * 
	 */
	private void initAreaView0() {
		AreaView0 itemView = new AreaView0(this);
		
//		itemView.setScaleType(ScaleType.FIT_XY);
		itemView.setLayoutParams(new LayoutParams(
				LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		
		myLayout.addView(itemView);
		
		itemView.setAreaView(new IAddAreaView() {
			@Override
			public void changeAreaView(String colorStr) {
				setAreaViewAttr(colorStr);
			}

			@Override
			public void clickAreaView() {
				getAreaViewInfo();
			}

			@Override
			public void setAreaViewMatrix(Matrix matrix) {
				setViewMatrix(matrix);
			}
		});
	}
	
	/**
	 * 获取手指抬起时的 区域  的信息
	 */
	
	private void getAreaViewInfo(){
		AreaView itemView = (AreaView) myLayout.getChildAt(2);
		
		if(itemView != null){
			String tag = (String) itemView.getTag();
			showToast("点击了"+tag);
			
			getAreaCode(tag);
			
			if(!"0".equals(code)){
				AreaTabActivity.initCityTab();
			}
		}
	}
	
	private static String code = "";
	private static String name = "";
	private void getAreaCode(String tag){
		if(!"".equals(tag) && tag != null){
			String info[] = tag.split("=");
			code = info[0];
			name = info[1];
		}else{
			code = "0";
			name = "全国";
		}
	}
	
	public static Map<String, String> getAreaInfo(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", code);
		map.put("name", name);
		
		return map;
	}
	
	private Toast mToast;
	private void showToast(String str){
		if (null != mToast) mToast.cancel();
		
		mToast = Toast.makeText(context, str,
				Toast.LENGTH_SHORT);
		mToast.show();
		
	}
	
}
