/**
 * 
 */
package com.lingzhuo.sqltest;

import java.math.BigDecimal;
import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;

/**
 * @ClassName: Test_SelectAll_2
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����11:48:42
 *
 */
public class Test_SelectAll_2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CustomerDao dao=new CustomerDaoImpl();
	try {
		List list=dao.selectAll_sql_2("%J%", new BigDecimal(200));//���ʴ��ڵ���200
		for(int i=0;i<list.size();i++){
			Object items=list.get(i);
			System.out.println(items);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
