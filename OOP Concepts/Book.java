
public class Book extends LibraryItem{
	  private String author;
      Book(String author,String title, int itemId) {
		super(title, itemId);
		// TODO Auto-generated constructor stub
		this.author=author;
	}
    String getAuthor() {
    	return author;
    }

	
	public void displayInfo() {
		
		System.out.println("Author name "+getAuthor());
		super.displayInfo();
		
	}
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
