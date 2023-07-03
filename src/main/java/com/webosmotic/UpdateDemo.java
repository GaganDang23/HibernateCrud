package com.webosmotic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.webosmotic.modal.Employee;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cnf=new Configuration();
		cnf.configure("hibernate.cnfg.xml");
		SessionFactory sessionFactory = cnf.buildSessionFactory();
		
		Employee employee=new Employee();
		employee.setEmpName("Ganesh");
		employee.setEmpAddress("Surat");
		
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();
		openSession.update(employee);
		System.out.println("Data Updated....");
		transaction.commit();
		openSession.close();
		sessionFactory.close();
		

	}

}
