package com.nineleaps.app.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="emp_table")
public class EmployeeDto {

	@Id
	@GeneratedValue
	@Column(name="eid")
	private int eid;
	@Column(name="ename")

	private  String name;
	@Column(name="edesig")

	private String desig;
	@Column(name="emanager")
@ManyToOne(cascade=CascadeType.ALL)
	private EmployeeDto manager;
	

	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDto [eid=" + eid + ", name=" + name + ", desig="
				+ desig + ", manager=" + manager + "]";
	}
	
	
}
