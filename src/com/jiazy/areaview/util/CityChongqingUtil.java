package com.jiazy.areaview.util;

import android.content.Context;
import android.graphics.Bitmap;

import com.jiazy.areaview.R;

public class CityChongqingUtil extends CityUtil {
	private String chengkou = "ffdcdddd";
	private String wuxi = "ffd9d9da";
	private String kaixian = "ffd5d5d6";
	private String yunyang = "ffc9caca";
	private String fengjie = "ffcdcece";
	private String wushan = "ffd1d1d2";
	private String wanzhou = "ffc5c6c6";
	private String liangping = "ffc1c2c2";
	private String zhongxian = "ffbdbebe";
	private String dianjiang = "ffb5b5b6";
	private String shizhu = "ffb9baba";
	private String fengdu = "ffb1b1b2";
	private String wulong = "ff727171";
	private String pengshui = "ff767676";
	private String qianjiang = "ff7b7a7b";
	private String youyang = "ff5e5d5c";
	private String xiushan = "ff595757";
	private String changshou = "ffacadae";
	private String peiling = "ff898989";
	private String nanchuan = "ff6d6c6c";
	private String chongqingshi = "ff9b9b9c";
	private String qijiang = "ff686767";
	private String wansheng = "ff6b6a6a";
	private String hechuan = "ffa4a4a5";
	private String bishan = "ff969797";
	private String jiangjin = "ff807f80";
	private String yongchuan = "ff848484";
	private String tongliang = "ff9fa0a0";
	private String tongnan = "ffa8a9a9";
	private String dazu = "ff929292";
	private String rongchang = "ff8d8d8e";

			/*
			 * 500101=万州区                                              
			500102=涪陵区                                              
			500103=渝中区                                              
			500104=大渡口区                                            
			500105=江北区                                              
			500106=沙坪坝区                                            
			500107=九龙坡区                                            
			500108=南岸区                                              
			500109=北碚区                                              
			500110=万盛区                                              
			500111=双桥区                                              
			500112=渝北区                                              
			500113=巴南区                                              
			500114=黔江区                                              
			500115=长寿区                                              
			500116=江津区                                              
			500117=合川区                                              
			500118=永川区                                              
			500119=南川区                                              
			500222=綦江县                                              
			500223=潼南县                                              
			500224=铜梁县                                              
			500225=大足县                                              
			500226=荣昌县                                              
			500227=璧山县                                              
			500228=梁平县                                              
			500229=城口县                                              
			500230=丰都县                                              
			500231=垫江县                                              
			500232=武隆县                                              
			500233=忠县                                                
			500234=开县                                                
			500235=云阳县                                              
			500236=奉节县                                              
			500237=巫山县                                              
			500238=巫溪县                                              
			500240=石柱县                                              
			500241=秀山土家族苗族自治县                                
			500242=酉阳土家族苗族自治县                                
			500243=彭水苗族土家族自治县      */   
	
	@Override
	public void setAreaViewValue(Context context, AreaView itemView,
			String colorStr) {
		Bitmap bitmap = null;
		if (chongqingshi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_chongqqing);
			itemView.setTag("");
		} else if (wanzhou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_wanzhou);
			itemView.setTag("500101=万州区");
		} else if (peiling.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_peiling);
			itemView.setTag("500102=涪陵区");
		} else if (wansheng.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_wansheng);
			itemView.setTag("500110=万盛区");
		} else if (qianjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_qianjiang);
			itemView.setTag("500114=黔江区");
		} else if (changshou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_changshou);
			itemView.setTag("500115=长寿区");
		} else if (jiangjin.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_jiangjin);
			itemView.setTag("500116=江津区");
		} else if (hechuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_hechuan);
			itemView.setTag("500117=合川区");
		} else if (yongchuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_yongchuan);
			itemView.setTag("500118=永川区");
		} else if (nanchuan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_nanchuan);
			itemView.setTag("500119=南川区");
		} else if (qijiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_qijiang);
			itemView.setTag("500222=綦江县");
		} else if (tongnan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_tongnan);
			itemView.setTag("500223=潼南县");
		} else if (tongliang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_tongliang);
			itemView.setTag("500224=铜梁县");
		} else if (dazu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_dazu);
			itemView.setTag("500225=大足县");
		} else if (rongchang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_rongchang);
			itemView.setTag("500226=荣昌县");
		} else if (bishan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_bishan);
			itemView.setTag("500227=璧山县");
		} else if (liangping.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_liangping);
			itemView.setTag("500228=梁平县");
		}  else if (chengkou.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_chengkou);
			itemView.setTag("500229=城口县");
		} else if (fengdu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_fengdu);
			itemView.setTag("500230=丰都县");
		} else if (dianjiang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_dianjiang);
			itemView.setTag("500231=垫江县");
		} else if (wulong.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_wulong);
			itemView.setTag("500232=武隆县");
		} else if (zhongxian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_zhongxian);
			itemView.setTag("500233=忠县");
		} else if (kaixian.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_kaixian);
			itemView.setTag("500234=开县");
		} else if (yunyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_yunyang);
			itemView.setTag("500235=云阳县");
		} else if (fengjie.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_fengjie);
			itemView.setTag("500236=奉节县");
		} else if (wushan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_wushan);
			itemView.setTag("500237=巫山县");
		} else if (wuxi.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_wuxi);
			itemView.setTag("500238=巫溪县");
		} else if (shizhu.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_shizhu);
			itemView.setTag("500240=石柱县");
		} else if (xiushan.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_xiushan);
			itemView.setTag("500241=秀山土家族苗族自治县");
		} else if (youyang.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_youyang);
			itemView.setTag("500242=酉阳土家族苗族自治县");
		} else if (pengshui.equals(colorStr)) {
			bitmap = itemView.readBitMap(context, R.drawable.city_chongq_pengshui);
			itemView.setTag("500243=彭水苗族土家族自治县");
		} else {
			itemView.setTag("");
		}

		itemView.setImageBitmap(bitmap);
	}

}
