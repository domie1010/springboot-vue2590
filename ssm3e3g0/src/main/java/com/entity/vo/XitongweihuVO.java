package com.entity.vo;

import com.entity.XitongweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 系统维护
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public class XitongweihuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 故障描述
	 */
	
	private String guzhangmiaoshu;
		
	/**
	 * 维护内容
	 */
	
	private String weihuneirong;
		
	/**
	 * 维护结果
	 */
	
	private String weihujieguo;
		
	/**
	 * 维护时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weihushijian;
		
	/**
	 * 维护员
	 */
	
	private String weihuyuan;
				
	
	/**
	 * 设置：故障描述
	 */
	 
	public void setGuzhangmiaoshu(String guzhangmiaoshu) {
		this.guzhangmiaoshu = guzhangmiaoshu;
	}
	
	/**
	 * 获取：故障描述
	 */
	public String getGuzhangmiaoshu() {
		return guzhangmiaoshu;
	}
				
	
	/**
	 * 设置：维护内容
	 */
	 
	public void setWeihuneirong(String weihuneirong) {
		this.weihuneirong = weihuneirong;
	}
	
	/**
	 * 获取：维护内容
	 */
	public String getWeihuneirong() {
		return weihuneirong;
	}
				
	
	/**
	 * 设置：维护结果
	 */
	 
	public void setWeihujieguo(String weihujieguo) {
		this.weihujieguo = weihujieguo;
	}
	
	/**
	 * 获取：维护结果
	 */
	public String getWeihujieguo() {
		return weihujieguo;
	}
				
	
	/**
	 * 设置：维护时间
	 */
	 
	public void setWeihushijian(Date weihushijian) {
		this.weihushijian = weihushijian;
	}
	
	/**
	 * 获取：维护时间
	 */
	public Date getWeihushijian() {
		return weihushijian;
	}
				
	
	/**
	 * 设置：维护员
	 */
	 
	public void setWeihuyuan(String weihuyuan) {
		this.weihuyuan = weihuyuan;
	}
	
	/**
	 * 获取：维护员
	 */
	public String getWeihuyuan() {
		return weihuyuan;
	}
			
}
