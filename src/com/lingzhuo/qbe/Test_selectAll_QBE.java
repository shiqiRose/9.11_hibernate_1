/**
 * 
 */
package com.lingzhuo.qbe;

import java.math.BigDecimal;
import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;
import com.lingzhuo.entity.CustomerEntity;

/**
 * @ClassName: Test_selectAll_QBE
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����11:58:59
 *
 */
public class Test_selectAll_QBE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
	    CustomerEntity e=new CustomerEntity();
	    e.setCusnames("Jones");
	    e.setSal(new BigDecimal(9870));
	    try {
			List<CustomerEntity> list=dao.selectAll_QBE(e);//��ֵ������ѯ
			for(CustomerEntity e1:list){
				System.out.println(e1.getCusno()+":"+e1.getCusnames()+":"+e1.getBirthday()+":"+e1.getSal());
			}
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

}
