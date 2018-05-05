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
 * @ClassName: Test_selectAll_HQL_2
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����7:02:17
 *
 */
public class Test_selectAll_HQL_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
	    try {
			List<CustomerEntity> list=dao.selectAll_HQL_2("%J%", new BigDecimal(300));
			for(CustomerEntity e:list){
				System.out.println(e.getCusno()+":"+e.getCusnames()+":"+e.getBirthday()+":"+e.getSal());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
