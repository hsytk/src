/**
 * this class contains all the methods for editing the 
 * array of contacts.
 * @author Jim
 *
 */
import java.util.*;
import java.io.*;
public class ContactArray {
	public static final int total=10;
	People[] contacts = new People[total];
	Scanner scan= new Scanner(System.in);
	int a=0;
	ObjectOutputStream out;
	/**
	 * add new people
	 */
	public void newPeople(){
		boolean correct = false;
		int choose;
		while(!correct){
			contacts[a] = new People();
			System.out.println("Last name: ");
			contacts[a].setLastName(scan.nextLine());
			System.out.println("First name: ");
			contacts[a].setFirstName(scan.nextLine());
			System.out.println("Email address: ");
			contacts[a].setemailAddress(scan.nextLine());
			System.out.println("House: ");
			contacts[a].setHouse(scan.nextLine());
			System.out.println("City: ");
			contacts[a].setCity(scan.nextLine());
			System.out.println("State: ");
			contacts[a].setState(scan.nextLine());
			System.out.println("Zip: ");
			contacts[a].setZip(scan.nextLine());
			System.out.println("Country: ");
			contacts[a].setCountry(scan.nextLine());
			System.out.println("Please review, is it correct? ");
			
			System.out.println("Last Name: " + contacts[a].firstName + "\nFirst Name: " + contacts[a].lastName + "\nEamil Address: " + contacts[a].emailAddress + "\nAddress: " + contacts[a].address.toString()+"\n1.Yes.\n2. No.");
			choose = Integer.valueOf(scan.nextLine());
			if (choose != 2){
				correct = true;
				
			}
		}

		      FileOutputStream outFile;

		      ObjectOutputStream outObject;

		      try  {

		         outFile = new FileOutputStream ("data");     

		         outObject = new ObjectOutputStream(outFile);

		         outObject.writeObject(contacts[a]);

		         outFile.close();

		         outObject.close();     

		      } catch (IOException ioe)  {

		         System.out.println ("Error writing objects to the file: "+ ioe.getMessage());

		      }
			a++;
			}
	/**
	 * print out all contacts 
	 */
	public String toString(){
		return "Printing all contacts.\n\n\n\n";
	}
	/**
	 * search contacts by last name
	 * @return
	 */
	public void searchByName(){
		FileInputStream inFile;

	      ObjectInputStream inObject;

	      try  {

	         inFile = new FileInputStream("data");     

	         inObject = new ObjectInputStream(inFile);

	         contacts[1] = (People)inObject.readObject();

	         inFile.close();

	         inObject.close();     

	      } catch(IOException ioe)  {

	         System.out.println ("Error reading from the file: " + ioe.getMessage());

	      } catch (ClassNotFoundException cnfe)  {

	         System.out.println ("Error in casting to Rectangle: " + cnfe);

	      }
	      System.out.println(contacts[1].toString());
	}
	/**
	 * search contacts by email address
	 * @return
	 */
	public String searchByEmail(){
		return "Searching by Email.\n\n\n\n";
	}
	/**
	 * display all contacts who have the same zip code
	 * @return
	 */
	public String searchByZip(){
		return "Displaying everyone living in this ZIP.\n\n\n\n";
	}

}