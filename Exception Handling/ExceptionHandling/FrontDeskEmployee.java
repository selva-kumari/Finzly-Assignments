package ExceptionHandling;
class FrontDeskEmployee extends Employee {
    public FrontDeskEmployee(int id, String name, int age) {
        super(id, name, age);
    }

    public void checkInGuests() {
        System.out.println("Checking in guests...");
    }
}








