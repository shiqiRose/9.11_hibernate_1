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
 * @ClassName: Test_selectAll_QBC_3
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����2:04:50
 *
 */
public class Test_selectAll_QBC_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
	  
	    
	    try {
			List<CustomerEntity> list=dao.selectAll_QBC_3("%J%",new BigDecimal(980),new BigDecimal(20000));//ģ����ѯ��ѯ  ���ʸ���980��
			for(CustomerEntity e1:list){
				System.out.println(e1.getCusno()+":"+e1.getCusnames()+":"+e1.getBirthday()+":"+e1.getSal());
			}
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
}
