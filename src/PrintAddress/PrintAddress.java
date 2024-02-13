package PrintAddress;
import java.util.Scanner;

public class PrintAddress {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String firstName;
		String lastName;
		String streetAddress;
		String city;
		String zipCode;
		
		System.out.println("Enter your first name: ");
		firstName = scnr.nextLine();
		
		System.out.println("Enter your last name: ");
		lastName = scnr.nextLine();
		
		System.out.println("Enter your street address: ");
		streetAddress = scnr.nextLine();
		
		System.out.println("Enter your City: ");
		city = scnr.next();
		
		System.out.println("Enter your zipcode: ");
		zipCode = scnr.next();
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(streetAddress);
		System.out.println(city);
		System.out.println(zipCode);
		
		scnr.close();
	}

}
