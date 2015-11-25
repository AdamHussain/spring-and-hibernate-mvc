package com.nineleaps.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nineleaps.app.dto.EmployeeDto;
import com.nineleaps.app.model.service.EmployeeService;

public class EmployeeController  extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
		
	String name=	req.getParameter("name");
	String desig=	req.getParameter("designation");
	String manager=	req.getParameter("manager");
	//creating dto obj and setting
EmployeeDto dto=new EmployeeDto();
dto.setName(name);
dto.setDesig(desig);
dto.setManager(manager);
	
	
	
	
		EmployeeService service=new EmployeeService();
		//passing dto obj to service
	boolean res=	service.saveEmp(dto);
	
	RequestDispatcher dispatcher=null;
	
	
	if(res==true)
		
	{
		dispatcher=req.getRequestDispatcher("success.jsp");
	}else {
		
		
		dispatcher=req.getRequestDispatcher("reg.jsp");

	}
	dispatcher.forward(req, resp);
		
		
	}
	
}
