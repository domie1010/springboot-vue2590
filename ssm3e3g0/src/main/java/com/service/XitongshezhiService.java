package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitongshezhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XitongshezhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XitongshezhiView;


/**
 * 系统设置
 *
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public interface XitongshezhiService extends IService<XitongshezhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XitongshezhiVO> selectListVO(Wrapper<XitongshezhiEntity> wrapper);
   	
   	XitongshezhiVO selectVO(@Param("ew") Wrapper<XitongshezhiEntity> wrapper);
   	
   	List<XitongshezhiView> selectListView(Wrapper<XitongshezhiEntity> wrapper);
   	
   	XitongshezhiView selectView(@Param("ew") Wrapper<XitongshezhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XitongshezhiEntity> wrapper);
   	
}

