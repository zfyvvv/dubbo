package com.zfy.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.rpc.cluster.router.file.FileRouterFactory;
import com.zfy.dubbo.service.MenuDubboService;
import com.zfy.mapper.MenuMapper;
import com.zfy.pojo.Menu;

public class MenuDubboServiceImpl implements MenuDubboService{

	//该类已经被spring容器管理，在dubbo的配置文件中；
	@Resource
	private MenuMapper menuMapper;
	
	@Override
	public List<Menu> selAll() {
		//查询所有的列表；
		List<Menu> list = menuMapper.selAll();
		//查询所有的父菜单；
		for(Menu m:list) {
			//先判断有父菜单；
			if(m.getPid()!=0) {
			//通过m的pid查询出父菜单Menu;然后进行设置；
			m.setParent(menuMapper.selById(m.getPid()));
			}
			//查询当前菜单的子菜单；m的子菜单，通过m的id-->Pid,pid处的对象，即时它的子菜单；
			m.setChildren(menuMapper.selByPid(m.getId()));
		}
		return list;
	}
	//修改指定menu对象
	@Override
	public int updMenu(Menu menu) {
		return menuMapper.updMenu(menu);
	}
	//根据id找寻指定对象；
	@Override
	public Menu selById(int id) {
		return menuMapper.selById(id);
	}

}
