/**
 * 
 */
package com.lingzhuo.hql;

import java.util.List;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.daoImpl.CustomerDaoImpl;
import com.lingzhuo.entity.EmpEntity;

/**
 * @ClassName: Test_selectAll_HQL_5
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����8:41:38
 *
 */
public class Test_selectAll_HQL_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerDao dao=new CustomerDaoImpl();
		   // CustomerEntity e=new CustomerEntity();
		    
		    try {
				List<EmpEntity> list=dao.selectAll_HQL_5();//ģ����ѯ��ѯ  ���ʸ���980��
				for(int i=0;i<list.size();i++){
					EmpEntity e=list.get(i);
					System.out.println(e.getEmpno()+":"+e.getEname()+":"+e.getDept().getDeptno()+":"+e.getDept().getDname());
				}
				
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

	}

}
