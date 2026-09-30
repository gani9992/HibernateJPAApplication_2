package org.gec.dao;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.gec.entity.*;

public class DaoImpl implements Dao {
public void saveStudent(Student s) {
	 SessionFactory s1=new Configuration().configure().buildSessionFactory();
	 Session s2=s1.openSession();
	 Transaction t1=s2.beginTransaction();
	 try {
	s2.save(s);
	t1.commit();
	System.out.println("object inserted successfully..!!");}
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 }
}
