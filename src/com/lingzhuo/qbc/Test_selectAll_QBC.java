/**
 * 
 */
package com.lingzhuo.qbc;

import java.math.BigDecimal;
import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;
import com.lingzhuo.entity.CustomerEntity;

/**
 * @ClassName: Test_selectAll_QBC
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����12:08:40
 *
 */
public class Test_selectAll_QBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
	    CustomerEntity e=new CustomerEntity();
	    
	    try {
			List<CustomerEntity> list=dao.selectAll_QBC();//��ѯ���еļ�¼
			for(CustomerEntity e1:list){
				System.out.println(e1.getCusno()+":"+e1.getCusnames()+":"+e1.getBirthday()+":"+e1.getSal());
			}
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

}
