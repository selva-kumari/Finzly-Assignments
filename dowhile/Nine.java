package Dowhile;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0, evensum=0,oddsum=0;
		
		do{
			if(i%2==0) {
				evensum+=i;
            }
			else {
				oddsum+=i;
			}
			i++;
		
	}while(i<=n);
System.out.println("The sum of Even: "+evensum);
System.out.println("The sum of Odd: "+oddsum);

	}
	}


