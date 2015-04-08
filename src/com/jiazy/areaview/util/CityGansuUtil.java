package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityGansuUtil extends CityUtil {
	private String jiayuguan = "ffc8c8c8";
	private String jinchang = "ffbebebe";
	private String baiyin = "ffb4b4b4";
	private String tianshui = "ff9a9a9a";
	private String wuwei = "ffb9b9b9";
	private String zhangye = "ffc3c3c3";
	private String pingliang = "ff949494";
	private String jiuquan = "ffcecece";
	private String qingyang = "ff8f8f8f";
	private String dingxi = "ffa4a4a4";
	private String linxia = "ffa9a9a9";
	private String lanzhou = "ffaeaeae";
	private String longnan = "ff8a8a8a";
	private String gannan = "ff9f9f9f";

	/*
	 * 620100=兰州市         
	 * 620200=嘉峪关市 
	 * 620300=金昌市 
	 * 620400=白银市 
	 * 620500=天水市 
	 * 620600=武威市
	 * 620700=张掖市 
	 * 620800=平凉市 
	 * 620900=酒泉市   
	 * 621000=庆阳市 
	 * 621100=定西市 
	 * 621200=陇南市        
	 * 622900=临夏州 
	 * 623000=甘南州
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (lanzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_lanzhou);
			itemView.setTag("620100=兰州市");
		} else if (jiayuguan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_jiayuguan);
			itemView.setTag("620200=嘉峪关市 ");
		} else if (jinchang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_jinchang);
			itemView.setTag("620300=金昌市 ");
		} else if (baiyin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_baiyin);
			itemView.setTag("620400=白银市 ");
		} else if (tianshui.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_tianshui);
			itemView.setTag("620500=天水市 ");
		} else if (wuwei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_wuwei);
			itemView.setTag("620600=武威市");
		} else if (zhangye.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_zhangye);
			itemView.setTag("620700=张掖市");
		} else if (pingliang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_pingliang);
			itemView.setTag("620800=平凉市");
		} else if (jiuquan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_jiuquan);
			itemView.setTag("620900=酒泉市");
		} else if (qingyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_qingyang);
			itemView.setTag("621000=庆阳市");
		} else if (dingxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_dingxi);
			itemView.setTag("621100=定西市");
		} else if (longnan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_longnan);
			itemView.setTag("621200=陇南市");
		} else if (linxia.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_linxia);
			itemView.setTag("622900=临夏州");
		} else if (gannan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_gans_gannan);
			itemView.setTag("623000=甘南州");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
