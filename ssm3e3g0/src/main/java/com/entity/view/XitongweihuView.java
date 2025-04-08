package com.entity.view;

import com.entity.XitongweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 系统维护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
@TableName("xitongweihu")
public class XitongweihuView  extends XitongweihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XitongweihuView(){
	}
 
 	public XitongweihuView(XitongweihuEntity xitongweihuEntity){
 	try {
			BeanUtils.copyProperties(this, xitongweihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
