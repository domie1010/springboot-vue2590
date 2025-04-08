package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuahaotongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuahaotongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaotongjiView;


/**
 * 挂号统计
 *
 * @author 
 * @email 
 * @date 2021-05-24 16:35:35
 */
public interface GuahaotongjiService extends IService<GuahaotongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaotongjiVO> selectListVO(Wrapper<GuahaotongjiEntity> wrapper);
   	
   	GuahaotongjiVO selectVO(@Param("ew") Wrapper<GuahaotongjiEntity> wrapper);
   	
   	List<GuahaotongjiView> selectListView(Wrapper<GuahaotongjiEntity> wrapper);
   	
   	GuahaotongjiView selectView(@Param("ew") Wrapper<GuahaotongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaotongjiEntity> wrapper);
   	
}

