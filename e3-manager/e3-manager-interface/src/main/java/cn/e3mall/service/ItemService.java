package cn.e3mall.service;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {

	TbItem test(long itemID);

	DataGridResult findall(int page, int rows);

}
