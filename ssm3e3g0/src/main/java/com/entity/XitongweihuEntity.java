package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 系统维护
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
@TableName("xitongweihu")
public class XitongweihuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XitongweihuEntity() {
		
	}
	
	public XitongweihuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 系统名称
	 */
					
	private String xitongmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date weihushijian;
	
	/**
	 * 维护员
	 */
					
	private String weihuyuan;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：系统名称
	 */
	public void setXitongmingcheng(String xitongmingcheng) {
		this.xitongmingcheng = xitongmingcheng;
	}
	/**
	 * 获取：系统名称
	 */
	public String getXitongmingcheng() {
		return xitongmingcheng;
	}
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
