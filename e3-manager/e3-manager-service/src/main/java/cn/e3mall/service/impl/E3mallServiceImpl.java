package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.E3mallService;

@Service
public class E3mallServiceImpl implements E3mallService {
	@Autowired
    private TbItemMapper dao;
	@Override
	public TbItem test(long itemID) {
		return dao.selectByPrimaryKey(itemID);
	}

}
