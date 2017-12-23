package org.java.dao;

import java.util.List;
import java.util.Map;

/**
 * 部门信息
 * @author monkey
 *
 */
public interface DeptMapper {

	//查询所有部门
	public List<Map<String, Object>> getAllDept();
	
}
