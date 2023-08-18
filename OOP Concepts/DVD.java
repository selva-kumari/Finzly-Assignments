
public class DVD extends LibraryItem {
	private int duration;
    DVD(String title, int itemId,int duration) {
		super(title, itemId);
		this.duration=duration;
	}
    int getDuration() {
    	return duration;
    }
   public void displayInfo() {
		
		super.displayInfo();
		System.out.println("Duration "+getDuration());
	}
    
	public static void main(String[] args) {
		

	}

}
