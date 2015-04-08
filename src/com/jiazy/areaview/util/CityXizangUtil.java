package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityXizangUtil extends CityUtil{
	private String lasa = "ffbebebe";
	private String changdu = "ffaeaeae";
	private String shannan = "ffb9b9b9";
	private String rikaze = "ffc3c3c3";
	private String naqu = "ffc8c8c8";
	private String ali = "ffcecece";
	private String linzhi = "ffb4b4b4";
	
	 /*540100=拉萨市                                            
		542100=昌都地区                                          
		542200=山南地区                                          
		542300=日喀则地区                                        
		542400=那曲地区                                          
		542500=阿里地区                                          
		542600=林芝地区  
		*/
	@Override
	public void setAreaViewValue(Context context, AreaView itemView, String colorStr){
		Bitmap bitmap = null;
		if (lasa.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xiz_lasa);
			itemView.setTag("540100=拉萨市");
		} else if (changdu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xiz_changdu);
			itemView.setTag("542100=昌都地区 ");
		} else if (shannan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xiz_shannan);
			itemView.setTag("542200=山南地区");
		} else if (rikaze.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xiz_rikaze);
			itemView.setTag("542300=日喀则地区");
		} else if (naqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xiz_naqu);
			itemView.setTag("542400=那曲地区");
		} else if (ali.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xiz_ali);
			itemView.setTag("542500=阿里地区");
		} else if (linzhi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_xiz_linzhi);
			itemView.setTag("542600=林芝地区");
		} else {
			itemView.setTag("");
		}
		
		itemView.setImageBitmap(bitmap);
	}
	
}
