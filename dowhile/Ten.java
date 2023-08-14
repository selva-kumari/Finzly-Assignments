package Dowhile;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		System.out.println("The Even Numbers: ");
		do{
			//if(i%2==0) {
				System.out.print(i+" ");
			//}
			i+=2;
		}while(i<=n) ;
		System.out.println("\n");
		i=0;
		System.out.println("The Odd Numbers: ");
		do{
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=n);
	}

}
