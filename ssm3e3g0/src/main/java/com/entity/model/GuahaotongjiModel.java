package com.entity.model;

import com.entity.GuahaotongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 挂号统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public class GuahaotongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室位置
	 */
	
	private String keshiweizhi;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 预约人数
	 */
	
	private Integer yuyuerenshu;
		
	/**
	 * 接诊人数
	 */
	
	private Integer jiezhenrenshu;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：预约人数
	 */
	 
	public void setYuyuerenshu(Integer yuyuerenshu) {
		this.yuyuerenshu = yuyuerenshu;
	}
	
	/**
	 * 获取：预约人数
	 */
	public Integer getYuyuerenshu() {
		return yuyuerenshu;
	}
				
	
	/**
	 * 设置：接诊人数
	 */
	 
	public void setJiezhenrenshu(Integer jiezhenrenshu) {
		this.jiezhenrenshu = jiezhenrenshu;
	}
	
	/**
	 * 获取：接诊人数
	 */
	public Integer getJiezhenrenshu() {
		return jiezhenrenshu;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
