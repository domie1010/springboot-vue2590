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


import com.dao.GuahaotongjiDao;
import com.entity.GuahaotongjiEntity;
import com.service.GuahaotongjiService;
import com.entity.vo.GuahaotongjiVO;
import com.entity.view.GuahaotongjiView;

@Service("guahaotongjiService")
public class GuahaotongjiServiceImpl extends ServiceImpl<GuahaotongjiDao, GuahaotongjiEntity> implements GuahaotongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaotongjiEntity> page = this.selectPage(
                new Query<GuahaotongjiEntity>(params).getPage(),
                new EntityWrapper<GuahaotongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaotongjiEntity> wrapper) {
		  Page<GuahaotongjiView> page =new Query<GuahaotongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuahaotongjiVO> selectListVO(Wrapper<GuahaotongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuahaotongjiVO selectVO(Wrapper<GuahaotongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuahaotongjiView> selectListView(Wrapper<GuahaotongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaotongjiView selectView(Wrapper<GuahaotongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
