package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityShandongUtil extends CityUtil {
	private String jinan = "ffb9b9b9";
	private String qingdao = "ffa9a9a9";
	private String zibo = "ffb4b4b4";
	private String zaozhuang = "ff858585";
	private String dongying = "ffc3c3c3";
	private String yantai = "ffa4a4a4";
	private String weifang = "ffaeaeae";
	private String jining = "ff8a8a8a";
	private String taian = "ff949494";
	private String weihai = "ff9f9f9f";
	private String rizhao = "ff7a7a7a";
	private String laiwu = "ff9a9a9a";
	private String linyi = "ff7f7f7f";
	private String dezhou = "ffcecece";
	private String liaocheng = "ffbebebe";
	private String binzhou = "ffc8c8c8";
	private String heze = "ff8f8f8f";

	 /*370100=济南市                                            
		370200=青岛市                                            
		370300=淄博市                                            
		370400=枣庄市                                            
		370500=东营市                                            
		370600=烟台市                                            
		370700=潍坊市                                            
		370800=济宁市                                            
		370900=泰安市                                            
		371000=威海市                                            
		371100=日照市                                            
		371200=莱芜市                                            
		371300=临沂市                                            
		371400=德州市                                            
		371500=聊城市                                            
		371600=滨州市                                            
		371700=菏泽市
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (jinan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_jinan);
			itemView.setTag("370100=济南市");
		} else if (qingdao.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_qingdao);
			itemView.setTag("370200=青岛市");
		} else if (zibo.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_zibo);
			itemView.setTag("370300=淄博市");
		} else if (zaozhuang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_zaozhuang);
			itemView.setTag("370400=枣庄市");
		} else if (dongying.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_dongying);
			itemView.setTag("370500=东营市");
		} else if (yantai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_yantai);
			itemView.setTag("370600=烟台市");
		} else if (weifang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_weifang);
			itemView.setTag("370700=潍坊市");
		} else if (jining.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_jining);
			itemView.setTag("370800=济宁市");
		} else if (taian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_taian);
			itemView.setTag("370900=泰安市");
		} else if (weihai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_weihai);
			itemView.setTag("371000=威海市");
		} else if (rizhao.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_rizhao);
			itemView.setTag("371100=日照市");
		} else if (laiwu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_laiwu);
			itemView.setTag("371200=莱芜市");
		} else if (linyi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_linyi);
			itemView.setTag("371300=临沂市");
		} else if (dezhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_dezhou);
			itemView.setTag("371400=德州市");
		} else if (liaocheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_liaocheng);
			itemView.setTag("371500=聊城市");
		} else if (binzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_binzhou);
			itemView.setTag("371600=滨州市");
		} else if (heze.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shand_heze);
			itemView.setTag("371700=菏泽市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
