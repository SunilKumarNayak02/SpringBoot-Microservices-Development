package com.nt.model;

import lombok.Data;

@Data //gvies  settrs , getters ,toString, equals(-),hashCode() and etc,, methods
public class Employee {
	private  Integer empno;
	private String ename;
	private  String job;
	private   Float salary;
	private  Integer deptno;

}
