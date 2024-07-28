package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;


@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO  empDAO;

	@Override
	public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		// convert the desgs to uppercase Letters
		  desg1=desg1.toUpperCase();  //CLERK
		  desg2=desg2.toUpperCase();  //MANAGER
		  desg3=desg3.toUpperCase();  //SALESMAN
		  
		  
		// use DAO
		List<Employee> list=empDAO.getEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}

}
