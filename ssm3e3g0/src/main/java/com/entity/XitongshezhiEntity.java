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
 * 系统设置
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
@TableName("xitongshezhi")
public class XitongshezhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XitongshezhiEntity() {
		
	}
	
	public XitongshezhiEntity(T t) {
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
	 * 系统构成
	 */
					
	private String xitonggoucheng;
	
	/**
	 * 基本功能
	 */
					
	private String jibengongneng;
	
	/**
	 * 相关参数
	 */
					
	private String xiangguancanshu;
	
	/**
	 * 数据文件
	 */
					
	private String shujuwenjian;
	
	/**
	 * 运营商
	 */
					
	private String yunyingshang;
	
	/**
	 * 更新日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date gengxinriqi;
	
	
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
	 * 设置：系统构成
	 */
	public void setXitonggoucheng(String xitonggoucheng) {
		this.xitonggoucheng = xitonggoucheng;
	}
	/**
	 * 获取：系统构成
	 */
	public String getXitonggoucheng() {
		return xitonggoucheng;
	}
	/**
	 * 设置：基本功能
	 */
	public void setJibengongneng(String jibengongneng) {
		this.jibengongneng = jibengongneng;
	}
	/**
	 * 获取：基本功能
	 */
	public String getJibengongneng() {
		return jibengongneng;
	}
	/**
	 * 设置：相关参数
	 */
	public void setXiangguancanshu(String xiangguancanshu) {
		this.xiangguancanshu = xiangguancanshu;
	}
	/**
	 * 获取：相关参数
	 */
	public String getXiangguancanshu() {
		return xiangguancanshu;
	}
	/**
	 * 设置：数据文件
	 */
	public void setShujuwenjian(String shujuwenjian) {
		this.shujuwenjian = shujuwenjian;
	}
	/**
	 * 获取：数据文件
	 */
	public String getShujuwenjian() {
		return shujuwenjian;
	}
	/**
	 * 设置：运营商
	 */
	public void setYunyingshang(String yunyingshang) {
		this.yunyingshang = yunyingshang;
	}
	/**
	 * 获取：运营商
	 */
	public String getYunyingshang() {
		return yunyingshang;
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

}
