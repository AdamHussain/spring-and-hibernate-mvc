package com.nineleaps.app.model.service;

import com.nineleaps.app.dto.EmployeeDto;
import com.nineleaps.app.model.dao.EmployeeDao;

public class EmployeeService {
EmployeeDao dao=new EmployeeDao();
	
	public boolean saveEmp(EmployeeDto dto)
	{
		
		boolean result=dao.saveEmp(dto);
		
		return result;
		
		
		
	}
	
}
