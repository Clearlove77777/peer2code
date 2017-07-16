package test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import entity.User;
import util.HibernateUtil;

public class Maintest {
	
	@Test
	public void test1() {
		Session session=HibernateUtil.getSession();
		User user=new User("1", "1", "1", "1", "1");
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
	}
}
