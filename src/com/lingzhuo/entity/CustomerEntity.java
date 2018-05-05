/**
 * 
 */
package com.lingzhuo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: CustomerEntity
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月11日 下午4:52:10
 *
 */
public class CustomerEntity implements Serializable{

	private Integer cusno;
	private String  cusnames;
	private BigDecimal sal;
	private Date birthday;
	public CustomerEntity(){}
	public CustomerEntity(Integer cusno,String cusnames,BigDecimal sal,Date birthday){
		this.cusno=cusno;
		this.cusnames=cusnames;
		this.sal=sal;
		this.birthday=birthday;
	}
	
	public Integer getCusno() {
		return cusno;
	}
	public void setCusno(Integer cusno) {
		this.cusno = cusno;
	}
	public String getCusnames() {
		return cusnames;
	}
	public void setCusnames(String cusnames) {
		this.cusnames = cusnames;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
