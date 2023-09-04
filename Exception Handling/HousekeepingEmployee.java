package ExceptionHandling;
class HousekeepingEmployee extends Employee {
    public HousekeepingEmployee(int id, String name, int age) {
        super(id, name, age);
    }

    public void cleanRoom() {
        System.out.println("Cleaning the room...");
    }

	
}