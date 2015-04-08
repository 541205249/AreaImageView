package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityZhejiangUtil extends CityUtil {
	
	private String huzhou = "ffdcdddd";
	private String jiaxing = "ffd9d9da";
	private String hangzhou = "ffd5d5d6";
	private String shaoxing = "ffd1d1d2";
	private String ningbo = "ffcdcece";
	private String quzhou = "ffc1c2c2";
	private String jinhua = "ffc9caca";
	private String taizhou = "ffc5c6c6";
	private String lishui = "ffbdbebe";
	private String wenzhou = "ffb9baba";

	/* 330500 = 湖州
	 * 330400 = 嘉兴
	 * 330100 = 杭州
	 * 330600 = 绍兴
	 * 330200 = 宁波
	 * 330800 = 衢州
	 * 330700 = 金华
	 * 331000 = 台州
	 * 331100 = 丽水
	 * 330300 = 温州
	 */
	
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (huzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_huzhou);
			itemView.setTag("330500=湖州市 ");
		} else if (jiaxing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_jiaxing);
			itemView.setTag("330400=嘉兴市 ");
		} else if (hangzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_hangzhou);
			itemView.setTag("330100=杭州市");
		} else if (shaoxing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_shaoxing);
			itemView.setTag("330600=绍兴市");
		} else if (ningbo.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_ningbo);
			itemView.setTag("330200=宁波市");
		} else if (quzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_quzhou);
			itemView.setTag("330800=衢州市");
		} else if (jinhua.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_jinhua);
			itemView.setTag("330700=金华市");
		} else if (taizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_taizhou);
			itemView.setTag("331000=台州市");
		} else if (lishui.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_lishui);
			itemView.setTag("331100=丽水市");
		} else if (wenzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_zhej_wenzhou);
			itemView.setTag("330300=温州市");
		}else {
			itemView.setTag("");
		}
		itemView.setImageBitmap(bitmap);
	}

}
