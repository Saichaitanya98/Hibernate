package com.sai.chaitu;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;


import com.Entity.Student;

public class ReadStudentDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session abc=factory.getCurrentSession();
		try {
			System.out.println("creating.....");
			Student a=new Student("sunny","sunny","sunny@gmail.com");
			abc.beginTransaction();
			abc.save(a);
			abc.getTransaction().commit();
			System.out.println(a);
			System.out.println(a.getId());
			Student ab=abc.get(Student.class,a.getId());
			System.out.println("id= "+a.getId());
			System.out.println(ab);
			System.out.println("Done :)");
			
			
		} catch (Exception e) {

		}
	}

}
