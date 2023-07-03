package com.webosmotic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.webosmotic.modal.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        Configuration cng=new Configuration();
        cng.configure("hibernate.cnfg.xml");
        SessionFactory sessionFactory = cng.buildSessionFactory();
        
        
        Employee employee=new Employee();
        employee.setEmpName("Gagan");
        employee.setEmpAddress("Adazan Surat");
        
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        System.out.println("Data Inserted...");
        transaction.commit();
        session.close();
     sessionFactory.close();
        
        
        
    }
}
