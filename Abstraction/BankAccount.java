
public abstract class BankAccount {
	String accountnumber;
	String name;
    double balance;
	
	String getAccountNumber(){
		return accountnumber;
	}
	String getName(){
		return name;
	}
	double getBalance()
	{
		return balance;
	}
	double deposit() {
		return balance;
	}
	abstract void withdraw(double ammount); 
	public static void main(String[] args) {
		
        SavingsAccount s=new SavingsAccount("13272","vjselva",50000);
		CheckingAccount c=new CheckingAccount();
		System.out.println("The name is "+s.getName());
		System.out.println("The AccountNumber is "+s.getAccountNumber());
		System.out.println("The Balance is "+s.getBalance());
		s.deposit(10000);
		s.withdraw(5000);
		c.withdraw(10000);
		

	}

}
