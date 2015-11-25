package com.nineleaps.app.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nineleaps.app.dto.EmployeeDto;

public class EmployeeDao {

	
	
	public boolean saveEmp(EmployeeDto dto)
	{ 
		
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(dto);
		
		
		transaction.commit();
		session.close();
		
		
		
		
		return true;
		
		
		
	}
	
}
