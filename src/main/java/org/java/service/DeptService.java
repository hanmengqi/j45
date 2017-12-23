package org.java.service;

import java.util.List;
import java.util.Map;

/**
 * 部门信息
 * @author monkey
 *
 */
public interface DeptService {

	//查询所有部门
	public List<Map<String, Object>> getAllDept();
}
