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
 * @ClassName: Test_selectAll_QBC_2
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����2:04:38
 *
 */
public class Test_selectAll_QBC_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
	   // CustomerEntity e=new CustomerEntity();
	    
	    try {
			List list=dao.selectAll_QBC_2();//ģ����ѯ��ѯ  ���ʸ���980��
			for(int i=0;i<list.size();i++){
				Object[] items=(Object[]) list.get(i);
				System.out.println(items[0]+":"+items[1]+":"+items[2]);
			}
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
}
