package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitongweihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XitongweihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XitongweihuView;


/**
 * 系统维护
 *
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public interface XitongweihuService extends IService<XitongweihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XitongweihuVO> selectListVO(Wrapper<XitongweihuEntity> wrapper);
   	
   	XitongweihuVO selectVO(@Param("ew") Wrapper<XitongweihuEntity> wrapper);
   	
   	List<XitongweihuView> selectListView(Wrapper<XitongweihuEntity> wrapper);
   	
   	XitongweihuView selectView(@Param("ew") Wrapper<XitongweihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XitongweihuEntity> wrapper);
   	
}

