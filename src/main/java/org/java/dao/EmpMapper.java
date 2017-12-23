package org.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * Ա����Ϣ
 * @author monkey
 *
 */
public interface EmpMapper {

	//���ݲ��ű�Ų�ѯԱ����Ϣ
	public List<Map<String, Object>> getAllEmpById(@Param("did") int did,@Param("start") int start,@Param("size") int size);
	
	//��ѯ����
	public int getCount(@Param("did") int did);
	
	//���ݱ�Ų�ѯԱ��
	public Map<String, Object> getOne(@Param("eid") int eid);
	
	//ɾ��
	public void del(@Param("eid") int eid);
	
	//���
	public void add(@Param("name") String name,@Param("gender") int gender,@Param("age") int age,@Param("post") String post,@Param("tel") String tel,@Param("address") String address,@Param("did") int did);

	//�޸�
	public void update(@Param("eid") int eid,@Param("name") String name,@Param("gender") int gender,@Param("age") int age,@Param("post") String post,@Param("tel") String tel,@Param("address") String address,@Param("did") int did);
}
