package Whileloop;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint i=-45;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0, evensum=0,oddsum=0;
		
		while(i<=n){
			if(i%2==0) {
				evensum+=i;
            }
			else {
				oddsum+=i;
			}
			i++;
		
	}
System.out.println("The sum of Even: "+evensum);
System.out.println("The sum of Odd: "+oddsum);

	}

}
