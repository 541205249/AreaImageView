package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityHebeiUtil extends CityUtil {
	private String shijiazhuang = "ffa4a4a4";
	private String tangshan = "ffc3c3c3";
	private String qinhuangdao = "ffc8c8c8";
	private String handan = "ff9a9a9a";
	private String xingtai = "ff9f9f9f";
	private String baoding = "ffaeaeae";
	private String zhangjiakou = "ffbebebe";
	private String chengde = "ffcecece";
	private String cangzhou = "ffb4b4b4";
	private String langfang = "ffb9b9b9";
	private String hengshui = "ffa9a9a9";

	 /*130100=石家庄市                                          
		130200=唐山市                                            
		130300=秦皇岛市                                          
		130400=邯郸市                                            
		130500=邢台市                                            
		130600=保定市                                            
		130700=张家口市                                          
		130800=承德市                                            
		130900=沧州市                                            
		131000=廊坊市                                            
		131100=衡水市 
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (shijiazhuang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_shijiazhuang);
			itemView.setTag("130100=石家庄市 ");
		} else if (tangshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_tangshan);
			itemView.setTag("130200=唐山市 ");
		} else if (qinhuangdao.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_qinhuangdao);
			itemView.setTag("130300=秦皇岛市");
		} else if (handan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_handan);
			itemView.setTag("130400=邯郸市");
		} else if (xingtai.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_xingtai);
			itemView.setTag("130500=邢台市");
		} else if (baoding.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_baoding);
			itemView.setTag("130600=保定市");
		} else if (zhangjiakou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_zhangjiakou);
			itemView.setTag("130700=张家口市");
		} else if (chengde.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_chengde);
			itemView.setTag("130800=承德市");
		} else if (cangzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_cangzhou);
			itemView.setTag("130900=沧州市");
		} else if (langfang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_langfang);
			itemView.setTag("131000=廊坊市");
		} else if (hengshui.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_heb_hengshui);
			itemView.setTag("131100=衡水市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
