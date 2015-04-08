package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityGuizhouUtil extends CityUtil {
	
	private String bijie = "ffd5d5d6";
	private String zunyi = "ffdcdddd";
	private String tongren = "ffd9d9da";
	private String guiyang = "ffd1d1d2";
	private String liupanshui = "ffc1c2c2";
	private String anshun = "ffbdbebe";
	private String xingyi = "ffb9baba";
	private String duyun = "ffcdcece";
	private String kaili = "ffc9caca";

	/* 522400 = 毕节
	 * 520200 = 遵义
	 * 522200 = 铜仁
	 * 520100 = 贵阳
	 * 520200 = 六盘水
	 * 520400 = 安顺
	 * 522300 = 兴义
	 * 522700 = 都匀
	 * 522600 = 凯里
	 */
	
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (bijie.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_bijie);
			itemView.setTag("522400=毕节地区 ");
		} else if (zunyi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_zunyi);
			itemView.setTag("520200=遵义市 ");
		} else if (tongren.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_tongren);
			itemView.setTag("522200=铜仁地区");
		} else if (guiyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_guiyang);
			itemView.setTag("520100=贵阳市");
		} else if (liupanshui.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_liupanshui);
			itemView.setTag("520200=六盘水市");
		} else if (anshun.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_anshun);
			itemView.setTag("520400=安顺市");
		} else if (xingyi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_xingyi);
			itemView.setTag("522300=黔西南州");
		} else if (duyun.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_duyun);
			itemView.setTag("522700=黔南布依族苗族自治州");
		} else if (kaili.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_guiz_kaili);
			itemView.setTag("522600=黔东南苗族侗族自治州");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
