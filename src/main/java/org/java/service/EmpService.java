package org.java.service;

import java.util.List;
import java.util.Map;


/**
 * 员工信息
 * @author monkey
 *
 */
public interface EmpService {

	//根据部门编号查询员工信息
	public List<Map<String, Object>> getAllEmpById(int did,int start,int size);
	
	//查询条数
	public int getCount(int did);
	
	//根据编号查询员工
	public Map<String, Object> getOne(int eid);
	
	//删除
	public void del(int eid);
	
	//添加
	public void add(String name,int gender,int age,String post,String tel,String address,int did);
	
	//修改
	public void update(int eid,String name,int gender,int age,String post,String tel,String address,int did);
}
