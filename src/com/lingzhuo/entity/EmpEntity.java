/**
 * 
 */
package com.lingzhuo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: EmpEntity
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月12日 下午7:27:32
 *
 */
public class EmpEntity implements Serializable{
	 private Integer empno;
	 private String ename;
	 private String job;
	 private Integer mgr;
	 private Date hiredate;
	 private BigDecimal sal;
	 private BigDecimal comm;
	 private Integer deptno;
	 private DeptEntity dept;
	 public EmpEntity(){}
	 public EmpEntity(Integer empno, String ename, Integer deptno,String dname) {
		
		this.empno = empno;
		this.ename = ename;
	
		this.dept=new DeptEntity();
		this.dept.setDeptno(deptno);
		this.dept.setDname(dname);
		
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	public BigDecimal getComm() {
		return comm;
	}
	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public DeptEntity getDept() {
		return dept;
	}
	public void setDept(DeptEntity dept) {
		this.dept = dept;
	}
	 

}
