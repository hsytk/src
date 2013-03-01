import java.util.*;
/**
 * This is the main of the program, represent the UI 
 * of the program.
 * @author Jim
 *
 */
public class Main {
	/**
	 * main, contains all the actions user will use.
	 * @param args
	 */
	public static void main(String args[]){
		int indexNumber= 1;  //initiate index number to 1.
		ContactArray array;
		array= new ContactArray(); //create the new ContactArray type
		Scanner scan = new Scanner(System.in); //construct a new scanner
		System.out.println("welcome to contact list arranger! \nWhat do you want to do? \nPlease type in the index number.\n\n");
		// welcome sentences displayed on console.
		while (indexNumber != 6){  //a while loop that make users to use the program functions over and over until user hit exit.
			System.out.println("1. Create new contact. \n2. Print the contact list.\n3. Search by last name.\n4. Search by Email.\n5. Search by Zip code.\n6. Exit.");
			// print out the instruction and index numbers to console
			indexNumber = scan.nextInt();// read user selection from console
			switch(indexNumber){  // a switch statement that run different statements after choosing function by user.
			case 1: array.newPeople(); // add a new contact
					break;
			case 2: System.out.println(array.toString());// print out all contacts
					break;
			case 3: System.out.println(array.searchByName());// search contacts by last name
					break;
			case 4: System.out.println(array.searchByEmail());// search contacts by email address
					break;
			case 5: System.out.println(array.searchByZip());//display all contacts who have the same zip code
					break; //this is a test of Git change
			case 6: System.exit(0); // exit the program when selected
			}
		}
	}

}
