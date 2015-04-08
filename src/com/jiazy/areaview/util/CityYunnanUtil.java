package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityYunnanUtil extends CityUtil {
	
	private String diqing = "ffdcdddd";
	private String nujiang = "ffd9d9da";
	private String lijiang = "ffd1d1d2";
	private String dali = "ffcdcece";
	private String baoshan = "ffc9caca";
	private String dehong = "ffc5c6c6";
	private String lincang = "ffbdbebe";
	private String chuxiong = "ffc1c2c2";
	private String puershi = "ffa4a4a5";
	private String yuxi = "ffb1b1b2";
	private String kunming = "ffb9baba";
	private String xishuangbanna = "ff9fa0a0";
	private String honghe = "ffa8a9a9";
	private String wenshan = "ffacadae";
	private String qujing = "ffb5b5b6";
	private String zhaotong = "ffd5d5d6";

	/* 533400 = 迪庆
	 * 533300 = 怒江
	 * 530700 = 丽江
	 * 532900 = 大理
	 * 530500 = 保山
	 * 533100 = 德宏
	 * 530900 = 临沧
	 * 532300 = 楚雄
	 * 530800 = 普洱市（思茅市）
	 * 530400 = 玉溪
	 * 530100 = 昆明
	 * 532800 = 西双版纳
	 * 532500 = 红河
	 * 532600 = 文山
	 * 530300 = 曲靖
	 * 530600 = 昭通
	 */
	
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (diqing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_diqing);
			itemView.setTag("533400=迪庆州 ");
		} else if (nujiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_nujiang);
			itemView.setTag("533300=怒江州 ");
		} else if (lijiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_lijiang);
			itemView.setTag("530700=丽江市");
		} else if (dali.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_dali);
			itemView.setTag("532900=大理州");
		} else if (baoshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_baoshan);
			itemView.setTag("530500=保山市");
		} else if (dehong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_dehong);
			itemView.setTag("533100=德宏州");
		} else if (lincang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_lincang);
			itemView.setTag("530900=临沧市");
		} else if (chuxiong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_chuxiong);
			itemView.setTag("532300=楚雄州");
		} else if (puershi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_puershi);
			itemView.setTag("530800=思茅市");
		} else if (yuxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_yuxi);
			itemView.setTag("530400=玉溪市");
		} else if (kunming.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_kunming);
			itemView.setTag("530100=昆明市");
		} else if (xishuangbanna.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_xishuangbanna);
			itemView.setTag("532800=西双版纳州");
		} else if (honghe.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_honghe);
			itemView.setTag("532500=红河州");
		} else if (wenshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_wenshan);
			itemView.setTag("532600=文山州");
		} else if (qujing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_qujing);
			itemView.setTag("530300=曲靖市");
		}  else if (zhaotong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_yunn_zhaotong);
			itemView.setTag("530600=昭通市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
