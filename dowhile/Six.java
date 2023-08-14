package Dowhile;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		do{
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}while(i<=50);
		System.out.println(sum);
	}

}
