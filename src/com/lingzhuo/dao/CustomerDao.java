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
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月11日 下午5:08:39
 *
 */
public interface CustomerDao {
	public void saveCustomerEntity(CustomerEntity entity)throws Exception;
	public void deleteCustomerEntity(CustomerEntity entity)throws Exception;
	public CustomerEntity selectById(Integer cusno)throws Exception;
	public void updateCustomerEntity(CustomerEntity entity)throws Exception;
	
	 //查询：原生sql查询 例如：查询工资高于500 名字模糊查询；可以封装到泛型如下：
	public List<CustomerEntity> selectAll_sql(String cusname,BigDecimal sal)throws Exception; 
	 //查询：原生sql查询 例如：查询工资高于500 名字模糊查询；不封装到泛型如下：
	public List selectAll_sql_1(String cusname,BigDecimal sal)throws Exception;
	 //查询：原生sql查询 例如：查询工资高于500 名字模糊查询；不封装到泛型如下：
	public List selectAll_sql_2(String cusname,BigDecimal sal)throws Exception;
	
	 //QBE  Query by Example 
	public List<CustomerEntity> selectAll_QBE(CustomerEntity entity)throws Exception;
	
	 //QBC query by criteria
	public List<CustomerEntity> selectAll_QBC()throws Exception;
	 //例如：查询工资高于500 名字模糊查询； 
	public List<CustomerEntity> selectAll_QBC_1(String cusname,BigDecimal sal)throws Exception;
	 //例如：按照birthday 分组，统计工资平均值
	public List selectAll_QBC_2() throws Exception;
	 //按照名字模糊查询，按照工资between and
	public List<CustomerEntity> selectAll_QBC_3(String cusname,BigDecimal minsal,BigDecimal maxsal)throws Exception;
	 //HQL查询  Hibernate自带查询语句
	
	public List<CustomerEntity> selectAll_HQL()throws Exception;
	
	public List<CustomerEntity> selectAll_HQL_1(String cusname,BigDecimal sal)throws Exception;
	
	public List<CustomerEntity> selectAll_HQL_2(String cusname,BigDecimal sal)throws Exception;
	
	public List selectAll_HQL_3(String cusname,BigDecimal sal)throws Exception;
	
	public List<Map<String,Object>> selectAll_HQL_4()throws Exception;
	//两个表联合查询，不配置关联关系
	public List<EmpEntity> selectAll_HQL_5()throws Exception;
	//查询每个部门平均工资以及该部门员工信息
	public List selectAll_HQL_6()throws Exception;
	
	
	
	
	
	

}
