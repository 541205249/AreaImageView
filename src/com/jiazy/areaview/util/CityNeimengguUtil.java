package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityNeimengguUtil extends CityUtil {
	private String huhehaote = "ffb4b4b4";
	private String baotou = "ffb9b9b9";
	private String wuhai = "ffc8c8c8";
	private String chifeng = "ffa4a4a4";
	private String tongliao = "ff9f9f9f";
	private String eerduosi = "ffbebebe";
	private String hulunbeier = "ff949494";
	private String bayannaoer = "ffc3c3c3";
	private String wulanchabu = "ffaeaeae";
	private String xingan = "ff9a9a9a";
	private String xilinguole = "ffa9a9a9";
	private String alashan = "ffcecece";

	 /*150100=呼和浩特市                                        
		150200=包头市                                            
		150300=乌海市                                            
		150400=赤峰市                                            
		150500=通辽市                                            
		150600=鄂尔多斯市                                        
		150700=呼伦贝尔市                                        
		150800=巴彦淖尔市                                        
		150900=乌兰察布市                                
		152200=兴安盟          乌兰浩特市                                       
		152500=锡林郭勒盟                                        
		152900=阿拉善盟 
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (huhehaote.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_huhehaote);
			itemView.setTag("150100=呼和浩特市");
		} else if (baotou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_baotou);
			itemView.setTag("150200=包头市");
		} else if (wuhai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_wuhai);
			itemView.setTag("150300=乌海市");
		} else if (chifeng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_chifeng);
			itemView.setTag("150400=赤峰市");
		} else if (tongliao.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_tongliao);
			itemView.setTag("150500=通辽市");
		} else if (eerduosi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_eerduosi);
			itemView.setTag("150600=鄂尔多斯市");
		} else if (hulunbeier.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_hulunbeier);
			itemView.setTag("150700=呼伦贝尔市");
		} else if (bayannaoer.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_bayannaoer);
			itemView.setTag("150800=巴彦淖尔市");
		} else if (wulanchabu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_wulanchabu);
			itemView.setTag("150900=乌兰察布市");
		} else if (xingan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_wulanhaote);
			itemView.setTag("152200=兴安盟");
		} else if (xilinguole.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_xilinhaote);
			itemView.setTag("152500=锡林郭勒盟");
		} else if (alashan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_neimg_alashanzuoqi);
			itemView.setTag("152900=阿拉善盟");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
