package com.zfy.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zfy.dubbo.service.MenuDubboService;
import com.zfy.pojo.Menu;
import com.zfy.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	//dubboµÄÒýÓÃ£»
	@Reference
	private MenuDubboService menuDubboService;

	@Override
	public List<Menu> show() {
		// TODO Auto-generated method stub
		return menuDubboService.selAll();
	}

	@Override
	public Map<String, Object> showMenu(int id) {
		Map<String, Object> map=new HashMap<>();
		map.put("menu",menuDubboService.selById(id));
		map.put("allmenu",menuDubboService.selAll());
		return map;
	}

	@Override
	public int update(Menu menu) {
		// TODO Auto-generated method stub
		return menuDubboService.updMenu(menu);
	}
}
