package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityBeijingUtil extends CityUtil {
	private String beijingchengqu = "ffa9a9a9";
//	
//	private String dongchengqu = "ffc8c8c8";
//	private String xichengqu = "ffb9b9b9";
//	private String chongwenqu = "ffa4a4a4";
//	private String xuanwuqu = "ff9a9a9a";
//	private String chaoyangqu = "ffa9a9a9";
//	private String fengtaiqu = "ff8f8f8f";
//	private String shijingshanqu = "ff8a8a8a";
//	private String haidianqu = "ff949494";
	
	private String mentougouqu = "ffaeaeae";
	private String fangshanqu = "ff9f9f9f";
	private String tongzhouqu = "ffa4a4a4";
	private String shunyiqu = "ffb9b9b9";
	private String changpinqu = "ffb4b4b4";
	private String daxingqu = "ff9a9a9a";
	private String huairouqu = "ffcecece";
	private String pingguqu = "ffbebebe";
	private String miyunqu = "ffc8c8c8";
	private String yanqingxian = "ffc3c3c3";

	/*
	 * 110000=北京市 
	 * 110101=东城区
	 * 110102=西城区 
	 * 110103=崇文区 
	 * 110104=宣武区 
	 * 110105=朝阳区
	 * 110106=丰台区
	 * 110107=石景山区 
	 * 110108=海淀区 
	 * 110109=门头沟区 
	 * 110111=房山区 
	 * 110112=通州区
	 * 110113=顺义区 
	 * 110114=昌平区 
	 * 110115=大兴区 
	 * 110116=怀柔区 
	 * 110117=平谷区 
	 * 110228=密云县
	 * 110229=延庆县
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (mentougouqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_mentougou);
			itemView.setTag("110109=门头沟区");
		} else if (fangshanqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_fangshan);
			itemView.setTag("110111=房山区");
		} else if (tongzhouqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_tongzhou);
			itemView.setTag("110112=通州区");
		} else if (shunyiqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_shunyi);
			itemView.setTag("110113=顺义区");
		} else if (changpinqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_changping);
			itemView.setTag("110114=昌平区");
		} else if (daxingqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_daxing);
			itemView.setTag("110115=大兴区");
		} else if (huairouqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_huairou);
			itemView.setTag("110116=怀柔区");
		} else if (pingguqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_pinggu);
			itemView.setTag("110117=平谷区");
		} else if (miyunqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_miyun);
			itemView.setTag("110228=密云县");
		} else if (yanqingxian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_yanqing);
			itemView.setTag("110229=延庆县");
		} else if (beijingchengqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_beij_chengqu);
			itemView.setTag("");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
