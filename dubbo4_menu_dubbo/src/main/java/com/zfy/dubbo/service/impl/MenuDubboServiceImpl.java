package com.zfy.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.rpc.cluster.router.file.FileRouterFactory;
import com.zfy.dubbo.service.MenuDubboService;
import com.zfy.mapper.MenuMapper;
import com.zfy.pojo.Menu;

public class MenuDubboServiceImpl implements MenuDubboService{

	//�����Ѿ���spring����������dubbo�������ļ��У�
	@Resource
	private MenuMapper menuMapper;
	
	@Override
	public List<Menu> selAll() {
		//��ѯ���е��б�
		List<Menu> list = menuMapper.selAll();
		//��ѯ���еĸ��˵���
		for(Menu m:list) {
			//���ж��и��˵���
			if(m.getPid()!=0) {
			//ͨ��m��pid��ѯ�����˵�Menu;Ȼ��������ã�
			m.setParent(menuMapper.selById(m.getPid()));
			}
			//��ѯ��ǰ�˵����Ӳ˵���m���Ӳ˵���ͨ��m��id-->Pid,pid���Ķ��󣬼�ʱ�����Ӳ˵���
			m.setChildren(menuMapper.selByPid(m.getId()));
		}
		return list;
	}
	//�޸�ָ��menu����
	@Override
	public int updMenu(Menu menu) {
		return menuMapper.updMenu(menu);
	}
	//����id��Ѱָ������
	@Override
	public Menu selById(int id) {
		return menuMapper.selById(id);
	}

}
