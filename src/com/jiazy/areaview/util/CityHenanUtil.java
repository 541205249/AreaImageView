package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityHenanUtil extends CityUtil {
	private String zhengzhou = "ffb4b4b4";
	private String kaifeng = "ffaeaeae";
	private String luoyang = "ff9f9f9f";
	private String pingdingshan = "ff949494";
	private String anyang = "ffcecece";
	private String hebi = "ffc3c3c3";
	private String xinxiang = "ffbebebe";
	private String jiaozuo = "ffb9b9b9";
	private String puyang = "ffc8c8c8";
	private String xuchang = "ff9a9a9a";
	private String luohe = "ff8a8a8a";
	private String sanmenxia = "ffa4a4a4";
	private String nanyang = "ff858585";
	private String shangqiu = "ffa9a9a9";
	private String xinyang = "ff7a7a7a";
	private String zhoukou = "ff8f8f8f";
	private String zhumadian = "ff7f7f7f";

	 /*410100=郑州市                                            
		410200=开封市                                            
		410300=洛阳市                                            
		410400=平顶山市                                          
		410500=安阳市                                            
		410600=鹤壁市                                            
		410700=新乡市                                            
		410800=焦作市                                            
		410900=濮阳市                                            
		411000=许昌市                                            
		411100=漯河市                                            
		411200=三门峡市                                          
		411300=南阳市                                            
		411400=商丘市                                            
		411500=信阳市                                            
		411600=周口市                                            
		411700=驻马店市 
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (zhengzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_zhengzhou);
			itemView.setTag("410100=郑州市");
		} else if (kaifeng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_kaifeng);
			itemView.setTag("410200=开封市");
		} else if (luoyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_luoyang);
			itemView.setTag("410300=洛阳市");
		} else if (pingdingshan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_pingdingshan);
			itemView.setTag("410400=平顶山市");
		} else if (anyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_anyang);
			itemView.setTag("410500=安阳市");
		} else if (hebi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_hebi);
			itemView.setTag("410600=鹤壁市");
		} else if (xinxiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_xinxiang);
			itemView.setTag("410700=新乡市");
		} else if (jiaozuo.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_jiaozuo);
			itemView.setTag("410800=焦作市");
		} else if (puyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_puyang);
			itemView.setTag("410900=濮阳市");
		} else if (xuchang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_xuchang);
			itemView.setTag("411000=许昌市");
		} else if (luohe.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_luohe);
			itemView.setTag("411100=漯河市");
		} else if (sanmenxia.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_sanmenxia);
			itemView.setTag("411200=三门峡市");
		} else if (nanyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_nanyang);
			itemView.setTag("411300=南阳市");
		} else if (shangqiu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_shangqiu);
			itemView.setTag("411400=商丘市");
		} else if (xinyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_xinyang);
			itemView.setTag("411500=信阳市");
		} else if (zhoukou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_zhoukou);
			itemView.setTag("411600=周口市");
		} else if (zhumadian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hen_zhumadian);
			itemView.setTag("411700=驻马店市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
