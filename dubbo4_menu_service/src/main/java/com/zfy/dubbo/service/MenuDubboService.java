package com.zfy.dubbo.service;

import java.util.List;

import com.zfy.pojo.Menu;

public interface MenuDubboService {
	//��ѯ����Menu����
	List<Menu> selAll();
	
	//�޸�ָ��Menu����
	int updMenu(Menu menu);
	
	//ͨ��Id���Ҷ��󣬲������޸ģ�
	Menu selById(int id);
}
