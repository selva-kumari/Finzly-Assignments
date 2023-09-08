package com.hibernateLibrary;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.hibernateLibrary.*;

public class BookManagement {
static Scanner sc=new Scanner(System.in);
public static void addBook(){
	SessionFactory sf = Hibernate.getSessionFactory();
	Session session = sf.openSession();
    org.hibernate.Transaction tr = session.beginTransaction();
	System.out.println("Enter the title of book:");
	String title =sc.nextLine();
	System.out.println("Enter the author name:");
	String author=sc.nextLine();
	System.out.println("Enter the publication year:");
	int year=sc.nextInt();
	System.out.println("Enter the book ISBN:");
	int isbn=sc.nextInt();
	Book book1=new Book();
	book1.setTitle(title);
	book1.setAuthor(author);
	book1.setYear(year);
	book1.setIsbn(isbn);
	session.save(book1);
	tr.commit();
	session.close();
	
	}


public static void searchBook() {
	while(true) {
	System.out.println("Searching books..");
	System.out.println("1.search book by isbn number");
	System.out.println("2.search book by author");
	System.out.println("3.search book by title");
	System.out.println("4.search the book by year");
	System.out.println("5.display available books");
	System.out.println("6.Exit");
	System.out.println("enter your choice:");
	int choice=sc.nextInt();
	if(choice==1) {
		SessionFactory sf = Hibernate.getSessionFactory();
		Session session = sf.openSession();
	    org.hibernate.Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Book.class);
        System.out.println("Enter ISBN Number");
        int isbn = sc.nextInt();
        criteria.add(Restrictions.eq("isbn",isbn));
        List<Book> list = criteria.list();
		for (Book library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
	}
	else if(choice==2) {
		SessionFactory sf = Hibernate.getSessionFactory();
		Session session = sf.openSession();
	    org.hibernate.Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Book.class);
        sc.nextLine();
        System.out.println("Enter the author name:");
        String author = sc.nextLine();
        criteria.add(Restrictions.eq("author",author));
        List<Book> list = criteria.list();
		for (Book library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
	}
	else if(choice==3) {
		SessionFactory sf = Hibernate.getSessionFactory();
		Session session = sf.openSession();
	    org.hibernate.Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Book.class);
        System.out.println("Enter the title name:");
        String title = sc.nextLine();
        criteria.add(Restrictions.eq("title",title));
        List<Book> list = criteria.list();
		for (Book library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
	}
	else if(choice==4) {
		SessionFactory sf = Hibernate.getSessionFactory();
		Session session = sf.openSession();
	    org.hibernate.Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Book.class);
        System.out.println("Enter the year by searching:");
        int fromyear=sc.nextInt();
        int endyear=sc.nextInt();
        criteria.add(Restrictions.between("year",fromyear,endyear));
        List<Book> list = criteria.list();
		for (Book library : list) {
			System.out.println(library);
		}
		tr.commit();
		session.close();
	}
	else if(choice==5) {
		SessionFactory sf = Hibernate.getSessionFactory();
		Session session = sf.openSession();
	    org.hibernate.Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Book.class);
        System.out.println("Displaying the available books");
        List<Book> list = criteria.list();
		for (Book library : list) {
			System.out.println("The available books are:"+library);
		}
		tr.commit();
		session.close();
	}
	else if(choice==6) {
		System.out.println("you are exiting..");
		System.exit(0);
	}
	else {
		System.out.println("Invalid choice please choose correct option");
	}

}}
	public static void updateBook(){
		SessionFactory sf = Hibernate.getSessionFactory();
		Session session = sf.openSession();
	    org.hibernate.Transaction tr = session.beginTransaction();
		System.out.println("Enter the title of book:");
		String title =sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the author name:");
		String author=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the publication year:");
		int year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the book ISBN:");
		int isbn=sc.nextInt();
		sc.nextLine();
		Book book1=new Book();
		book1.setTitle(title);
		book1.setAuthor(author);
		book1.setYear(year);
		book1.setIsbn(isbn);
		session.update(book1);
		tr.commit();
		session.close();
		
		}
	public static void deleteBook() {
		SessionFactory sf = Hibernate.getSessionFactory();
		Session session = sf.openSession();
	    org.hibernate.Transaction tr = session.beginTransaction();
        System.out.println("enter isbn number for delete the book :");
        int isbn=sc.nextInt();
        sc.nextLine();
        Book book2=new Book();
       book2.setIsbn(isbn);
       session.delete(book2);
		tr.commit();
		session.close();
	}
}
