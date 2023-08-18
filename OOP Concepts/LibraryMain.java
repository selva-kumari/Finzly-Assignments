
public class LibraryMain{

	public static void main(String[] args) {
		LibraryItem b=new Book("VjSelva","Motivation",101);
        b.displayInfo();
        LibraryItem d=new DVD("Success",120,15);
        d.displayInfo();
        StudentMember s=new StudentMember(21,"abi");
        s.borrowitem(b);
        FacultyMember f=new FacultyMember(2,"Moni");
        f.borrowitem(d);
	}

}
