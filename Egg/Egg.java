import java.util.*;
public class Egg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		long sum=0;
		long e=1;
		for(int i=2;i<38;i++) {
			sum=(long)Math.pow(e,i);
			e+=sum;
			System.out.println(e);
		}
		

	}

}
