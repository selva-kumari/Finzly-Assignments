package Whileloop;
import java.util.*;
public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		System.out.println("The Even Numbers: ");
		while(i<=n) {
			//if(i%2==0) {
				System.out.print(i+" ");
			//}
			i+=2;
		}
		System.out.println("\n");
		i=0;
		System.out.println("The Odd Numbers: ");
		while(i<=n) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
