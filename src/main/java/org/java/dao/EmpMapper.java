package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 员工信息
 * @author monkey
 *
 */
public interface EmpMapper {

	//根据部门编号查询员工信息
	public List<Map<String, Object>> getAllEmpById(@Param("did") int did,@Param("start") int start,@Param("size") int size);
	
	//查询条数
	public int getCount(@Param("did") int did);
	
	//根据编号查询员工
	public Map<String, Object> getOne(@Param("eid") int eid);
	
	//删除
	public void del(@Param("eid") int eid);
	
	//添加
	public void add(@Param("name") String name,@Param("gender") int gender,@Param("age") int age,@Param("post") String post,@Param("tel") String tel,@Param("address") String address,@Param("did") int did);

	//修改
	public void update(@Param("eid") int eid,@Param("name") String name,@Param("gender") int gender,@Param("age") int age,@Param("post") String post,@Param("tel") String tel,@Param("address") String address,@Param("did") int did);
}
