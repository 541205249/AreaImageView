package com.jiazy.areaview.util;

import android.graphics.Matrix;

public interface IAddAreaView {
	/**
	 * 添加/改变view
	 * @param colorStr
	 */
	void changeAreaView(String colorStr);
	
	/**
	 * 处理手势抬起事件
	 */
	void clickAreaView();
	
	/**
	 * 移动或缩放图片
	 */
	void setAreaViewMatrix(Matrix matrix);
}
