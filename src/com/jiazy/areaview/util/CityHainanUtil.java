package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityHainanUtil extends CityUtil {
	
	private String lingaoxian = "ffd1d1d2";
	private String danzhou = "ffcdcece";
	private String dengmaixian = "ffd5d5d6";
	private String changjiang = "ffc9caca";
	private String haikou = "ffd9d9da";
	private String baisha = "ffc5c6c6";
	private String dongfang = "ffc1c2c2";
	private String ledong = "ffacadae";
	private String wuzhishan = "ffb1b1b2";
	private String qiongzhong = "ffb5b5b6";
	private String tunchangxian = "ffbdbebe";
	private String dinganxian = "ffd2d2d4";
	private String wenchang = "ffdcdddd";
	private String qionghai = "ffb9baba";
	private String wanning = "ffa8a9a9";
	private String baoting = "ff9fa0a0";
	private String lingshui = "ffa4a4a5";
	private String sanya = "ff9b9b9c";

	/* 469028 = 临高县
	 * 469003 = 儋州
	 * 469027 = 澄迈县
	 * 469031 = 昌江
	 * 460100 = 海口
	 * 469030 = 白沙
	 * 469007 = 东方
	 * 469033 = 乐东
	 * 469001 = 五指山
	 * 469036 = 琼中
	 * 469026 = 屯昌县
	 * 469025 = 定安县
	 * 469005 = 文昌
	 * 469002 = 琼海
	 * 469006 = 万宁
	 * 469035 = 保亭
	 * 469034 = 陵水
	 * 460200 = 三亚
	 */
	
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (lingaoxian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_lingaoxian);
			itemView.setTag("469028=临高县 ");
		} else if (danzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_danzhou);
			itemView.setTag("469003=儋州市 ");
		} else if (dengmaixian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_dengmai);
			itemView.setTag("469027=澄迈县");
		} else if (changjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_changjiang);
			itemView.setTag("469031=昌江黎族自治县");
		} else if (haikou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_haikou);
			itemView.setTag("460100=海口市");
		} else if (baisha.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_baisha);
			itemView.setTag("469030=白沙黎族自治县");
		} else if (dongfang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_dongfang);
			itemView.setTag("469007=东方市");
		} else if (ledong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_ledong);
			itemView.setTag("469033=乐东黎族自治县");
		} else if (wuzhishan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_wuzhishan);
			itemView.setTag("469001=五指山市");
		} else if (qiongzhong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_qiongzhong);
			itemView.setTag("469036=琼中黎族苗族自治县");
		} else if (tunchangxian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_tunchang);
			itemView.setTag("469026=屯昌县");
		} else if (dinganxian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_dinganxian);
			itemView.setTag("469025=定安县");
		} else if (wenchang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_wenchang);
			itemView.setTag("469005=文昌市");
		} else if (qionghai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_qionghai);
			itemView.setTag("469002=琼海市");
		} else if (wanning.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_wanning);
			itemView.setTag("469006=万宁市");
		}  else if (baoting.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_baoting);
			itemView.setTag("469035=保亭黎族苗族自治县");
		}  else if (lingshui.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_lingshui);
			itemView.setTag("469034=陵水黎族自治县");
		}  else if (sanya.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hain_sanya);
			itemView.setTag("460200=三亚市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
