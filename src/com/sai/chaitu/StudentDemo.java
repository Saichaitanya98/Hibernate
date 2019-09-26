package com.sai.chaitu;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;


import com.Entity.Student;

public class StudentDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session abc=factory.getCurrentSession();
		try {
			System.out.println("creating.....");
			Student a=new Student("sai","chaitu","sai@gmail.com");
			abc.beginTransaction();
			abc.save(a);
			abc.getTransaction().commit();
			System.out.println("Done :)");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
