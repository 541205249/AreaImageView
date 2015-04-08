package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityQinghaiUtil extends CityUtil {
	private String xining = "ffa9a9a9";
	private String haidong = "ffb4b4b4";
	private String haibei = "ffa4a4a4";
	private String huangnan = "ffaeaeae";
	private String hainan = "ffb9b9b9";
	private String guoluo = "ffbebebe";
	private String yushu = "ffc8c8c8";
	private String haixi = "ffcecece";
	private String geermu = "ffc3c3c3";

	 /*630100=西宁市                                              
		632100=海东地区                                            
		632200=海北州                                              
		632300=黄南州                                              
		632500=海南州                                              
		632600=果洛州                                              
		632700=玉树州                                              
		632800=海西州
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (xining.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_xining);
			itemView.setTag("630100=西宁市");
		} else if (haidong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_haidong);
			itemView.setTag("632100=海东地区");
		} else if (haibei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_haibei);
			itemView.setTag("632200=海北州");
		} else if (huangnan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_huangnan);
			itemView.setTag("632300=黄南州");
		} else if (hainan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_hainan);
			itemView.setTag("632500=海南州");
		} else if (guoluo.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_guoluo);
			itemView.setTag("632600=果洛州");
		} else if (yushu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_yushu);
			itemView.setTag("632700=玉树州");
		} else if (geermu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_geermu);
			itemView.setTag("632700=玉树州");
		} else if (haixi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_qingh_haixi);
			itemView.setTag("632800=海西州");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
