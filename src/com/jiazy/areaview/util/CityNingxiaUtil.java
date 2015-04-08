package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityNingxiaUtil extends CityUtil {
	private String yinchuan = "ffc8c8c8";
	private String shizuishan = "ffcecece";
	private String wuzhong = "ffc3c3c3";
	private String guyuan = "ffb9b9b9";
	private String zhongwei = "ffbebebe";

	 /*640100=银川市                                            
		640200=石嘴山市                                          
		640300=吴忠市                                            
		640400=固原市                                            
		640500=中卫市                                            
	 */
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (yinchuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_ningx_yinchuan);
			itemView.setTag("640100=银川市");
		} else if (shizuishan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_ningx_shizuishan);
			itemView.setTag("640200=石嘴山市");
		} else if (wuzhong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_ningx_wuzhong);
			itemView.setTag("640300=吴忠市");
		} else if (guyuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_ningx_guyuan);
			itemView.setTag("640400=固原市");
		} else if (zhongwei.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_ningx_zhongwei);
			itemView.setTag("640500=中卫市");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
