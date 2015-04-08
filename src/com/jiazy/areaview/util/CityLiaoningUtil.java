package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityLiaoningUtil extends CityUtil {
	private String shenyang = "ffc3c3c3";
	private String dalian = "ff8a8a8a";
	private String anshan = "ff9f9f9f";
	private String fushun = "ffc8c8c8";
	private String benxi = "ffa9a9a9";
	private String dandong = "ff9a9a9a";
	private String jinzhou = "ffb4b4b4";
	private String yingkou = "ff949494";
	private String fuxin = "ffbebebe";
	private String liaoyang = "ffb9b9b9";
	private String panjin = "ffa4a4a4";
	private String tieling = "ffcecece";
	private String chaoyang = "ffaeaeae";
	private String huludao = "ff8f8f8f";

	 /*210100=沈阳市                                              
		210200=大连市                                              
		210300=鞍山市                                              
		210400=抚顺市                                              
		210500=本溪市                                              
		210600=丹东市                                              
		210700=锦州市                                              
		210800=营口市                                              
		210900=阜新市                                              
		211000=辽阳市                                              
		211100=盘锦市                                              
		211200=铁岭市                                              
		211300=朝阳市                                              
		211400=葫芦岛市 
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (shenyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_shenyang);
			itemView.setTag("210100=沈阳市");
		} else if (dalian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_dalian);
			itemView.setTag("210200=大连市");
		} else if (anshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_anshan);
			itemView.setTag("210300=鞍山市");
		} else if (fushun.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_fushun);
			itemView.setTag("210400=抚顺市");
		} else if (benxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_benxi);
			itemView.setTag("210500=本溪市");
		} else if (dandong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_dandong);
			itemView.setTag("210600=丹东市");
		} else if (jinzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_jinzhou);
			itemView.setTag("210700=锦州市");
		} else if (yingkou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_yingkou);
			itemView.setTag("210800=营口市");
		} else if (fuxin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_fuxin);
			itemView.setTag("210900=阜新市");
		} else if (liaoyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_liaoyang);
			itemView.setTag("211000=辽阳市");
		} else if (panjin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_panjin);
			itemView.setTag("211100=盘锦市");
		} else if (tieling.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_tieling);
			itemView.setTag("211200=铁岭市");
		} else if (chaoyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_chaoyang);
			itemView.setTag("211300=朝阳市");
		} else if (huludao.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_liaon_huludao);
			itemView.setTag("211400=葫芦岛市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
