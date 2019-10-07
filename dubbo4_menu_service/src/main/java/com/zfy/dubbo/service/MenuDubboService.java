package com.zfy.dubbo.service;

import java.util.List;

import com.zfy.pojo.Menu;

public interface MenuDubboService {
	//查询所有Menu对象
	List<Menu> selAll();
	
	//修改指定Menu对象
	int updMenu(Menu menu);
	
	//通过Id查找对象，并进行修改；
	Menu selById(int id);
}
