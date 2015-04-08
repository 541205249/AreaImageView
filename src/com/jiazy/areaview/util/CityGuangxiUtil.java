package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityGuangxiUtil extends CityUtil {
	private String nanning = "ffc8c8c8";
	private String liuzhou = "ffaeaeae";
	private String guilin = "ff9f9f9f";
	private String wuzhou = "ff949494";
	private String beihai = "ffb4b4b4";
	private String fangchenggang = "ffbebebe";
	private String qinzhou = "ffb9b9b9";
	private String guigang = "ffa9a9a9";
	private String yulin = "ffa4a4a4";
	private String baise = "ffcecece";
	private String hezhou = "ff9a9a9a";
	private String hechi = "ffc3c3c3";

	 /*450100=南宁市                                              
		450200=柳州市                                              
		450300=桂林市                                              
		450400=梧州市                                              
		450500=北海市                                              
		450600=防城港市                                            
		450700=钦州市                                              
		450800=贵港市                                              
		450900=玉林市                                              
		451000=百色市                                              
		451100=贺州市                                              
		451200=河池市   
		                                           
		451300=来宾市                                              
		451400=崇左市
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (nanning.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_nanning);
			itemView.setTag("450100=南宁市");
		} else if (liuzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_liuzhou);
			itemView.setTag("450200=柳州市");
		} else if (guilin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_guilin);
			itemView.setTag("450300=桂林市");
		} else if (wuzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_wuzhou);
			itemView.setTag("450400=梧州市");
		} else if (beihai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_beihai);
			itemView.setTag("450500=北海市");
		} else if (fangchenggang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_fangchenggang);
			itemView.setTag("450600=防城港市");
		} else if (qinzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_qinzhou);
			itemView.setTag("450700=钦州市");
		} else if (guigang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_guigang);
			itemView.setTag("450800=贵港市");
		} else if (yulin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_yulin);
			itemView.setTag("450900=玉林市");
		} else if (baise.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_baise);
			itemView.setTag("451000=百色市");
		} else if (hezhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_hezhou);
			itemView.setTag("451100=贺州市");
		} else if (hechi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangx_hechi);
			itemView.setTag("451200=河池市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
