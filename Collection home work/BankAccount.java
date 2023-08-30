package Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class BankAccount {
	private String customerName;
	private long accountNumber;
	private double balance;
	private long mobileNumber;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<BankAccount> bankAccountDetails =new ArrayList<>();
	BankAccount(String name,long number,long act){
		customerName=name;
		mobileNumber=number;
		accountNumber=act;
     	balance=0;
	}
	public Long getaccountNUmber()
	{
		return accountNumber;
	}
	public void setBalance(double balance){
		this.balance =balance;
	}
	public double getBalance(){
		return balance;
	}
	@Override
	public String toString() {
		return "BankAccount [customerName=" + customerName + ", accountNumber=" + accountNumber + ", balance=" + balance
			+ "]";
	}
	public static BankAccount getAccountDetail(Long accountNumber)
	{
		for(BankAccount bankAccount : bankAccountDetails)
		{
			if(bankAccount.getaccountNUmber().equals(accountNumber)) return bankAccount;
		}
		return null;
	}

	public static void create() {
		System.out.println("Welcome to create a account");
		System.out.println("Enter your name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your mobile number");
		long number=sc.nextLong();
		System.out.println("Enter new account number");
		long act=sc.nextLong();
		bankAccountDetails.add(new BankAccount(name,number,act));
		System.out.println("Account created successfully..");

	}
	public static void deposit() {
		System.out.println("Enter your account number to deposit:");
		Long accNumber = sc.nextLong();
		BankAccount bankAccount = getAccountDetail(accNumber);
		if(bankAccount!=null){
			System.out.println("Enter the amount to deposit:");
			bankAccount.setBalance(bankAccount.getBalance()+sc.nextDouble());
			System.out.println("Amount has been deposited succesfully ...");
			System.out.println("Your current balance is : "+bankAccount.getBalance());
		}
		else
		{
			System.out.println("NO account no exist...please check your account number");
		}
	}
	public static void withdraw() {
		System.out.println("Enter your account number to withdraw amount:");
		Long accNumber = sc.nextLong();
		BankAccount bankAccount = getAccountDetail(accNumber);
		if(bankAccount!=null){
			System.out.println("Enter the amount to withdraw:");
			double amountWithdraw = sc.nextDouble();
			if(amountWithdraw> bankAccount.getBalance())
			{
				System.out.println("Insufficient balance....");
			}
			else
			{
				bankAccount.setBalance(bankAccount.getBalance() - amountWithdraw);
				System.out.println("Amount withdrawn successfully...");
				System.out.println("Your current balance is : "+bankAccount.getBalance());
			}
		}
		else
		{
			System.out.println("No account with this account no exist...please check your account number");
		}
	}
	public static void balance() {
		System.out.println("Enter your account number to check balance:");
		Long accNumber = sc.nextLong();
		BankAccount bankAccount = getAccountDetail(accNumber);
		if(bankAccount!=null){
			System.out.println("Your current balance is : "+bankAccount.getBalance());
		}
		else
		{
			System.out.println("NO account no exist...please check your account number");
		}
	}
	public static void showAccounts() {
		System.out.println("Account Details");
		for(BankAccount account:bankAccountDetails) {
			System.out.println(account.toString());
		}
	}



	public static void main(String[] args) {
		System.out.println("Banking Application");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Check balance");
			System.out.println("5.List all accounts");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					BankAccount.create();
					break;

				case 2:
					BankAccount.deposit();
					break;

				case 3:
					BankAccount.withdraw();
					break;

				case 4:
					BankAccount.balance();
					break;

				case 5:
					BankAccount.showAccounts();
					break;
				default:
					System.out.println("Invalid choice..");
					break;
			}


		}

	}
}