/**
 * 
 */
package com.lingzhuo.hql;

import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;

/**
 * @ClassName: Test_selectAll_HQL_6
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月12日 下午8:42:01
 *
 */
public class Test_selectAll_HQL_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerDao dao=new CustomerDaoImpl();
		 
		 try {
			List  list=dao.selectAll_HQL_6();
			 for(int i=0;i<list.size();i++)
			   {   Object[] items=(Object[]) list.get(i);
			    	 System.out.println(items[0]+":"+items[1]+":"+items[2]+":"+items[3]+":"+items[4]);
			   } 
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


	}

}
