/**
 * 
 */
package com.lingzhuo.hql;

import java.math.BigDecimal;
import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;
import com.lingzhuo.entity.CustomerEntity;

/**
 * @ClassName: Test_selectAll_HQL
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����5:01:12
 *
 */
public class Test_selectAll_HQL {
	public static void main(String[] args) {
	 CustomerDao dao=new CustomerDaoImpl();
		
		try {
			List<CustomerEntity> list=dao.selectAll_HQL();//���ʴ��ڵ���200
			for(CustomerEntity e:list){
				System.out.println(e.getCusno()+":"+e.getCusnames()+":"+e.getBirthday()+":"+e.getSal());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}


