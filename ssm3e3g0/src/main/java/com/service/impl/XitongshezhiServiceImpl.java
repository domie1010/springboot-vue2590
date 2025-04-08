package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XitongshezhiDao;
import com.entity.XitongshezhiEntity;
import com.service.XitongshezhiService;
import com.entity.vo.XitongshezhiVO;
import com.entity.view.XitongshezhiView;

@Service("xitongshezhiService")
public class XitongshezhiServiceImpl extends ServiceImpl<XitongshezhiDao, XitongshezhiEntity> implements XitongshezhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XitongshezhiEntity> page = this.selectPage(
                new Query<XitongshezhiEntity>(params).getPage(),
                new EntityWrapper<XitongshezhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XitongshezhiEntity> wrapper) {
		  Page<XitongshezhiView> page =new Query<XitongshezhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XitongshezhiVO> selectListVO(Wrapper<XitongshezhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XitongshezhiVO selectVO(Wrapper<XitongshezhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XitongshezhiView> selectListView(Wrapper<XitongshezhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XitongshezhiView selectView(Wrapper<XitongshezhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
