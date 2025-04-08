package com.dao;

import com.entity.XitongweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XitongweihuVO;
import com.entity.view.XitongweihuView;


/**
 * 系统维护
 * 
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public interface XitongweihuDao extends BaseMapper<XitongweihuEntity> {
	
	List<XitongweihuVO> selectListVO(@Param("ew") Wrapper<XitongweihuEntity> wrapper);
	
	XitongweihuVO selectVO(@Param("ew") Wrapper<XitongweihuEntity> wrapper);
	
	List<XitongweihuView> selectListView(@Param("ew") Wrapper<XitongweihuEntity> wrapper);

	List<XitongweihuView> selectListView(Pagination page,@Param("ew") Wrapper<XitongweihuEntity> wrapper);
	
	XitongweihuView selectView(@Param("ew") Wrapper<XitongweihuEntity> wrapper);
	
}
