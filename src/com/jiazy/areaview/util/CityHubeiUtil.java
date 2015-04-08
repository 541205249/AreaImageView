package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityHubeiUtil extends CityUtil {
	private String wuhan = "ffb6b6b8";
	private String huangshi = "ffa8a9a9";
	private String shiyan = "ffdcdddd";
	private String yichang = "ffc9caca";
	private String xiangfan = "ffd9d9da";
	private String ezhou = "ffb1b1b2";
	private String jingmen = "ffc7c9c9";
	private String xiaogan = "ffb5b5b6";
	private String jingzhou = "ffc5c6c6";
	private String huanggang = "ffacadae";
	private String xianning = "ffa4a4a5";
	private String suizhou = "ffd1d1d2";
	private String enshi = "ffcdcece";
	private String qianjiang = "ffbdbebe";
	private String tianmen = "ffc1c2c2";
	private String xiantao = "ffb9baba";
	private String shennongjia = "ffd5d5d6";

	/* 420100=武汉市                                            
		420200=黄石市                                            
		420300=十堰市                                            
		420500=宜昌市                                            
		420600=襄樊市                                            
		420700=鄂州市                                            
		420800=荆门市                                            
		420900=孝感市                                            
		421000=荆州市                                            
		421100=黄冈市                                            
		421200=咸宁市                                            
		421300=随州市                                            
		422800=恩施州                                            
		429000=省直辖行政单位
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (wuhan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_wuhan);
			itemView.setTag("420100=武汉市");
		} else if (huangshi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_huangshi);
			itemView.setTag("420200=黄石市");
		} else if (shiyan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_shiyan);
			itemView.setTag("420300=十堰市");
		} else if (shennongjia.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_shennongjia);
			itemView.setTag("420300=十堰市");
		} else if (yichang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_yichang);
			itemView.setTag("420500=宜昌市");
		} else if (xiangfan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_xiangfan);
			itemView.setTag("420600=襄樊市");
		} else if (ezhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_ezhou);
			itemView.setTag("420700=鄂州市");
		} else if (jingmen.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_jingmen);
			itemView.setTag("420800=荆门市");
		} else if (xiaogan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_xiaogan);
			itemView.setTag("420900=孝感市");
		} else if (jingzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_jingzhou);
			itemView.setTag("421000=荆州市");
		} else if (huanggang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_huanggang);
			itemView.setTag("421100=黄冈市");
		} else if (xianning.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_xianning);
			itemView.setTag("421200=咸宁市");
		} else if (suizhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_suizhou);
			itemView.setTag("421300=随州市");
		} else if (enshi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_enshi);
			itemView.setTag("422800=恩施州");
		} else if (qianjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_qianjiang);
			itemView.setTag("429000=省直辖行政单位");
		} else if (xiantao.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_xiantao);
			itemView.setTag("429000=省直辖行政单位");
		} else if (tianmen.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hub_tianmen);
			itemView.setTag("429000=省直辖行政单位");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
