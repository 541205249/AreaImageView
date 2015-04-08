package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityShanxishengUtil extends CityUtil {
	private String xian = "ffaeaeae";
	private String tongchuan = "ffc3c3c3";
	private String baoji = "ffb4b4b4";
	private String xianyang = "ffb9b9b9";
	private String weinan = "ffbebebe";
	private String yanan = "ffc8c8c8";
	private String hanzhong = "ffa4a4a4";
	private String yulin = "ffcecece";
	private String ankang = "ff9f9f9f";
	private String shangluo = "ffa9a9a9";

	 /*610100=西安市                                              
		610200=铜川市                                              
		610300=宝鸡市                                              
		610400=咸阳市                                              
		610500=渭南市                                              
		610600=延安市                                              
		610700=汉中市                                              
		610800=榆林市                                              
		610900=安康市                                              
		611000=商洛市 
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (xian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_xian);
			itemView.setTag("610100=西安市");
		} else if (tongchuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_tongchuan);
			itemView.setTag("610200=铜川市");
		} else if (baoji.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_baoji);
			itemView.setTag("610300=宝鸡市");
		} else if (xianyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_xianyang);
			itemView.setTag("610400=咸阳市");
		} else if (weinan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_weinan);
			itemView.setTag("610500=渭南市");
		} else if (yanan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_yanan);
			itemView.setTag("610600=延安市");
		} else if (hanzhong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_hanzhong);
			itemView.setTag("610700=汉中市");
		} else if (yulin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_yulin);
			itemView.setTag("610800=榆林市");
		} else if (ankang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_ankang);
			itemView.setTag("610900=安康市");
		} else if (shangluo.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxs_shangluo);
			itemView.setTag("611000=商洛市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
