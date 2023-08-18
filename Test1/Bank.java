import java.util.*;
public class Bank {
	private String name;
	private long anum;
	private long bal;
	public void Setname(String name) {
		this.name=name;
	}
	public void Getname() {
		System.out.println("Name: "+name);
	}
	public void Setnum(long anum) {
		if(anum>0) {
			this.anum=anum;
		}
		else {
		System.out.println("Invalid account number");
	}
	}
	public void Getnum(){
		System.out.println(anum);
	}
	public void Setbal(long bal) {
		if(bal>0) {
			this.bal=bal;
		}
		else {
			System.out.println("Invalid balance");
		}
	}
		

	public void Getbal() {
		System.out.println(bal);
	}
	public long deposit(int a) {
		if(a!=0) {
		bal+=a;
		}
		return bal;
	}
	public long withdraw(int a) {
		bal-=a;
		return bal;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.Setname("selva");
		b.Getname();
		System.out.print("The account number is ");
		b.Setnum(1749098);
		b.Getnum();
		System.out.print("The balance is ");
		b.Setbal(50000);
		b.Getbal();
		System.out.println("Deposited ammount " +b.deposit(500));
		System.out.println("Withdraw ammount " +b.withdraw(100));

	}

}
