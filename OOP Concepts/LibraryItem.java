
public class LibraryItem {
   private String title;
   private int itemId;
    LibraryItem(String title,int itemId){
    	this.title=title;
    	this.itemId=itemId;
    }
    String getTitle() {
    	return title;
    }
    int getItemid() {
    	return itemId;
    }
    public void displayInfo() {
    	System.out.println("The title is "+getTitle());
    	System.out.println("The id is "+getItemid());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
