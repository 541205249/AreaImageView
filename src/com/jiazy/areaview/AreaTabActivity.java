package com.jiazy.areaview;

import java.util.HashMap;
import java.util.Map;

import android.annotation.SuppressLint;
import android.app.ActivityGroup;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.jiazy.areaview.R;

@SuppressWarnings("deprecation")
@SuppressLint("ShowToast")
public class AreaTabActivity extends ActivityGroup {
	private Context context;
	private String currentTag;
	private Map<String, View> childViews = new HashMap<String, View>();
	private RadioGroup areaRadioGroup;
	private static RadioButton cityBtn;
	
	private LinearLayout container;
	public static int currentFlag = 2;//1表示城市图形页，0代表省图形页，2表示列表页
	public static String provinceName = "";
	public static String provinceCode = "";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_areatab);

		initView();
	}

	private void initView() {
		context = this;
		currentFlag = 0;
		provinceName = "";
		provinceCode = "";
		
		container = (LinearLayout) findViewById(R.id.areatab_container);
		areaRadioGroup = (RadioGroup) findViewById(R.id.areatab_radioGroup);
		cityBtn = (RadioButton) findViewById(R.id.areatab_cityBtn);
		
		Intent intent = new Intent();
		intent.setClass(context, AreaViewProvinceActivity.class);
		customStartActivity("province", intent);
		cityBtn.setText("湖南省");
		currentFlag = 0;
		
		initListener();
	}
	
	private void initListener() {
		areaRadioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				Intent intent = new Intent();
				switch (arg1) {
				// 省级地图
				case R.id.areatab_provinceBtn:
					intent.setClass(context, AreaViewProvinceActivity.class);
					customStartActivity("province", intent);
					currentFlag = 0;
					break;
					// 市级地图
				case R.id.areatab_cityBtn:
					intent.setClass(context, AreaViewCityActivity.class);
					customStartActivity("city", intent);
					currentFlag = 1;
					break;
				}
			}
		});
		
	}
	
	public static void initCityTab(){
		if(currentFlag == 0){
			Map<String, String> map = AreaViewProvinceActivity.getAreaInfo();
			provinceName = map.get("name");
			provinceCode = map.get("code");
			cityBtn.setText(provinceName);
		}
		
	}
	
	/**
	 * 加载子Activity
	 * 
	 * @param tag
	 * @param intent
	 */
	private void customStartActivity(String tag, Intent intent) {
		if (currentTag != null) {
			View currentView = childViews.get(currentTag);
			if (currentView != null)
				currentView.setVisibility(View.GONE);
		}
		currentTag = tag;
		View originView = childViews.get(tag);
		final Window window = getLocalActivityManager().startActivity(tag,
				intent);
		final View decorView = window.getDecorView();
		if (decorView != originView && originView != null) {
			if (originView.getParent() != null)
				((ViewGroup) originView.getParent()).removeView(originView);
		}
		childViews.put(tag, decorView);
		if (decorView != null) {
			decorView.setVisibility(View.VISIBLE);
			decorView.setFocusableInTouchMode(true);
			((ViewGroup) decorView)
					.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
			if (decorView.getParent() == null) {
				container.addView(decorView, new LinearLayout.LayoutParams(
						ViewGroup.LayoutParams.MATCH_PARENT,
						ViewGroup.LayoutParams.FILL_PARENT));
			}
			decorView.requestFocus();
		}
	}

}
