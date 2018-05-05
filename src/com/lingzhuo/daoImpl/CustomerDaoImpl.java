/**
 * 
 */
package com.lingzhuo.daoImpl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.StringType;
import org.hibernate.type.Type;

import com.lingzhuo.dao.CustomerDao;
import com.lingzhuo.entity.CustomerEntity;
import com.lingzhuo.entity.EmpEntity;

/**
 * @ClassName: CustomerDaoImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月11日 下午5:10:24
 *
 */
public class CustomerDaoImpl implements CustomerDao{
	private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#saveCustomerEntity(com.lingzhuo.entity.CustomerEntity)
	 */
	public CustomerDaoImpl(){
		Configuration config=new Configuration().configure("/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry  = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		sessionFactory=config.buildSessionFactory(serviceRegistry);
	}
	
	@Override
	public void saveCustomerEntity(CustomerEntity entity) throws Exception {
		// TODO Auto-generated method stub
		
		
		Session session =sessionFactory.openSession();
		//开始事务
		Transaction tran=session.beginTransaction();
		session.save(entity);
		tran.commit();
		session.close();
		
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#deleteCustomerEntity(com.lingzhuo.entity.CustomerEntity)
	 */
	@Override
	public void deleteCustomerEntity(CustomerEntity entity) throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		//开启事务
		Transaction tran=session.beginTransaction();
		session.delete(entity);
		tran.commit();
		session.close();
		
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectById(java.lang.Integer)
	 */
	@Override
	public CustomerEntity selectById(Integer cusno) throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		CustomerEntity  cus=(CustomerEntity) session.get(CustomerEntity.class, cusno);
		session.close();
		return cus;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#updateCustomerEntity(com.lingzhuo.entity.CustomerEntity)
	 */
	@Override
	public void updateCustomerEntity(CustomerEntity entity) throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		//开始事务
		Transaction tran=session.beginTransaction();
		session.update(entity);
		tran.commit();
		session.close();
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_sql(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	public List<CustomerEntity> selectAll_sql(String cusname, BigDecimal sal)
			throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		String sql="select cusno,cusnames,sal,birthday from customer where cusnames like ? and sal>? ";
		SQLQuery query =session.createSQLQuery(sql);
		query.addEntity(CustomerEntity.class);//设置查询行记录封装到那个实体
		query.setString(0, cusname);
		query.setBigDecimal(1, sal);
		List<CustomerEntity> list=query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_sql_1(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	public List selectAll_sql_1(String cusname, BigDecimal sal)
			throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		String sql="select cusno,cusnames,sal,birthday from customer where cusnames like ? and sal>? ";
		SQLQuery query =session.createSQLQuery(sql);
		//query.addEntity(CustomerEntity.class);//设置查询行记录封装到那个实体
		query.setString(0, cusname);
		query.setBigDecimal(1, sal);
		List list=query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_sql_2(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	public List selectAll_sql_2(String cusname, BigDecimal sal)
			throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		String sql="select cusnames from customer where cusnames like ? and sal>? ";//只查询姓名
		SQLQuery query =session.createSQLQuery(sql);
		//query.addEntity(CustomerEntity.class);//设置查询行记录封装到那个实体
		query.setString(0, cusname);
		query.setBigDecimal(1, sal);
		List list=query.list();//注意：如果只查询一列，此时每行记录放Object中，而不是数组中
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_QBE(com.lingzhuo.entity.CustomerEntity)
	 */
	@Override
	public List<CustomerEntity> selectAll_QBE(CustomerEntity entity)
			throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Criteria cri=session.createCriteria(CustomerEntity.class);
		cri.add(Example.create(entity));//按照实体中字段等值条件判断查询，但是排除主键条件
		List<CustomerEntity> list=cri.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_QBC()
	 */
	@Override
	public List<CustomerEntity> selectAll_QBC() throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Criteria cri=session.createCriteria(CustomerEntity.class);
		List<CustomerEntity> list=cri.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_QBC_1(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	public List<CustomerEntity> selectAll_QBC_1(String cusname, BigDecimal sal)
			throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Criteria cri=session.createCriteria(CustomerEntity.class);
		
		cri.add(Restrictions.like("cusnames",cusname));//注意：第一个参数是实体类中的属性名
		cri.add(Restrictions.ge("sal", sal));
		cri.addOrder(Order.desc("sal"));//排序
		
		List<CustomerEntity> list=cri.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_QBC_2()
	 */
	@Override
	public List selectAll_QBC_2() throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Criteria cri=session.createCriteria(CustomerEntity.class);
		
		ProjectionList proList=Projections.projectionList();
		
		proList.add(Projections.count("cusnames"));
		proList.add(Projections.avg("sal"));
		proList.add(Projections.groupProperty("birthday"));
		cri.setProjection(proList);
		
		List list=cri.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_QBC_3(java.lang.String, java.math.BigDecimal, java.math.BigDecimal)
	 */
	@Override
	public List<CustomerEntity> selectAll_QBC_3(String cusname,
			BigDecimal minsal, BigDecimal maxsal) throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Criteria cri=session.createCriteria(CustomerEntity.class);
		
		cri.add(Restrictions.sqlRestriction(" cusnames like ? and sal between ? and ? ", 
				new Object[]{cusname,minsal,maxsal}, 
				new Type[]{StringType.INSTANCE,BigDecimalType.INSTANCE,BigDecimalType.INSTANCE}));
		
		
		List<CustomerEntity> list=cri.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_HQL()
	 */
	@Override
	public List<CustomerEntity> selectAll_HQL() throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		//Hibernate: select customeren0_.cusno as cusno1_0_, customeren0_.cusnames as cusnames2_0_,
		//customeren0_.sal as sal3_0_, customeren0_.birthday as birthday4_0_ from scott.customer customeren0_
		Query query =session.createQuery("from CustomerEntity");
		List<CustomerEntity> list=query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_HQL_1(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	public List<CustomerEntity> selectAll_HQL_1(String cusname, BigDecimal sal)
			throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Query query=session.createQuery("select e from CustomerEntity e where e.cusnames like ? and  e.sal >? ");
		
		query.setString(0, cusname);
		query.setBigDecimal(1, sal);
		List<CustomerEntity> list=query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_HQL_2(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	public List<CustomerEntity> selectAll_HQL_2(String cusname, BigDecimal sal)
			throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Query query=session.createQuery("select new CustomerEntity(e.cusno,e.cusnames,e.sal,e.birthday) from "
				+ "CustomerEntity e  where  e.cusnames like ? and e.sal>? and  e.birthday>=? ");
		query.setString(0, cusname);
		query.setBigDecimal(1, sal);
		query.setDate(2, Date.valueOf("2017-10-19"));
		List<CustomerEntity> list=query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_HQL_3(java.lang.String, java.math.BigDecimal)
	 */
	@Override
	public List selectAll_HQL_3(String cusname, BigDecimal sal)
			throws Exception {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select e.cusno,e.cusnames,e.sal,e.birthday from CustomerEntity e "
				+ "where e.cusnames like ? and e.sal > ?");
		query.setString(0, cusname);
		query.setBigDecimal(1, sal);
		List list=query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_HQL_4()
	 */
	@Override
	public List<Map<String, Object>> selectAll_HQL_4() throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Query query=session.createQuery("select new Map(e.cusno as a,e.cusnames as b,e.sal as c,e.birthday as d) from "
				+ "CustomerEntity e");		
		List<Map<String,Object>> list =query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_HQL_5()
	 */
	@Override
	public List<EmpEntity> selectAll_HQL_5() throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Query query=session.createQuery("select new EmpEntity(e.empno,e.ename,d.deptno,d.dname ) from EmpEntity e,DeptEntity d"
				+ " where e.deptno=d.deptno ");
	
		List<EmpEntity> list=query.list();
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.lingzhuo.dao.CustomerDao#selectAll_HQL_6()
	 */
	@Override
	public List selectAll_HQL_6() throws Exception {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Query query=session.createQuery("select avg(d.sal) ,d.deptno,e.empno,e.ename,e.hiredate from EmpEntity e,EmpEntity d"
				+ " where e.deptno=d.deptno group by d.deptno,e.empno,e.ename,e.hiredate" );
		List list=query.list();
		session.close();
		return list;
	}

}
