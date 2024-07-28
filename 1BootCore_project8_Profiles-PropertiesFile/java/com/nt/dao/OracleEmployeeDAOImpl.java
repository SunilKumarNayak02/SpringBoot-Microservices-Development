package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("OraempDAO")
@Profile({"uat","prod"})
public class OracleEmployeeDAOImpl implements IEmployeeDAO {
	//SQL Query
	private static final String GET_EMPS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private DataSource  ds;

	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.getEmployeesByDesgs():: DataSource obj class name::"+ds.getClass());
		 List<Employee> list=null;
		try( // get Pooled jdbc con object
				Connection con=ds.getConnection();
				//create The PreparedStatement object
				PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESGS);){
			  //set the query param value
			 ps.setString(1, desg1); ps.setString(2, desg2); ps.setString(3, desg3);
			 //execute  the Query
			 list=new ArrayList<Employee>();
			 try(ResultSet rs=ps.executeQuery()){
				   //copy the records of ResultSet obj to  ArrayList Collection
				  while(rs.next()) {
					  //copy each record to Employee class object
					  Employee emp=new Employee();
					  emp.setEmpno(rs.getInt(1));
					  emp.setEname(rs.getString(2));
					  emp.setJob(rs.getString(3));
					  emp.setSalary(rs.getFloat(4));
					  emp.setDeptno(rs.getInt(5));
					  //add each Employee object List Collection
					  list.add(emp);
				  }//while
				 
			 }//try with resource
			
		}//try  with resource
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}

}
