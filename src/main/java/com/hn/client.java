package com.hn;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class client {
    public static void main(String [] rag) {
    	Configuration cfg =new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(Mobile.class);
    	System.out.println("Hibernate.Cfg.Xml File LOAded And Anotted classs added");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	System.out.println("Session is open");
    	Mobile m=new Mobile(101,"OneP",3000);
    	s.saveOrUpdate(m);
    	s.beginTransaction().commit();
    	System.out.println("Data Inserted");
    	Criteria c=s.createCriteria(Mobile.class);
    	c.addOrder(Order.desc("mobId"));
    	
    	List <Mobile> l=c.list();
    	if(l.isEmpty()) {
    		System.out.println("No Data Found");
    	}
    	else {
    	for(Mobile m1:l) {
    		System.out.println(m1);
    	}}
    	
    	s.close();
    	sf.close();
    	System.out.println("Closed");
    }
}
