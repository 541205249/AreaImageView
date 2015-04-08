package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityShanghaiUtil extends CityUtil {
	
	private String chengqu = "ffd9d9da";
	private String chongming = "ffdcdddd";
	
			/*310101=黄浦区                                              
			310103=卢湾区                                              
			310104=徐汇区                                              
			310105=长宁区                                              
			310106=静安区                                              
			310107=普陀区                                              
			310108=闸北区                                              
			310109=虹口区                                              
			310110=杨浦区                                              
			310112=闵行区                                              
			310113=宝山区                                              
			310114=嘉定区                                              
			310115=浦东新区                                            
			310116=金山区                                              
			310117=松江区                                              
			310118=青浦区                                              
			310119=南汇区                                              
			310120=奉贤区                                              
			310230=崇明县  */ 
	
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (chengqu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shangh_city);
			itemView.setTag("310000=上海市");
		} else if (chongming.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_shangh_chongming);
			itemView.setTag("310230=崇明县");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
