
class CheckingAccount extends BankAccount {
	double overDraftLimit=50000;
	public void withdraw(double ammount) {
		if(ammount>getBalance())
		{
		if(ammount-getBalance()<=overDraftLimit) {
		System.out.println("you have to use the overdraft system");
	    }
		 else{
				System.out.println("additional charge 500 take it from your account");
			}
	   
	}
		else {
		System.out.println("The withdraw ammount is "+( getBalance()-ammount));
		}
	}
	    

	public static void main(String[] args) {
		
		

	}

}
