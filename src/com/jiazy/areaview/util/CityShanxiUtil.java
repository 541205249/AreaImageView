package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityShanxiUtil extends CityUtil {
	private String taiyuan = "ffb9b9b9";
	private String datong = "ffcecece";
	private String yangquan = "ffb4b4b4";
	private String changzhi = "ffa9a9a9";
	private String jincheng = "ff9f9f9f";
	private String shuozhou = "ffc8c8c8";
	private String jinzhong = "ffaeaeae";
	private String yuncheng = "ff9a9a9a";
	private String xinzhou = "ffc3c3c3";
	private String linfen = "ffa4a4a4";
	private String lvliang = "ffbebebe";

	 /*140100=太原市                                              
		140200=大同市                                              
		140300=阳泉市                                              
		140400=长治市                                              
		140500=晋城市                                              
		140600=朔州市                                              
		140700=晋中市                                              
		140800=运城市                                              
		140900=忻州市                                              
		141000=临汾市                                              
		141100=吕梁市  
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (taiyuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_taiyuan);
			itemView.setTag("140100=太原市");
		} else if (datong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_datong);
			itemView.setTag("140200=大同市");
		} else if (yangquan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_yangquan);
			itemView.setTag("140300=阳泉市");
		} else if (changzhi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_changzhi);
			itemView.setTag("140400=长治市");
		} else if (jincheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_jincheng);
			itemView.setTag("140500=晋城市");
		} else if (shuozhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_shuozhou);
			itemView.setTag("140600=朔州市");
		} else if (jinzhong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_jinzhong);
			itemView.setTag("140700=晋中市");
		} else if (yuncheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_yuncheng);
			itemView.setTag("140800=运城市");
		} else if (xinzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_xinzhou);
			itemView.setTag("140900=忻州市");
		} else if (linfen.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_linfen);
			itemView.setTag("141000=临汾市");
		} else if (lvliang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanx_lvliang);
			itemView.setTag("141100=吕梁市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
