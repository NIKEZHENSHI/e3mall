package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.E3mallService;


@Controller
public class E3mallTest {
	@Autowired
    private E3mallService service;
	@RequestMapping("/test/{ItemID}")
	@ResponseBody
	public TbItem test(@PathVariable long ItemID){
		TbItem item=service.test(ItemID);
		return item;
	}
}
