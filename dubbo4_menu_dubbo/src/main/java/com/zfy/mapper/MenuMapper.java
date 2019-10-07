package com.zfy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zfy.pojo.Menu;

public interface MenuMapper {
	
	//查询所有菜单
	@Select("Select * from menu")
	List<Menu> selAll();
	
	//根据查询处理的ID，找父菜单，通过pid;
	@Select("select * from menu where id=#{0}")
	Menu selById(int id);
	
	//通过修改页面传递的三个值，进行 修改
	@Update("update menu set pid=#{pid},name=#{name} where id=#{id}")
	int updMenu(Menu menu);
	
	//重新所有菜单的子菜单；
	@Select("select * from menu where pid=#{0}")
	List<Menu> selByPid(int pid);

}
