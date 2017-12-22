package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;


@Controller
public class ItemControlller {
	@Autowired
    private ItemService service;
	@RequestMapping("/test/{ItemID}")
	@ResponseBody
	public TbItem test(@PathVariable long ItemID){
		TbItem item=service.test(ItemID);
		return item;
	}
	@RequestMapping("/item/list")
	@ResponseBody
	public DataGridResult findall(int page,int rows){
		DataGridResult dataGridResult=service.findall(page,rows);
		return dataGridResult;
	}
}
