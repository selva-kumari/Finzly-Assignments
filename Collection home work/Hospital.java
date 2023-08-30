package Collection;

import java.util.HashMap;
import java.util.Scanner;
public class Hospital {
	private int patientId;
	private String patientName;
	private long mobileNumber;
	private String prescription;

	public Hospital(int patientId, String patientName, long mobileNumber, String prescription) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.prescription = prescription;
	}
	public int getId() {
		return patientId;
	}
	@Override
	public String toString() {
		return "Hospital [patientId=" + patientId + ", patientName=" + patientName + ", mobileNumber=" + mobileNumber
			+ ", prescription=" + prescription + "]";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Hospital>hospital=new HashMap<>();
		System.out.println("Welcome to Hospital Management System");
		while(true) {
			System.out.println("1.Add Patients");
			System.out.println("2.Patient Details");
			System.out.println("3.Search Id by get Details");
			System.out.println("4.List of all Patient Details");
			System.out.println("Enter the option");
			int option=sc.nextInt();
			switch(option) {
				case 1:
					System.out.println("Add Patient Details");
					System.out.println("Enter Patient id:");
					int patientId=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Patient name:");
					String patientName=sc.nextLine();
					sc.nextLine();
					System.out.println("Enter Mobile number:");
					long mobileNumber=sc.nextLong();
					sc.nextLine();
					System.out.println("Enter Patient prescription:");
					String prescription=sc.nextLine();
					hospital.put(patientId, new Hospital(patientId,patientName,mobileNumber,prescription));
					System.out.println("Patient details added sucessfully");
					break;

				case 2:
					System.out.println("Patient Details");
					for(Hospital h:hospital.values()) {
						System.out.println(h);
					}
					break;
				case 3:
					System.out.println("Enter the Searching Id");
					int searchId=sc.nextInt();
					Hospital patientDetail = hospital.get(searchId);
					if(patientDetail!=null)
					{
						System.out.println(patientDetail);
					}
					else
					{
						System.out.println("Invalid patient id ...");
					}
			}

		}
	}

}