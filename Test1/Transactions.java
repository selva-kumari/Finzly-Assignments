
public class Transactions {
final int productKey=112002;
Transactions(){
	System.out.println("you have to purchase a antivirus");
}
 Transactions(int p) {
	 if(antivirus(p)==true) {
		 System.out.println("Trasaction Sucessfull");
	 }
	 else {
		 System.out.println("Make a transaction");
	 }
	
		
	}
 public boolean antivirus(int p) {
	 if(productKey==p) {
		
		 return true;
	 }
	 else {
		 return false;
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transactions a=new Transactions();
		Transactions a1=new Transactions(112001);
		

	}

}
