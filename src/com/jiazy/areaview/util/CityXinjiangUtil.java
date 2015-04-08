package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityXinjiangUtil extends CityUtil{
	private String aletai = "ffe7e7e7";
	private String tacheng = "ffe0e0e0";
	private String kelamayi = "ffd0d0d0";
	private String changji = "ffd8d8d8";
	private String bozhou = "ffc1c1c1";
	private String yili = "ffbbbbbb";
	private String wulumuqi = "ffc8c8c8";
	private String tulufan = "ffb6b6b6";
	private String hami = "ffb1b1b1";
	private String akesu = "ffacacac";
	private String bazhou = "ffa7a7a7";
	private String kezhou = "ffa1a1a1";
	private String kashi = "ff9c9c9c";
	private String hetian = "ff979797";
	
	/*  650100=乌鲁木齐市
		650200=克拉玛依市
		652100=吐鲁番地区
		652200=哈密地区
		652300=昌吉州
		652700=博尔塔拉蒙古自治州
		652800=巴音郭楞蒙古自治州
		652900=阿克苏地区
		653000=克州
		653100=喀什地区
		653200=和田地区
		654000=伊犁州
		654200=塔城地区
		654300=阿勒泰地区
		659000=省直辖行政单位*/
	@Override
	public void setAreaViewValue(Context context, AreaView itemView, String colorStr){
		Bitmap bitmap = null;
		if (wulumuqi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_wulumuqi);
			itemView.setTag("650100=乌鲁木齐市");
		} else if (aletai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_aletai);
			itemView.setTag("654300=阿勒泰地区");
		} else if (tacheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_tacheng);
			itemView.setTag("654200=塔城地区");
		} else if (kelamayi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_kelamayi);
			itemView.setTag("650200=克拉玛依市");
		} else if (changji.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_changji);
			itemView.setTag("652300=昌吉州");
		} else if (bozhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_bozhou);
			itemView.setTag("652700=博尔塔拉蒙古自治州");
		} else if (yili.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_yili);
			itemView.setTag("654000=伊犁州");
		} else if (tulufan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_tulufan);
			itemView.setTag("652100=吐鲁番地区");
		} else if (hami.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_hami);
			itemView.setTag("652200=哈密地区");
		} else if (akesu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_akesu);
			itemView.setTag("652900=阿克苏地区");
		} else if (bazhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_bazhou);
			itemView.setTag("652800=巴音郭楞蒙古自治州");
		} else if (kezhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_kezhou);
			itemView.setTag("653000=克州");
		} else if (kashi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_kashi);
			itemView.setTag("653100=喀什地区");
		} else if (hetian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xinj_hetian);
			itemView.setTag("653200=和田地区");
		} else {
			itemView.setTag("");
		}
		
		itemView.setImageBitmap(bitmap);
		
	}
	
}
