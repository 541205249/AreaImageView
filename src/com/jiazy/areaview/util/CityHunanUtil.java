package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityHunanUtil extends CityUtil{
	private String zhangjiajie = "ffc3c3c3";
	private String changde = "ffc8c8c8";
	private String xiangxi = "ffb9b9b9";
	private String huaihua = "ffa4a4a4";
	private String shaoyang = "ff9a9a9a";
	private String loudi = "ffa9a9a9";
	private String yongzhou = "ff8f8f8f";
	private String chenzhou = "ff8a8a8a";
	private String hengyang = "ff949494";
	private String zhuzhou = "ff9f9f9f";
	private String xiangtan = "ffaeaeae";
	private String changsha = "ffb4b4b4";
	private String yiyang = "ffbebebe";
	private String yueyang = "ffcecece";
	
	/*430100=长沙市
		430200=株洲市
		430300=湘潭市
		430400=衡阳市
		430500=邵阳市
		430600=岳阳市
		430700=常德市
		430800=张家界市
		430900=益阳市
		431000=郴州市
		431100=永州市
		431200=怀化市
		431300=娄底市
		433100=湘西土家族苗族自治州
		*/
	@Override
	public void setAreaViewValue(Context context, AreaView itemView, String colorStr){
		Bitmap bitmap = null;
		if (zhangjiajie.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_zhangjj);
			itemView.setTag("430800=张家界市");
		} else if (changde.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_changd);
			itemView.setTag("430700=常德市");
		} else if (xiangxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_xiangx);
			itemView.setTag("433100=湘西土家族苗族自治州");
		} else if (huaihua.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_huaih);
			itemView.setTag("431200=怀化市");
		} else if (shaoyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_shaoy);
			itemView.setTag("430500=邵阳市");
		} else if (loudi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_loud);
			itemView.setTag("431300=娄底市");
		} else if (yongzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_yongz);
			itemView.setTag("431100=永州市");
		} else if (chenzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_chenz);
			itemView.setTag("431000=郴州市");
		} else if (hengyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_hengy);
			itemView.setTag("430400=衡阳市");
		} else if (zhuzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_zhuz);
			itemView.setTag("430200=株洲市");
		} else if (xiangtan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_xiangt);
			itemView.setTag("430300=湘潭市");
		} else if (changsha.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_changs);
			itemView.setTag("430100=长沙市");
		} else if (yiyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_yiy);
			itemView.setTag("430900=益阳市");
		} else if (yueyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_hun_yuey);
			itemView.setTag("430600=岳阳市");
		} else {
			itemView.setTag("");
		}
		
		itemView.setImageBitmap(bitmap);
	}
	
}
