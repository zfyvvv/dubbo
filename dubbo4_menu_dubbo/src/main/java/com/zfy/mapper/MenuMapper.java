package com.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zfy.pojo.Menu;

public interface MenuMapper {
	
	//��ѯ���в˵�
	@Select("Select * from menu")
	List<Menu> selAll();
	
	//���ݲ�ѯ�����ID���Ҹ��˵���ͨ��pid;
	@Select("select * from menu where id=#{0}")
	Menu selById(int id);
	
	//ͨ���޸�ҳ�洫�ݵ�����ֵ������ �޸�
	@Update("update menu set pid=#{pid},name=#{name} where id=#{id}")
	int updMenu(Menu menu);
	
	//�������в˵����Ӳ˵���
	@Select("select * from menu where pid=#{0}")
	List<Menu> selByPid(int pid);

}
