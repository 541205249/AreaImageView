package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityJiangsuUtil extends CityUtil {
	private String nanjing = "ffb9baba";
	private String wuxi = "ffacadae";
	private String xuzhou = "ffdcdddd";
	private String changzhou = "ffb1b1b2";
	private String suzhou = "ffa4a4a5";
	private String nantong = "ffbdbebe";
	private String lianyungang = "ffd9d9da";
	private String huaian = "ffd1d1d2";
	private String yancheng = "ffc9caca";
	private String yangzhou = "ffc5c6c6";
	private String zhenjiang = "ffb5b5b6";
	private String taizhou = "ffc1c2c2";
	private String suqian = "ffd5d5d6";

	/* 320100=南京市                                              
		320200=无锡市                                              
		320300=徐州市                                              
		320400=常州市                                              
		320500=苏州市                                              
		320600=南通市                                              
		320700=连云港市                                            
		320800=淮安市                                              
		320900=盐城市                                              
		321000=扬州市                                              
		321100=镇江市                                              
		321200=泰州市                                              
		321300=宿迁市 
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (nanjing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_nanjing);
			itemView.setTag("320100=南京市");
		} else if (wuxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_wuxi);
			itemView.setTag("320200=无锡市");
		} else if (xuzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_xuzhou);
			itemView.setTag("320300=徐州市");
		} else if (changzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_changzhou);
			itemView.setTag("320400=常州市");
		} else if (suzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_suzhou);
			itemView.setTag("320500=苏州市");
		} else if (nantong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_nantong);
			itemView.setTag("320600=南通市");
		} else if (lianyungang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_lianyungang);
			itemView.setTag("320700=连云港市");
		} else if (huaian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_huaian);
			itemView.setTag("320800=淮安市");
		} else if (yancheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_yancheng);
			itemView.setTag("320900=盐城市");
		} else if (yangzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_yangzhou);
			itemView.setTag("321000=扬州市");
		} else if (zhenjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_zhenjiang);
			itemView.setTag("321100=镇江市");
		} else if (taizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_taizhou);
			itemView.setTag("321200=泰州市");
		} else if (suqian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangs_suqian);
			itemView.setTag("321300=宿迁市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
