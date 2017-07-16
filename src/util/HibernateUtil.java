package util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil{
	private static SessionFactory sessionFactory;
	private static Session session;
	
	static {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()  .configure()  .build();  
	    try {  
	        sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();  
	    }  
	    catch (Exception e) {  
	        StandardServiceRegistryBuilder.destroy( registry );  
	    } 

	}
	//获取会话工厂
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	//获取会话
	public static Session getSession() {
		session=sessionFactory.openSession();
		return session;
	}
	//关闭会话
	public static void closeSession(Session session) {
		if (session!=null) {
			session.close();
		}
	}
	
}
