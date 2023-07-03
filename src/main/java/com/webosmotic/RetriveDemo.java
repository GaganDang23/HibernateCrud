package com.webosmotic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.webosmotic.modal.Employee;

public class RetriveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cnfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		 session.get(Employee.class, 1);
		 System.out.println("Data Retrived...");
         session.close();
         sessionFactory.close();
         
	}

}
