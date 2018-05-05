/**
 * 
 */
package com.lingzhuo.hql;

import java.util.List;
import java.util.Map;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;

/**
 * @ClassName: Test_selectAll_HQL_4
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月12日 下午8:41:01
 *
 */
public class Test_selectAll_HQL_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDaoImpl();
		try {
			List<Map<String,Object>> items=dao.selectAll_HQL_4();
			for(int i=0;i<items.size();i++){
				Map<String,Object> map=items.get(i);
				System.out.println(map.get("a")+":"+map.get("b")+":"+map.get("c")+":"+map.get("d"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
