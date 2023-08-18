
public class FacultyMember extends LibraryMember {
FacultyMember(int memberId,String name){
	super(memberId,name);
}
public void borrowitem(LibraryItem i) {
	System.out.println("Member id "+memberId);
	System.out.println("Name "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
