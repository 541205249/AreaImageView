package com.jiazy.areaview.util;

import java.util.HashMap;
import java.util.Map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;

import com.jiazy.areaview.AreaTabActivity;
import com.jiazy.areaview.R;


@SuppressLint("ShowToast")
public class AreaViewFactory {
	public final static String CHINA = "全国";
	
	public final static String BEIIJING = "北京市";
	public final static String TIANJING = "天津市";
	public final static String HEBEI = "河北省";
	public final static String SHANXI = "山西";
	public final static String NEIMENGGU = "内蒙古自治区";
	public final static String LIAONING = "辽宁省";
	public final static String JILIN = "吉林省";
	public final static String HEILONGJIANG = "黑龙江省";
	public final static String SHANGHAI = "上海市";
	public final static String JIANGSU = "江苏省";
	public final static String ZHEJIANG = "浙江省";
	public final static String ANHUI = "安徽省";
	public final static String FUJIANG = "福建省";
	public final static String JIANGXI = "江西省";
	public final static String SHANDONG = "山东省";
	public final static String HENAN = "河南省";
	public final static String HUBEI = "湖北省";
	public final static String HUNAN = "湖南省";
	public final static String GUANGDONG = "广东省";
	public final static String GUANGXI = "广西壮族自治区";
	public final static String HAINAN = "海南省";
	public final static String CHONGQING = "重庆市";
	public final static String SICHUAN = "四川省";
	public final static String GUIZHOU = "贵州省";
	public final static String YUNNAN = "云南省";
	public final static String XIZANG = "西藏自治区";
	public final static String SHANXISHENG = "陕西省";
	public final static String GANSU = "甘肃省";
	public final static String QINGHAI = "青海省";
	public final static String NINGXIA = "宁夏回族自治区";
	public final static String XINJIANG = "新疆维吾尔自治区";
	public final static String TANWAN = "台湾省";
	public final static String XIANGGANG = "香港特别行政区";
	public final static String AOMEN = "澳门特别行政区";
	
	/**
	 * 设置省份工具类
	 * @param context
	 * @param itemView
	 * @param colorStr
	 * @param provinceFlag
	 */
	public void putAreaViewValue(Context context, AreaView itemView, String colorStr, String provinceFlag){
		CityUtil util = null;
		
		if(CHINA.equals(provinceFlag)){
			util = new ChinaUtil();
		}else if(AreaViewFactory.BEIIJING.equals(provinceFlag)){
			util = new CityBeijingUtil();
		}else if(AreaViewFactory.TIANJING.equals(provinceFlag)){
			util = new CityTianjinUtil();
		}else if(AreaViewFactory.HEBEI.equals(provinceFlag)){
			util = new CityHebeiUtil();
		}else if(AreaViewFactory.SHANXI.equals(provinceFlag)){
			util = new CityShanxiUtil();
		}else if(AreaViewFactory.NEIMENGGU.equals(provinceFlag)){
			util = new CityNeimengguUtil();
		}else if(AreaViewFactory.LIAONING.equals(provinceFlag)){
			util = new CityLiaoningUtil();
		}else if(AreaViewFactory.JILIN.equals(provinceFlag)){
			util = new CityJilinUtil();
		}else if(AreaViewFactory.HEILONGJIANG.equals(provinceFlag)){
			util = new CityHeilongjiangUtil();
		}else if(AreaViewFactory.SHANGHAI.equals(provinceFlag)){
			util = new CityShanghaiUtil();
		}else if(AreaViewFactory.JIANGSU.equals(provinceFlag)){
			util = new CityJiangsuUtil();
		}else if(AreaViewFactory.ZHEJIANG.equals(provinceFlag)){
			util = new CityZhejiangUtil();
		}else if(AreaViewFactory.ANHUI.equals(provinceFlag)){
			util = new CityAnhuiUtil();
		}else if(AreaViewFactory.FUJIANG.equals(provinceFlag)){
			util = new CityFujianUtil();
		}else if(AreaViewFactory.JIANGXI.equals(provinceFlag)){
			util = new CityJiangxiUtil();
		}else if(AreaViewFactory.SHANDONG.equals(provinceFlag)){
			util = new CityShandongUtil();
		}else if(AreaViewFactory.HENAN.equals(provinceFlag)){
			util = new CityHenanUtil();
		}else if(AreaViewFactory.HUBEI.equals(provinceFlag)){
			util = new CityHubeiUtil();
		}else if(AreaViewFactory.HUNAN.equals(provinceFlag)){
			util = new CityHunanUtil();
		}else if(AreaViewFactory.GUANGDONG.equals(provinceFlag)){
			util = new CityGuangdongUtil();
		}else if(AreaViewFactory.GUANGXI.equals(provinceFlag)){
			util = new CityGuangxiUtil();
		}else if(AreaViewFactory.HAINAN.equals(provinceFlag)){
			util = new CityHainanUtil();
		}else if(AreaViewFactory.CHONGQING.equals(provinceFlag)){
			util = new CityChongqingUtil();
		}else if(AreaViewFactory.SICHUAN.equals(provinceFlag)){
			util = new CitySichuanUtil();
		}else if(AreaViewFactory.GUIZHOU.equals(provinceFlag)){
			util = new CityGuizhouUtil();
		}else if(AreaViewFactory.YUNNAN.equals(provinceFlag)){
			util = new CityYunnanUtil();
		}else if(AreaViewFactory.XIZANG.equals(provinceFlag)){
			util = new CityXizangUtil();
		}else if(AreaViewFactory.SHANXISHENG.equals(provinceFlag)){  //陕西
			util = new CityShanxishengUtil();  
		}else if(AreaViewFactory.GANSU.equals(provinceFlag)){
			util = new CityGansuUtil();
		}else if(AreaViewFactory.QINGHAI.equals(provinceFlag)){
			util = new CityQinghaiUtil();
		}else if(AreaViewFactory.NINGXIA.equals(provinceFlag)){
			util = new CityNingxiaUtil();
		}else if(AreaViewFactory.XINJIANG.equals(provinceFlag)){
			util = new CityXinjiangUtil();
		}else if(AreaViewFactory.TANWAN.equals(provinceFlag)){
			return;
		}else if(AreaViewFactory.XIANGGANG.equals(provinceFlag)){
			return;
		}else if(AreaViewFactory.AOMEN.equals(provinceFlag)){
			return;
		}else{
			return;
		}
		
		util.setAreaViewValue(context, itemView, colorStr);
		
	}
	
