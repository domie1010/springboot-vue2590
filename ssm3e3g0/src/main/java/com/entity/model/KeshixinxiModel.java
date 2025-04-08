package com.entity.model;

import com.entity.KeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 科室信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public class KeshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室位置
	 */
	
	private String keshiweizhi;
		
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 医生简介
	 */
	
	private String yishengjianjie;
		
	/**
	 * 挂号人数
	 */
	
	private Integer guahaorenshu;
		
	/**
	 * 挂号费用
	 */
	
	private Integer guahaofeiyong;
		
	/**
	 * 值班表
	 */
	
	private String zhibanbiao;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
				
	
	/**
	 * 设置：科室位置
	 */
	 
	public void setKeshiweizhi(String keshiweizhi) {
		this.keshiweizhi = keshiweizhi;
	}
	
	/**
	 * 获取：科室位置
	 */
	public String getKeshiweizhi() {
		return keshiweizhi;
	}
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：医生简介
	 */
	 
	public void setYishengjianjie(String yishengjianjie) {
		this.yishengjianjie = yishengjianjie;
	}
	
	/**
	 * 获取：医生简介
	 */
	public String getYishengjianjie() {
		return yishengjianjie;
	}
				
	
	/**
	 * 设置：挂号人数
	 */
	 
	public void setGuahaorenshu(Integer guahaorenshu) {
		this.guahaorenshu = guahaorenshu;
	}
	
	/**
	 * 获取：挂号人数
	 */
	public Integer getGuahaorenshu() {
		return guahaorenshu;
	}
				
	
	/**
	 * 设置：挂号费用
	 */
	 
	public void setGuahaofeiyong(Integer guahaofeiyong) {
		this.guahaofeiyong = guahaofeiyong;
	}
	
	/**
	 * 获取：挂号费用
	 */
	public Integer getGuahaofeiyong() {
		return guahaofeiyong;
	}
				
	
	/**
	 * 设置：值班表
	 */
	 
	public void setZhibanbiao(String zhibanbiao) {
		this.zhibanbiao = zhibanbiao;
	}
	
	/**
	 * 获取：值班表
	 */
	public String getZhibanbiao() {
		return zhibanbiao;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
			
}
