package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityJiangxiUtil extends CityUtil {
	private String nanchang = "ffd1d1d2";
	private String jingdezhen = "ffd5d5d6";
	private String pingxiang = "ffc5c6c6";
	private String jiujiang = "ffdcdddd";
	private String xinyu = "ffc9caca";
	private String yingtan = "ffc1c2c2";
	private String ganzhou = "ffb5b5b6";
	private String jian = "ffb9baba";
	private String yichun = "ffcdcece";
	private String fuzhou = "ffbdbebe";
	private String shangrao = "ffd9d9da";

	/* 360100=南昌市                                              
		360200=景德镇市                                            
		360300=萍乡市                                              
		360400=九江市                                              
		360500=新余市                                              
		360600=鹰潭市                                              
		360700=赣州市                                              
		360800=吉安市                                              
		360900=宜春市                                              
		361000=抚州市                                              
		361100=上饶市
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (nanchang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_nanchang);
			itemView.setTag("360100=南昌市");
		} else if (jingdezhen.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_jingdezhen);
			itemView.setTag("360200=景德镇市");
		} else if (pingxiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_pingxiang);
			itemView.setTag("360300=萍乡市");
		} else if (jiujiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_jiujiang);
			itemView.setTag("360400=九江市");
		} else if (xinyu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_xinyu);
			itemView.setTag("360500=新余市");
		} else if (yingtan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_yingtan);
			itemView.setTag("360600=鹰潭市");
		} else if (ganzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_ganzhou);
			itemView.setTag("360700=赣州市");
		} else if (jian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_jian);
			itemView.setTag("360800=吉安市");
		} else if (yichun.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_yichun);
			itemView.setTag("360900=宜春市");
		} else if (fuzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_fuzhou);
			itemView.setTag("361000=抚州市");
		} else if (shangrao.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangx_shangrao);
			itemView.setTag("361100=上饶市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
