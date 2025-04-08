package com.entity.model;

import com.entity.XitongshezhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 系统设置
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public class XitongshezhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinriqi;
				
	
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
