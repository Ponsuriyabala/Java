package com.suriya.ObjectRM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee suriya=new Employee();
        suriya.setId(2);
        suriya.setName("Sha.Suriya");
        suriya.setAge(23);
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);//if file default as hibernate.cfg.xml...otherwise .cofigure(file_name);
        
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf=con.buildSessionFactory(registry);
        
        
        Session session=sf.openSession();
        
        Transaction ts=session.beginTransaction();
        		session.save(suriya);
        		ts.commit();
    }
}
