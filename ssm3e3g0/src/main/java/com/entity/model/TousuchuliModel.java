package com.entity.model;

import com.entity.TousuchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 投诉处理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public class TousuchuliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 投诉对象
	 */
	
	private String tousuduixiang;
		
	/**
	 * 投诉内容
	 */
	
	private String tousuneirong;
		
	/**
	 * 处理反馈
	 */
	
	private String chulifankui;
		
	/**
	 * 处理进度
	 */
	
	private String chulijindu;
		
	/**
	 * 更新日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：投诉对象
	 */
	 
	public void setTousuduixiang(String tousuduixiang) {
		this.tousuduixiang = tousuduixiang;
	}
	
	/**
	 * 获取：投诉对象
	 */
	public String getTousuduixiang() {
		return tousuduixiang;
	}
				
	
	/**
	 * 设置：投诉内容
	 */
	 
	public void setTousuneirong(String tousuneirong) {
		this.tousuneirong = tousuneirong;
	}
	
	/**
	 * 获取：投诉内容
	 */
	public String getTousuneirong() {
		return tousuneirong;
	}
				
	
	/**
	 * 设置：处理反馈
	 */
	 
	public void setChulifankui(String chulifankui) {
		this.chulifankui = chulifankui;
	}
	
	/**
	 * 获取：处理反馈
	 */
	public String getChulifankui() {
		return chulifankui;
	}
				
	
	/**
	 * 设置：处理进度
	 */
	 
	public void setChulijindu(String chulijindu) {
		this.chulijindu = chulijindu;
	}
	
	/**
	 * 获取：处理进度
	 */
	public String getChulijindu() {
		return chulijindu;
	}
				
	
	/**
	 * 设置：更新日期
	 */
	 
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
