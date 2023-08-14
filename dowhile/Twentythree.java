package Dowhile;

public class Twentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c=0,i=0;
		System.out.print(a+" "+b+" ");
		do
		{	
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		i++;
	}while(i<=6);
	}

}
