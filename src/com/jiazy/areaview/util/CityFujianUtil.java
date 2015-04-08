package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityFujianUtil extends CityUtil {
	private String fuzhou = "ffd1d1d2";
	private String xiamen = "ffc1c2c2";
	private String putian = "ffc9caca";
	private String sanming = "ffd5d5d6";
	private String quanzhou = "ffc5c6c6";
	private String zhangzhou = "ffbdbebe";
	private String nanping = "ffdcdddd";
	private String longyan = "ffcdcece";
	private String ningde = "ffd9d9da";

	/* 350100=福州市                                            
		350200=厦门市                                            
		350300=莆田市                                            
		350400=三明市                                            
		350500=泉州市                                            
		350600=漳州市                                            
		350700=南平市                                            
		350800=龙岩市                                            
		350900=宁德市
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (fuzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_fuzhou);
			itemView.setTag("350100=福州市 ");
		} else if (xiamen.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_xiamen);
			itemView.setTag("350200=厦门市 ");
		} else if (putian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_putian);
			itemView.setTag("350300=莆田市");
		} else if (sanming.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_sanming);
			itemView.setTag("350400=三明市 ");
		} else if (quanzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_quanzhou);
			itemView.setTag("350500=泉州市 ");
		} else if (zhangzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_zhangzhou);
			itemView.setTag("350600=漳州市");
		} else if (nanping.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_nanping);
			itemView.setTag("350700=南平市");
		} else if (longyan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_longyan);
			itemView.setTag("350800=龙岩市");
		} else if (ningde.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_fuj_ningde);
			itemView.setTag("350900=宁德市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