	/**
	 * 初始化省份地图
	 * @param context
	 * @param provinceName
	 * @param bitmap
	 * @param itemView
	 * @return
	 */
	public Map<String, Object> initProvinceInfo(Context context, String provinceName){
		Map<String, Object> map = new HashMap<String, Object>();
		
		//流程:先判断是否已经选择了省份——判断MyApplication里是否有省份——否则默认显示湖南地图
		if(!"".equals(AreaTabActivity.provinceName)){
			provinceName = AreaTabActivity.provinceName;
		} else{
			provinceName = "湖南省";
			AreaTabActivity.provinceName = "湖南省";
			AreaTabActivity.provinceCode = "430000";
		}
		
		Bitmap bitmap = null;
		Bitmap bitmap1 = null;
		AreaView itemView = new AreaView(context);
		
		if(AreaViewFactory.BEIIJING.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_beijing);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_beijing_1);
		}else if(AreaViewFactory.TIANJING.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_tianjin);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_tianjin_1);
		}else if(AreaViewFactory.HEBEI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_hebei);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_hebei_1);
		}else if(AreaViewFactory.SHANXI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxi);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_shanxi_1);
		}else if(AreaViewFactory.NEIMENGGU.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_neimenggu);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_neimenggu_1);
		}else if(AreaViewFactory.LIAONING.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_liaoning);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_liaoning_1);
		}else if(AreaViewFactory.JILIN.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_jilin);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_jilin_1);
		}else if(AreaViewFactory.HEILONGJIANG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_heilongjiang);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_heilongjiang_1);
		}else if(AreaViewFactory.SHANGHAI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_shanghai);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_shanghai_1);
		}else if(AreaViewFactory.JIANGSU.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangsu);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_jiangsu_1);
		}else if(AreaViewFactory.ZHEJIANG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_zhejiang);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_zhejiang_1);
		}else if(AreaViewFactory.ANHUI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_anhui);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_anhui_1);
		}else if(AreaViewFactory.FUJIANG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_fujian);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_fujian_1);
		}else if(AreaViewFactory.JIANGXI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_jiangxi);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_jiangxi_1);
		}else if(AreaViewFactory.SHANDONG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_shandong);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_shandong_1);
		}else if(AreaViewFactory.HENAN.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_henan);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_henan_1);
		}else if(AreaViewFactory.HUBEI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_hubei);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_hubei_1);
		}else if(AreaViewFactory.HUNAN.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_hunan);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_hunan_1);
		}else if(AreaViewFactory.GUANGDONG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_guangdong);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_guangdong_1);
		}else if(AreaViewFactory.GUANGXI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_guangxi);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_guangxi_1);
		}else if(AreaViewFactory.HAINAN.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_hainan);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_hainan_1);
		}else if(AreaViewFactory.CHONGQING.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_chongqing);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_chongqing_1);
		}else if(AreaViewFactory.SICHUAN.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_sichuan);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_sichuan_1);
		}else if(AreaViewFactory.GUIZHOU.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_guizhou);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_guizhou_1);
		}else if(AreaViewFactory.YUNNAN.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_yunnan);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_yunnan_1);
		}else if(AreaViewFactory.XIZANG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_xizang);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_xizang_1);
		}else if(AreaViewFactory.SHANXISHENG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_shanxisheng);  //陕西
			bitmap1 = itemView.readBitMap(context, R.drawable.city_shanxisheng_1);
		}else if(AreaViewFactory.GANSU.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_gansu);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_gansu_1);
		}else if(AreaViewFactory.QINGHAI.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_qinghai);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_qinghai_1);
		}else if(AreaViewFactory.NINGXIA.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_ningxia);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_ningxia_1);
		}else if(AreaViewFactory.XINJIANG.equals(provinceName)){
			bitmap = itemView.readBitMap(context, R.drawable.city_xinjiang);
			bitmap1 = itemView.readBitMap(context, R.drawable.city_xinjiang_1);
		}else if(AreaViewFactory.TANWAN.equals(provinceName)){
			Toast.makeText(context, "该地区暂无地图", 1).show();
		}else if(AreaViewFactory.XIANGGANG.equals(provinceName)){
			Toast.makeText(context, "该地区暂无地图", 1).show();
		}else if(AreaViewFactory.AOMEN.equals(provinceName)){
			Toast.makeText(context, "该地区暂无地图", 1).show();
		}else{
			Toast.makeText(context, "该地区暂无地图", 1).show();
		}
		
		map.put("provinceName", provinceName);
		map.put("bitmap", bitmap);
		map.put("bitmap1", bitmap1);
		
		return map;
	}
	
}
