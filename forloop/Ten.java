package Forloop;

import java.util.Scanner;
public class Ten {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0,odd=0;
		System.out.print("Even Numbers are:"+" ");
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		System.out.print("Odd Numbers are:"+" ");
			for(int i=0;i<=n;i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
			
		}
		
		
	}
}
}