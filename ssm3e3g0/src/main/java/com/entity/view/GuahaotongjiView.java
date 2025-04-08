package com.entity.view;

import com.entity.GuahaotongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 挂号统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
@TableName("guahaotongji")
public class GuahaotongjiView  extends GuahaotongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuahaotongjiView(){
	}
 
 	public GuahaotongjiView(GuahaotongjiEntity guahaotongjiEntity){
 	try {
			BeanUtils.copyProperties(this, guahaotongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
