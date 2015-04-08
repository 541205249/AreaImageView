package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityGuangdongUtil extends CityUtil {
	private String guangzhou = "ffb6b6b6";
	private String shaoguan = "ffa9a9a9";
	private String shenzhen = "ffaeaeae";
	private String zhuhai = "ffbebebe";
	private String shantou = "ff9a9a9a";
	private String foshan = "ffbbbbbb";
	private String jiangmen = "ffc3c3c3";
	private String zhanjiang = "ffcecece";
	private String maoming = "ffcbcbcb";
	private String zhaoqing = "ffc1c1c1";
	private String huizhou = "ffacacac";
	private String meizhou = "ff9f9f9f";
	private String shanwei = "ffa4a4a4";
	private String heyuan = "ffa7a7a7";
	private String yangjiang = "ffc6c6c6";
	private String qingyuan = "ffb4b4b4";
	private String dongguan = "ffb1b1b1";
	private String zhongshan = "ffb9b9b9";
	private String chaozhou = "ff9c9c9c";
	private String jieyang = "ffa1a1a1";
	private String yunfu = "ffc8c8c8";

	 /*440100=广州市                                              
		440200=韶关市                                              
		440300=深圳市                                              
		440400=珠海市                                              
		440500=汕头市                                              
		440600=佛山市                                              
		440700=江门市                                              
		440800=湛江市                                              
		440900=茂名市                                              
		441200=肇庆市                                              
		441300=惠州市                                              
		441400=梅州市                                              
		441500=汕尾市                                              
		441600=河源市                                              
		441700=阳江市                                              
		441800=清远市                                              
		441900=东莞市                                              
		442000=中山市                                              
		445100=潮州市                                              
		445200=揭阳市                                              
		445300=云浮市
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (guangzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_guangzhou);
			itemView.setTag("440100=广州市");
		} else if (shaoguan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_shaoguan);
			itemView.setTag("440200=韶关市");
		} else if (shenzhen.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_shenzhen);
			itemView.setTag("440300=深圳市");
		} else if (zhuhai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_zhuhai);
			itemView.setTag("440400=珠海市");
		} else if (shantou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_shantou);
			itemView.setTag("440500=汕头市");
		} else if (foshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_foshan);
			itemView.setTag("440600=佛山市");
		} else if (jiangmen.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_jiangmen);
			itemView.setTag("440700=江门市");
		} else if (zhanjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_zhanjiang);
			itemView.setTag("440800=湛江市");
		} else if (maoming.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_maoming);
			itemView.setTag("440900=茂名市");
		} else if (zhaoqing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_zhaoqing);
			itemView.setTag("441200=肇庆市");
		} else if (huizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_huizhou);
			itemView.setTag("441300=惠州市");
		} else if (meizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_meizhou);
			itemView.setTag("441400=梅州市");
		} else if (shanwei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_shanwei);
			itemView.setTag("441500=汕尾市");
		} else if (heyuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_heyuan);
			itemView.setTag("441600=河源市");
		} else if (yangjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_yangjiang);
			itemView.setTag("441700=阳江市");
		} else if (qingyuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_qingyuan);
			itemView.setTag("441800=清远市");
		} else if (dongguan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_dongguan);
			itemView.setTag("441900=东莞市");
		} else if (zhongshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_zhongshan);
			itemView.setTag("442000=中山市");
		} else if (chaozhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_chaozhou);
			itemView.setTag("445100=潮州市");
		} else if (jieyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_jieyang);
			itemView.setTag("445200=揭阳市");
		} else if (yunfu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guangd_yunfu);
			itemView.setTag("445300=云浮市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
