package com.hibernateLibrary;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

	public final class Hibernate {
		
		private Hibernate(){
		}
		
		public static SessionFactory getSessionFactory(){
	        Configuration configuration = new Configuration();
	        configuration.configure();
	        configuration.addAnnotatedClass(Book.class);
	        SessionFactory sf = configuration.buildSessionFactory();
	        return sf;
	    }

	
}
