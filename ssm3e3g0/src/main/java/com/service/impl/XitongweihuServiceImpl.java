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


import com.dao.XitongweihuDao;
import com.entity.XitongweihuEntity;
import com.service.XitongweihuService;
import com.entity.vo.XitongweihuVO;
import com.entity.view.XitongweihuView;

@Service("xitongweihuService")
public class XitongweihuServiceImpl extends ServiceImpl<XitongweihuDao, XitongweihuEntity> implements XitongweihuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XitongweihuEntity> page = this.selectPage(
                new Query<XitongweihuEntity>(params).getPage(),
                new EntityWrapper<XitongweihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XitongweihuEntity> wrapper) {
		  Page<XitongweihuView> page =new Query<XitongweihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XitongweihuVO> selectListVO(Wrapper<XitongweihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XitongweihuVO selectVO(Wrapper<XitongweihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XitongweihuView> selectListView(Wrapper<XitongweihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XitongweihuView selectView(Wrapper<XitongweihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
