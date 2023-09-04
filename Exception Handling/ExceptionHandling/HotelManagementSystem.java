package ExceptionHandling;
import java.util.ArrayList;
import java.util.List;
public class HotelManagementSystem{
    private List<FrontDeskEmployee> frontDeskEmployees = new ArrayList<>();
    private List<HousekeepingEmployee> housekeepingEmployees = new ArrayList<>();

    public void hireFrontDeskEmployee(int id, String name, int age) throws DuplicateEmployeeException {
        for (FrontDeskEmployee employee : frontDeskEmployees) {
            if (employee.getId() == id) {
                throw new DuplicateEmployeeException("Employee with ID " + id + " already exists.");
            }
        }
        FrontDeskEmployee employee = new FrontDeskEmployee(id, name, age);
        frontDeskEmployees.add(employee);
    }

    public void hireHousekeepingEmployee(int id, String name, int age) throws DuplicateEmployeeException {
        for (HousekeepingEmployee employee : housekeepingEmployees) {
            if (employee.getId() == id) {
                throw new DuplicateEmployeeException("Employee with ID " + id + " already exists.");
            }
        }
        HousekeepingEmployee employee = new HousekeepingEmployee(id, name, age);
        housekeepingEmployees.add(employee);
    }

    public void displayFrontDeskEmployees() {
        System.out.println("Front Desk Employees:");
        for (FrontDeskEmployee employee : frontDeskEmployees) {
            employee.displayInfo();
        }
    }

    public void displayHousekeepingEmployees() {
        System.out.println("Housekeeping Employees:");
        for (HousekeepingEmployee employee : housekeepingEmployees) {
            employee.displayInfo();
        }
    }

    public static void main(String[] args) {
        HotelManagementSystem hotelManagementSystem = new HotelManagementSystem();

        try {
            hotelManagementSystem.hireFrontDeskEmployee(1,"selva", 21);
            hotelManagementSystem.hireFrontDeskEmployee(2,"vjselva",22);
            hotelManagementSystem.hireHousekeepingEmployee(3,"monica",23);
            hotelManagementSystem.hireFrontDeskEmployee(1,"fake",22);
        } catch (DuplicateEmployeeException e) {
            System.out.println("Duplicate found.." + e.getMessage());
        }

        hotelManagementSystem.displayFrontDeskEmployees();
        hotelManagementSystem.displayHousekeepingEmployees();
    }
}
class DuplicateEmployeeException extends Exception {
    public DuplicateEmployeeException(String message) {
        super(message);
    }
}

class InvalidTaskAssignmentException extends Exception {
    public InvalidTaskAssignmentException(String message) {
        super(message);
    }
}

