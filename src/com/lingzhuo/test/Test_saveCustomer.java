/**
 * 
 */
package com.lingzhuo.test;

import java.math.BigDecimal;
import java.sql.Date;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;
import com.lingzhuo.entity.CustomerEntity;

/**
 * @ClassName: Test_Customer
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��11�� ����5:22:11
 *
 */
public class Test_saveCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerDao dao=new CustomerDaoImpl();
		CustomerEntity e=new CustomerEntity();
		//ɾ��
		e.setCusno(1);
		try {
			dao.deleteCustomerEntity(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		/*//���
		  e.setBirthday(Date.valueOf("2017-12-09"));
		e.setCusnames("Jones");
		e.setSal(new BigDecimal("9870"));
		try {
			dao.saveCustomerEntity(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/

	}

}
