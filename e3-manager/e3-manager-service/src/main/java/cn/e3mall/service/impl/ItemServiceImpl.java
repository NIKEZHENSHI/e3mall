package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
    private TbItemMapper dao;
	@Override
	public TbItem test(long itemID) {
		return dao.selectByPrimaryKey(itemID);
	}
	@Override
	public DataGridResult findall(int page, int rows) {
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		List<TbItem> list = dao.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		DataGridResult dataGridResult = new DataGridResult();
		long total = pageInfo.getTotal();
		dataGridResult.setRows(list);
		dataGridResult.setTotal(total);
		return dataGridResult;
	}

}
