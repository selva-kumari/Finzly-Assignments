package com.hibernateLibrary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// BookManagement book=new BookManagement();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add Book");
			System.out.println("2.Search Book");
			System.out.println("3.Update Book");
			System.out.println("4.Delete Book");
			System.out.println("5.Exit");
			System.out.println("Enter the choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				BookManagement.addBook();
				break;
				case 2:
					BookManagement.searchBook();
					break;
				case 3:
					BookManagement.updateBook();
					break;
				case 4:
					BookManagement.deleteBook();
					break;
				case 5:
					System.out.println("Exiting..");
					break;
			default:
				System.out.println("Invalid choice");
				break;

			}
		}

	}

}
