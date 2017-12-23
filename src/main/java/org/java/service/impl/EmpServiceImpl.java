package org.java.service.impl;

import java.util.List;
import java.util.Map;

import org.java.dao.EmpMapper;
import org.java.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 员工信息
 * @author monkey
 *
 */
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper mapper;
	
	@Override
	public List<Map<String, Object>> getAllEmpById(int did, int start, int size) {
		return mapper.getAllEmpById(did, start, size);
	}

	@Override
	public int getCount(int did) {
		return mapper.getCount(did);
	}

	@Override
	public Map<String, Object> getOne(int eid) {
		return mapper.getOne(eid);
	}

	@Override
	public void del(int eid) {
		mapper.del(eid);
	}

	@Override
	public void add(String name, int gender, int age, String post, String tel,
			String address, int did) {
		mapper.add(name, gender, age, post, tel, address, did);
	}

	@Override
	public void update(int eid, String name, int gender, int age,
			String post, String tel, String address, int did) {
		mapper.update(eid, name, gender, age, post, tel, address, did);
	}

}
