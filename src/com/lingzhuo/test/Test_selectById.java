/**
 * 
 */
package com.lingzhuo.test;

import java.math.BigDecimal;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;
import com.lingzhuo.entity.CustomerEntity;

/**
 * @ClassName: Test_selectById
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����11:17:13
 *
 */
public class Test_selectById {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
		
		try {
			CustomerEntity e=dao.selectById(2);//�Ȳ�ѯ
			if(e!=null){
				e.setCusnames("tianshi");
				e.setSal(new BigDecimal(9999));
				dao.updateCustomerEntity(e);//�ٸ���
			}
			System.out.println(e.getCusno()+":"+e.getCusnames()+":"+e.getBirthday()+":"+e.getSal());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
