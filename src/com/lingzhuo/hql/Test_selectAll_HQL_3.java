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
 * @ClassName: Test_selectAll_HQL_3
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����8:32:36
 *
 */
public class Test_selectAll_HQL_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
	    try {
			List list=dao.selectAll_HQL_3("%J%", new BigDecimal(300));
			for(int i=0;i<list.size();i++){
				Object[] items=(Object[]) list.get(i);
				System.out.println(items[0]+":"+items[1]+":"+items[2]+":"+items[3]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
