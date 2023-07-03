package com.webosmotic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.webosmotic.modal.Employee;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cnfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Employee employee=new Employee();
		employee.setEmpName("Ganesh");

		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.delete(employee);
		System.out.println("Data Deleted....");
		beginTransaction.commit();
		session.close();
		sessionFactory.close();
		
		
		
	}

}
