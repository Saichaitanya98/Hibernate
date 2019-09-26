package com.sai.chaitu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session abc=factory.getCurrentSession();
		try {
			System.out.println("creating.....");
			Student a1=new Student("preetam","preetam","preetam@gmail.com");
			Student a2=new Student("ganesh","ganesh","gabesh@gmail.com");
			Student a3=new Student("chaitu","sai","saicc@gmail.com");

			abc.beginTransaction();
			abc.save(a1);
			abc.save(a2);
			abc.save(a3);

			abc.getTransaction().commit();
			System.out.println("Done :)");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
