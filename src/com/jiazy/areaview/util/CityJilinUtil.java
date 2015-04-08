package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityJilinUtil extends CityUtil{
	private String changchun = "ffc3c3c3";
	private String jilin = "ffb9b9b9";
	private String siping = "ffbebebe";
	private String liaoyuan = "ffb4b4b4";
	private String tonghua = "ffaeaeae";
	private String baishan = "ffa9a9a9";
	private String songyuan = "ffc8c8c8";
	private String baicheng = "ffcecece";
	private String yanbian = "ffa4a4a4";
	
	  /*220100=长春市                                              
		220200=吉林市                                              
		220300=四平市                                              
		220400=辽源市                                              
		220500=通化市                                              
		220600=白山市                                              
		220700=松原市                                              
		220800=白城市                                              
		222400=延边朝鲜族自治州   
		*/
	@Override
	public void setAreaViewValue(Context context, AreaView itemView, String colorStr){
		Bitmap bitmap = null;
		if (changchun.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_changchun);
			itemView.setTag("220100=长春市 ");
		} else if (jilin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_jilin);
			itemView.setTag("220200=吉林市 ");
		} else if (siping.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_siping);
			itemView.setTag("220300=四平市");
		} else if (liaoyuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_liaoyuan);
			itemView.setTag("220400=辽源市");
		} else if (tonghua.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_tonghua);
			itemView.setTag("220500=通化市");
		} else if (baishan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_baishan);
			itemView.setTag("220600=白山市");
		} else if (songyuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_songyuan);
			itemView.setTag("220700=松原市");
		} else if (baicheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_baicheng);
			itemView.setTag("220800=白城市");
		} else if (yanbian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_jil_yanji);
			itemView.setTag("222400=延边朝鲜族自治州");
		} else {
			itemView.setTag("");
		}
		
		itemView.setImageBitmap(bitmap);
	}
	
}
