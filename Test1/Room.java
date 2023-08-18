
public class Room {
private int roomNumber;
private int capacity;
private int pricePerNight;
private String check_in;
private String check_out;
	public Room(int roomNumber, int capacity, int pricePerNight) {
	this.roomNumber = roomNumber;
	this.capacity = capacity;
	this.pricePerNight = pricePerNight;
}
	public boolean checkAvailable(int persons) {
		if(capacity>=persons) {
			return true;
		}
		else {
			return false;
		}
	}
	public void reservation(int persons) {
		if(checkAvailable(persons)==true) {
			System.out.println("Room is no "+roomNumber+" available");
			System.out.println("The price is: "+pricePerNight);
		}
		else {
			System.out.println("go other rooms");
		}
	}
	public void reservation(int persons,String check_in,String check_out) {
		if(checkAvailable(persons)==true) {
			System.out.println("Your room is reserved");
			
		}
		else {
			System.out.println("go other rooms");
		}
	}

	public static void main(String[] args) {
	Room r=new Room(1,4,2000);
    r.reservation(7);
    r.reservation(2,"17-8-2023","18-8-23");
 
	}

}
