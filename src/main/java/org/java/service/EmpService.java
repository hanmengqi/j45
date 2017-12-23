package org.java.service;

import java.util.List;
import java.util.Map;


/**
 * Ա����Ϣ
 * @author monkey
 *
 */
public interface EmpService {

	//���ݲ��ű�Ų�ѯԱ����Ϣ
	public List<Map<String, Object>> getAllEmpById(int did,int start,int size);
	
	//��ѯ����
	public int getCount(int did);
	
	//���ݱ�Ų�ѯԱ��
	public Map<String, Object> getOne(int eid);
	
	//ɾ��
	public void del(int eid);
	
	//���
	public void add(String name,int gender,int age,String post,String tel,String address,int did);
	
	//�޸�
	public void update(int eid,String name,int gender,int age,String post,String tel,String address,int did);
}
