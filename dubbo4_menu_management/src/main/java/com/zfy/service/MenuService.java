package com.zfy.service;

import java.util.List;
import java.util.Map;

import com.zfy.pojo.Menu;

public interface MenuService {
	//查询全部
	List<Menu> show();
	
	//查询全部及当前节点；
	Map<String, Object> showMenu(int id);
	
	//更新指定id的对象
	int update(Menu menu);
	

}
