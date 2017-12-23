package org.java.service.impl;

import java.util.List;
import java.util.Map;

import org.java.dao.DeptMapper;
import org.java.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 部门信息
 * @author monkey
 *
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper mapper;
	
	@Override
	public List<Map<String, Object>> getAllDept() {
		return mapper.getAllDept();
	}

}
