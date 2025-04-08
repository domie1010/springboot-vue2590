package com.dao;

import com.entity.XitongshezhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XitongshezhiVO;
import com.entity.view.XitongshezhiView;


/**
 * 系统设置
 * 
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public interface XitongshezhiDao extends BaseMapper<XitongshezhiEntity> {
	
	List<XitongshezhiVO> selectListVO(@Param("ew") Wrapper<XitongshezhiEntity> wrapper);
	
	XitongshezhiVO selectVO(@Param("ew") Wrapper<XitongshezhiEntity> wrapper);
	
	List<XitongshezhiView> selectListView(@Param("ew") Wrapper<XitongshezhiEntity> wrapper);

	List<XitongshezhiView> selectListView(Pagination page,@Param("ew") Wrapper<XitongshezhiEntity> wrapper);
	
	XitongshezhiView selectView(@Param("ew") Wrapper<XitongshezhiEntity> wrapper);
	
}
