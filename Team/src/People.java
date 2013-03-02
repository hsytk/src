import java.util.*;
public class People {
	public String lastName;
	public String firstName;
	public String emailAddress;
	public int zip;
	Scanner scan = new Scanner(System.in);
	StreetAddress address= new StreetAddress();
	public void setLastName(String newLastName){
		lastName = newLastName;
	}
	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}
	public void setemailAddress(String newEmail){
		emailAddress = newEmail;
	}
	public void setAddress(){
		System.out.println("House: ");
		address.setHouse(scan.nextLine());
		System.out.println("City: ");
		address.setCity(scan.nextLine());
		System.out.println("State: ");
		address.setState(scan.nextLine());
		System.out.println("Country: ");
		address.setCountry(scan.nextLine());
		System.out.println("Zip: ");
		address.setZip(scan.nextLine());
	}

}
