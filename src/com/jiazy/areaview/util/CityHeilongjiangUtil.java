package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityHeilongjiangUtil extends CityUtil {
	private String haerbin = "ffaeaeae";
	private String qiqihaer = "ffc3c3c3";
	private String jixi = "ff949494";
	private String hegang = "ff9a9a9a";
	private String shuangyashan = "ff8f8f8f";
	private String daqing = "ffbebebe";
	private String yichun = "ffb4b4b4";
	private String jiamusi = "ff9f9f9f";
	private String qitaihe = "ffa4a4a4";
	private String mudanjiang = "ffa9a9a9";
	private String heihe = "ffc8c8c8";
	private String suihua = "ffb9b9b9";
	private String daxinganling = "ffcecece";

	 /*230100=哈尔滨市                                            
		230200=齐齐哈尔市                                          
		230300=鸡西市                                              
		230400=鹤岗市                                              
		230500=双鸭山市                                            
		230600=大庆市                                              
		230700=伊春市                                              
		230800=佳木斯市                                            
		230900=七台河市                                            
		231000=牡丹江市                                            
		231100=黑河市                                              
		231200=绥化市                                              
		232700=大兴安岭地区
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (haerbin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_haerbin);
			itemView.setTag("230100=哈尔滨市");
		} else if (qiqihaer.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_qiqihaer);
			itemView.setTag("230200=齐齐哈尔市");
		} else if (jixi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_jixi);
			itemView.setTag("230300=鸡西市");
		} else if (hegang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_hegang);
			itemView.setTag("230400=鹤岗市");
		} else if (shuangyashan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_shuangyashan);
			itemView.setTag("230500=双鸭山市");
		} else if (daqing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_daqing);
			itemView.setTag("230600=大庆市");
		} else if (yichun.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_yichun);
			itemView.setTag("230700=伊春市");
		} else if (jiamusi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_jiamusi);
			itemView.setTag("230800=佳木斯市");
		} else if (qitaihe.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_qitai);
			itemView.setTag("230900=七台河市");
		} else if (mudanjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_mudanjiang);
			itemView.setTag("231000=牡丹江市");
		} else if (heihe.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_heihe);
			itemView.setTag("231100=黑河市");
		} else if (suihua.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_suihua);
			itemView.setTag("231200=绥化市");
		} else if (daxinganling.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heilj_daxinganling);
			itemView.setTag("232700=大兴安岭地区");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
