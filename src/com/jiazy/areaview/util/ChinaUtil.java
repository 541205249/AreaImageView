package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;


public class ChinaUtil extends CityUtil{
	
	/*110000=北京市
			120000=天津市
			130000=河北省
			140000=山西
			150000=内蒙古自治区
			210000=辽宁省
			220000=吉林省
			230000=黑龙江省
			310000=上海市
			320000=江苏省
			330000=浙江省
			340000=安徽省
			350000=福建省
			360000=江西省
			370000=山东省
			410000=河南省
			420000=湖北省
			430000=湖南省
			440000=广东省
			450000=广西壮族自治区
			460000=海南省
			500000=重庆市
			510000=四川省
			520000=贵州省
			530000=云南省
			540000=西藏自治区
			610000=陕西省
			620000=甘肃省
			630000=青海省
			640000=宁夏回族自治区
			650000=新疆维吾尔自治区
			710000=台湾省
			810000=香港特别行政区
			820000=澳门特别行政区*/
	
	private String anhui = "ffc3c7ca";
	private String beijing = "ffd5dee3";
	private String chongqing = "ffb9c3c9";
	private String fujian = "ffafbdb5";
	private String gansu = "ffdcdddd";
	private String guangdong = "ffb2beb5";
	private String guangxi = "ffb6c0b5";
	private String guizhou = "ffb6c0bb";
	private String hainan = "ffabbbae";
	private String hebei = "ffe4e9eb";
	private String heilongjiang = "ffefefef";
	private String henan = "ffcbcfd1";
	private String hubei = "ffbcc4c9";
	private String hunan = "ffb6c1be";
	private String jiangsu = "ffc7cbcd";
	private String jiangxi = "ffb6c1c1";
	private String jilin = "ffebecec";
	private String liaoning = "ffe8e8e8";
	private String neimenggu = "ffe4e4e5";
	private String ningxia = "ffd6dadd";
	private String qinghai = "ffd2d8dc";
	private String shandong = "ffced9df";
	private String shanghai = "ffc0c6c9";
	private String shanxi = "ffd2d6d9";  //山西
	private String shanxisheng = "ffced3d5";//陕西
	private String sichuan = "ffb5c1c8";
	private String taiwan = "ffafbdb2";
	private String tianjin = "ffdde3e7";
	private String xinjiang = "ffe0e1e1";
	private String xizang = "ffced7dc";
	private String yunnan = "ffb6c0b8";
	private String zhejiang = "ffb5c1c3";
	
	@Override
	public void setAreaViewValue(Context context, AreaView itemView, String colorStr){
		Bitmap bitmap = null;
		if (anhui.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_anhui);
			itemView.setTag("340000=安徽省");
		} else if (beijing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_beijing);
			itemView.setTag("110000=北京市");
		} else if (chongqing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_chongqing);
			itemView.setTag("500000=重庆市");
		} else if (fujian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_fujian);
			itemView.setTag("350000=福建省");
		} else if (gansu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_gansu);
			itemView.setTag("620000=甘肃省");
		} else if (guangdong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_guangdong);
			itemView.setTag("440000=广东省");
		} else if (guangxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_guangxi);
			itemView.setTag("450000=广西壮族自治区");
		} else if (guizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_guizhou);
			itemView.setTag("520000=贵州省");
		} else if (hainan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_hainan);
			itemView.setTag("460000=海南省");
		} else if (hebei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_hebei);
			itemView.setTag("130000=河北省");
		} else if (heilongjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_heilongjiang);
			itemView.setTag("230000=黑龙江省");
		} else if (henan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_henan);
			itemView.setTag("410000=河南省");
		} else if (hubei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_hubei);
			itemView.setTag("420000=湖北省");
		} else if (hunan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_hunan);
			itemView.setTag("430000=湖南省");
		} else if (jiangsu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_jiangsu);
			itemView.setTag("320000=江苏省");
		} else if (jiangxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_jiangxi);
			itemView.setTag("360000=江西省");
		} else if (jilin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_jilin);
			itemView.setTag("220000=吉林省");
		} else if (liaoning.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_liaoning);
			itemView.setTag("210000=辽宁省");
		} else if (neimenggu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_neimenggu);
			itemView.setTag("150000=内蒙古自治区");
		} else if (ningxia.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_ningxia);
			itemView.setTag("640000=宁夏回族自治区");
		} else if (qinghai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_qinghai);
			itemView.setTag("630000=青海省");
		} else if (shandong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_shandong);
			itemView.setTag("370000=山东省");
		} else if (shanghai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_shanghai);
			itemView.setTag("310000=上海市");
		} else if (shanxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_shanxi);
			itemView.setTag("140000=山西");
		} else if (shanxisheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_shanxisheng);
			itemView.setTag("610000=陕西省");
		} else if (sichuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_sichuan);
			itemView.setTag("510000=四川省");
		} else if (taiwan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_taiwan);
			itemView.setTag("710000=台湾省");
		} else if (tianjin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_tianjin);
			itemView.setTag("120000=天津市");
		} else if (xinjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_xinjiang);
			itemView.setTag("650000=新疆维吾尔自治区");
		} else if (xizang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_xizang);
			itemView.setTag("540000=西藏自治区");
		} else if (yunnan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_yunnan);
			itemView.setTag("530000=云南省");
		} else if (zhejiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_china_zhejiang);
			itemView.setTag("330000=浙江省");
		} else {
			itemView.setTag("");
		}
		
		itemView.setImageBitmap(bitmap);
		
	}

}
