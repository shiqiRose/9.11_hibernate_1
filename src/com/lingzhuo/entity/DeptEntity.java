/**
 * 
 */
package com.lingzhuo.entity;

import java.io.Serializable;

/**
 * @ClassName: DeptEntity
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��12�� ����7:30:47
 *
 */
public class DeptEntity implements Serializable{
	
	private Integer deptno;
	private String dname;
	private String loc;
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	

}
