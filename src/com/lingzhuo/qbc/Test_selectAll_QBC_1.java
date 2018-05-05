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
 * @ClassName: Test_selectAll_QBC_1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月12日 下午2:00:33
 *
 */
public class Test_selectAll_QBC_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
	    CustomerEntity e=new CustomerEntity();
	    
	    try {
			List<CustomerEntity> list=dao.selectAll_QBC_1("Jones",new BigDecimal(9870));//查询单行
			for(CustomerEntity e1:list){
				System.out.println(e1.getCusno()+":"+e1.getCusnames()+":"+e1.getBirthday()+":"+e1.getSal());
			}
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

}
