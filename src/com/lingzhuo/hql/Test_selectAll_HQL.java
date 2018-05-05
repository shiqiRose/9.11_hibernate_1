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
 * @ClassName: Test_selectAll_HQL
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月12日 下午5:01:12
 *
 */
public class Test_selectAll_HQL {
	public static void main(String[] args) {
	 CustomerDao dao=new CustomerDaoImpl();
		
		try {
			List<CustomerEntity> list=dao.selectAll_HQL();//工资大于等于200
			for(CustomerEntity e:list){
				System.out.println(e.getCusno()+":"+e.getCusnames()+":"+e.getBirthday()+":"+e.getSal());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}


