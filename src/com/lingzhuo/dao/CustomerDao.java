/**
 * 
 */
package com.lingzhuo.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.lingzhuo.entity.CustomerEntity;
import com.lingzhuo.entity.EmpEntity;

/**
 * @ClassName: CustomerDao
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��11�� ����5:08:39
 *
 */
public interface CustomerDao {
	public void saveCustomerEntity(CustomerEntity entity)throws Exception;
	public void deleteCustomerEntity(CustomerEntity entity)throws Exception;
	public CustomerEntity selectById(Integer cusno)throws Exception;
	public void updateCustomerEntity(CustomerEntity entity)throws Exception;
	
	 //��ѯ��ԭ��sql��ѯ ���磺��ѯ���ʸ���500 ����ģ����ѯ�����Է�װ���������£�
	public List<CustomerEntity> selectAll_sql(String cusname,BigDecimal sal)throws Exception; 
	 //��ѯ��ԭ��sql��ѯ ���磺��ѯ���ʸ���500 ����ģ����ѯ������װ���������£�
	public List selectAll_sql_1(String cusname,BigDecimal sal)throws Exception;
	 //��ѯ��ԭ��sql��ѯ ���磺��ѯ���ʸ���500 ����ģ����ѯ������װ���������£�
	public List selectAll_sql_2(String cusname,BigDecimal sal)throws Exception;
	
	 //QBE  Query by Example 
	public List<CustomerEntity> selectAll_QBE(CustomerEntity entity)throws Exception;
	
	 //QBC query by criteria
	public List<CustomerEntity> selectAll_QBC()throws Exception;
	 //���磺��ѯ���ʸ���500 ����ģ����ѯ�� 
	public List<CustomerEntity> selectAll_QBC_1(String cusname,BigDecimal sal)throws Exception;
	 //���磺����birthday ���飬ͳ�ƹ���ƽ��ֵ
	public List selectAll_QBC_2() throws Exception;
	 //��������ģ����ѯ�����չ���between and
	public List<CustomerEntity> selectAll_QBC_3(String cusname,BigDecimal minsal,BigDecimal maxsal)throws Exception;
	 //HQL��ѯ  Hibernate�Դ���ѯ���
	
	public List<CustomerEntity> selectAll_HQL()throws Exception;
	
	public List<CustomerEntity> selectAll_HQL_1(String cusname,BigDecimal sal)throws Exception;
	
	public List<CustomerEntity> selectAll_HQL_2(String cusname,BigDecimal sal)throws Exception;
	
	public List selectAll_HQL_3(String cusname,BigDecimal sal)throws Exception;
	
	public List<Map<String,Object>> selectAll_HQL_4()throws Exception;
	//���������ϲ�ѯ�������ù�����ϵ
	public List<EmpEntity> selectAll_HQL_5()throws Exception;
	//��ѯÿ������ƽ�������Լ��ò���Ա����Ϣ
	public List selectAll_HQL_6()throws Exception;
	
	
	
	
	
	

}
