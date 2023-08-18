
public abstract class LibraryMember {
    int memberId;
    String name;
    
	public LibraryMember(int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	public void borrowitem(LibraryItem i) {
		System.out.println("Member id "+memberId);
		System.out.println("Name "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
