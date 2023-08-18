
class SavingsAccount extends BankAccount {
	private double intrestRate;
	SavingsAccount(String accountnumber,String name,double balance){
		this.accountnumber=accountnumber;
		this.name=name;
		this.balance=balance;
	}
	String getName() {
		return name;
	}
	String getAccountNumber() {
		return accountnumber;
	}
	double getBalance() {
		return balance;
	}
	
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("The deposit ammount is "+balance);
	}
	public void withdraw(double ammount) {
		if(getBalance()-ammount<500) {
		System.out.println("You cannot withdraw the ammount");
	    }
	   else {
		System.out.println("Withdraw done!! now bal "+(getBalance()-ammount));
	}
}    

	public static void main(String[] args){
		
		
		
	}
	
	

}
