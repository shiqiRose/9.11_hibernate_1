/**
 * 
 */
package com.lingzhuo.sqltest;

import java.math.BigDecimal;
import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;
import com.lingzhuo.entity.CustomerEntity;

/**
 * @ClassName: Test_SelectAll
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����11:35:42
 *
 */
public class Test_SelectAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
		
		try {
			List<CustomerEntity> list=dao.selectAll_sql("%J%", new BigDecimal(200));//���ʴ��ڵ���200
			for(CustomerEntity e:list){
				System.out.println(e.getCusno()+":"+e.getCusnames()+":"+e.getBirthday()+":"+e.getSal());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
