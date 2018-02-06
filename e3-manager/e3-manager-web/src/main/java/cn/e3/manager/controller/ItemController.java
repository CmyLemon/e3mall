package cn.e3.manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@RestController
public class ItemController {
	/*
	  * 根据id查询商品对象
	  * 参数 : Long itemid
	  * 返回值 : TbItem
	  * */
	
	//注入itemService
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("item/{itemId}")
	public TbItem findById(@PathVariable Long itemId){
		TbItem tbItem = itemService.findById(itemId);
		return tbItem;
	}
}
