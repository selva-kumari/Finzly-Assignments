package Whileloop;

public class Twentythree {
public static void main(String args[]) {
	int a=0,b=1;
	int c=0,i=0;
	System.out.print(a+" "+b+" ");
	while(i<=6)
	{	
	c=a+b;
	a=b;
	b=c;
	System.out.print(c+" ");
	i++;
}
}}
