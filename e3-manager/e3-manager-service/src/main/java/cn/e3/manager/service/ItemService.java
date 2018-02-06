package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {
 /*
  * 根据id查询商品对象
  * 参数 : Long itemId
  * 返回值 : TbItem
  * */
	public TbItem findById(Long itemId);
}
