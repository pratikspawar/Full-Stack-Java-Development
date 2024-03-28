package com.kbp.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  Mobile mb=new Mobile();
         mb.setId(1);
         mb.setName("pratik");
        SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session sn=factory.getCurrentSession();
        Transaction ts=sn.beginTransaction();
        sn.save(mb);
        System.out.println("Done");
        ts.commit();
        sn.close();
        }
}
