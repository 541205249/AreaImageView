package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityAnhuiUtil extends CityUtil {
	private String hefei = "ffc1c2c2";
	private String wuhu = "ffacadae";
	private String bengbu = "ffd1d1d2";
	private String huainan = "ffc9caca";
	private String maanshan = "ffb6b8b8";
	private String huaibei = "ffd9d9da";
	private String tongling = "ffb1b1b2";
	private String anqing = "ffb5b5b6";
	private String huangshan = "ff9fa0a0";
	private String chuzhou = "ffc5c6c6";
	private String fuyang = "ffcdcece";
	private String suzhou = "ffdcdddd";
	private String chaohu = "ffb9baba";
	private String luan = "ffbdbebe";
	private String bozhou = "ffd5d5d6";
	private String chizhou = "ffa8a9a9";
	private String xuancheng = "ffa4a4a5";

	 /*340100=合肥市                                            
		340200=芜湖市                                            
		340300=蚌埠市                                            
		340400=淮南市                                            
		340500=马鞍山市                                          
		340600=淮北市                                            
		340700=铜陵市                                            
		340800=安庆市                                            
		341000=黄山市                                            
		341100=滁州市                                            
		341200=阜阳市                                            
		341300=宿州市                                            
		341400=巢湖市                                            
		341500=六安市                                            
		341600=亳州市                                            
		341700=池州市                                            
		341800=宣城市                                            
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (hefei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_hefei);
			itemView.setTag("340100=合肥市");
		} else if (wuhu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_wuhu);
			itemView.setTag("340200=芜湖市");
		} else if (bengbu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_bengbu);
			itemView.setTag("340300=蚌埠市");
		} else if (huainan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_huainan);
			itemView.setTag("340400=淮南市");
		} else if (maanshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_maanshan);
			itemView.setTag("340500=马鞍山市");
		} else if (huaibei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_huaibei);
			itemView.setTag("340600=淮北市");
		} else if (tongling.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_tongling);
			itemView.setTag("340700=铜陵市");
		} else if (anqing.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_anqing);
			itemView.setTag("340800=安庆市");
		} else if (huangshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_huangshan);
			itemView.setTag("341000=黄山市");
		} else if (chuzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_chuzhou);
			itemView.setTag("341100=滁州市");
		} else if (fuyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_fuyang);
			itemView.setTag("341200=阜阳市");
		} else if (suzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_suzhou);
			itemView.setTag("341300=宿州市");
		} else if (chaohu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_chaohu);
			itemView.setTag("341400=巢湖市");
		} else if (luan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_luan);
			itemView.setTag("341500=六安市");
		} else if (bozhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_bozhou);
			itemView.setTag("341600=亳州市");
		} else if (chizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_chizhou);
			itemView.setTag("341700=池州市");
		} else if (xuancheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_anh_xuancheng);
			itemView.setTag("341800=宣城市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
