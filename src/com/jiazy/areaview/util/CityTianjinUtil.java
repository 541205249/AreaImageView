package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityTianjinUtil extends CityUtil {
	private String tianjinshiqu = "ffb4b4b4";
	
	private String tanggu = "ffaeaeae";
	private String hangu = "ffb9b9b9";
	private String dagang = "ff9f9f9f";
	private String jinnan = "ffa9a9a9";
	private String wuqing = "ffbebebe";
	private String baodi = "ffc8c8c8";
	private String ninghe = "ffc3c3c3";
	private String jinghai = "ffa4a4a4";
	private String jixian = "ffcecece";

	 /*120101=和平区                                              
		120102=河东区                                              
		120103=河西区                                              
		120104=南开区                                              
		120105=河北区                                              
		120106=红桥区
		120110=东丽区                                              
		120111=西青区  
		120113=北辰区                                              
		                                            
		120107=塘沽区                                              
		120108=汉沽区                                              
		120109=大港区                                              
		120112=津南区                                              
		120114=武清区                                              
		120115=宝坻区                                              
		120221=宁河县                                              
		120223=静海县                                              
		120225=蓟县 
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (tanggu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_tanggu);
			itemView.setTag("120107=塘沽区");
		} else if (hangu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_hangu);
			itemView.setTag("120108=汉沽区");
		} else if (dagang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_dagang);
			itemView.setTag("120109=大港区");
		} else if (jinnan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_jinnan);
			itemView.setTag("120112=津南区");
		} else if (wuqing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_wuqing);
			itemView.setTag("120114=武清区");
		} else if (baodi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_baodi);
			itemView.setTag("120115=宝坻区");
		} else if (ninghe.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_ninghe);
			itemView.setTag("120221=宁河县");
		} else if (jinghai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_jinghai);
			itemView.setTag("120223=静海县");
		} else if (jixian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_jixian);
			itemView.setTag("120225=蓟县");
		} else if (tianjinshiqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_tianj_tianjinchengqu);
			itemView.setTag("");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
