package com.zfy.service;

import java.util.List;
import java.util.Map;

import com.zfy.pojo.Menu;

public interface MenuService {
	//��ѯȫ��
	List<Menu> show();
	
	//��ѯȫ������ǰ�ڵ㣻
	Map<String, Object> showMenu(int id);
	
	//����ָ��id�Ķ���
	int update(Menu menu);
	

}
