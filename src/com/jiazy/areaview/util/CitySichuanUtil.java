package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CitySichuanUtil extends CityUtil {
	private String chengdu = "ffd1d1d2";
	private String zigong = "ffa0a4a7";
	private String panzhihua = "ffbdbebe";
	private String luzhou = "ff929292";
	private String deyang = "ffcdcece";
	private String mianyang = "ffc9caca";
	private String guangyuan = "ffc5c6c6";
	private String suining = "ff9b9ba1";
	private String neijiang = "ffacadae";
	private String leshan = "ffb9baba";
	private String nanchong = "ffa2a3a3";
	private String meishan = "ffb5b5b6";
	private String yibin = "ffb1b1b2";
	private String guangan = "ff9fa0a0";
	private String dazhou = "ff969797";
	private String yaan = "ffd5d5d6";
	private String bazhong = "ff9b9b9c";
	private String ziyang = "ffa8a9a9";
	private String abazhou = "ffd9d9da";
	private String ganzizhou = "ffdcdddd";
	private String liangshan = "ffc1c2c2";

	/* 510100=成都市                                              
		510300=自贡市                                              
		510400=攀枝花市                                            
		510500=泸州市                                              
		510600=德阳市                                              
		510700=绵阳市                                              
		510800=广元市                                              
		510900=遂宁市                                              
		511000=内江市                                              
		511100=乐山市                                              
		511300=南充市                                            
		511400=眉山市                                              
		511500=宜宾市                                              
		511600=广安市                                              
		511700=达州市                                              
		511800=雅安市                                              
		511900=巴中市                                              
		512000=资阳市                                              
		513200=阿坝州                                              
		513300=甘孜藏族自治州                                      
		513400=凉山州
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (chengdu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_chengdu);
			itemView.setTag("510100=成都市");
		} else if (zigong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_zigong);
			itemView.setTag("510300=自贡市");
		} else if (panzhihua.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_panzhihua);
			itemView.setTag("510400=攀枝花市");
		} else if (luzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_luzhou);
			itemView.setTag("510500=泸州市");
		} else if (deyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_deyang);
			itemView.setTag("510600=德阳市");
		} else if (mianyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_mianyang);
			itemView.setTag("510700=绵阳市");
		} else if (guangyuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_guangyuan);
			itemView.setTag("510800=广元市");
		} else if (suining.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_suining);
			itemView.setTag("510900=遂宁市");
		} else if (neijiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_neijiang);
			itemView.setTag("511000=内江市");
		} else if (leshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_leshan);
			itemView.setTag("511100=乐山市");
		} else if (nanchong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_nanchong);
			itemView.setTag("511300=南充市");
		} else if (meishan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_meishan);
			itemView.setTag("511400=眉山市");
		} else if (yibin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_yibin);
			itemView.setTag("511500=宜宾市");
		} else if (guangan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_guangan);
			itemView.setTag("511600=广安市");
		} else if (dazhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_dazhou);
			itemView.setTag("511700=达州市");
		} else if (yaan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_yaan);
			itemView.setTag("511800=雅安市");
		} else if (bazhong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_bazhong);
			itemView.setTag("511900=巴中市");
		} else if (ziyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_ziyang);
			itemView.setTag("512000=资阳市");
		} else if (abazhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_abazhou);
			itemView.setTag("513200=阿坝州");
		} else if (ganzizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_ganzizhou);
			itemView.setTag("513300=甘孜藏族自治州");
		} else if (liangshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_sic_liangshanzhou);
			itemView.setTag("513400=凉山州");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
