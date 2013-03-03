import java.util.*;
public class People implements java.io.Serializable{
	public String lastName;
	public String firstName;
	public String emailAddress;
	public int zip;
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
	public void setHouse(String newHouse){
		address.setHouse(newHouse);
	}
	public void setCity(String newCity){
		address.setCity(newCity);
	}
	public void setState(String newState){
		address.setState(newState);
	}
	public void setCountry(String newCountry){
		address.setCountry(newCountry);
	}
	public void setZip(String newZip){
		address.setZip(newZip);
	}
	public String toString(){
		return lastName + firstName + emailAddress + address.toString();
	}
}
