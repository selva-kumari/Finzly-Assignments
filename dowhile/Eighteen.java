package Dowhile;

public class Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do{
             if(i%2!=0) {
             System.out.print(i+" ");
	}
             else {
            	 System.out.print(i-(i+i)+" ");
             }
             i++;
	}while(i<=10) ;
	}

}
