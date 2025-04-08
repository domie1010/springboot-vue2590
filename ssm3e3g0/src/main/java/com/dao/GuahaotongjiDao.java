package com.dao;

import com.entity.GuahaotongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuahaotongjiVO;
import com.entity.view.GuahaotongjiView;


/**
 * 挂号统计
 * 
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public interface GuahaotongjiDao extends BaseMapper<GuahaotongjiEntity> {
	
	List<GuahaotongjiVO> selectListVO(@Param("ew") Wrapper<GuahaotongjiEntity> wrapper);
	
	GuahaotongjiVO selectVO(@Param("ew") Wrapper<GuahaotongjiEntity> wrapper);
	
	List<GuahaotongjiView> selectListView(@Param("ew") Wrapper<GuahaotongjiEntity> wrapper);

	List<GuahaotongjiView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaotongjiEntity> wrapper);
	
	GuahaotongjiView selectView(@Param("ew") Wrapper<GuahaotongjiEntity> wrapper);
	
}
