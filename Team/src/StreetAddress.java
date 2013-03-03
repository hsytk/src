
public class StreetAddress implements java.io.Serializable { 
	/**
	 * define all the variables
	 */
          private String house;  
          private String city;
          private String state;
          private String zip;
          private String country;
     /**
      * set House part of the address.   
      * @param newHouse
      */
	 public void setHouse(String newHouse) {
		  house = newHouse;	 //set value for House to newHouse
	 }
	 /**
	  * set the City part of the address.
	  * @param newCity
	  */
	 public void setCity(String newCity)   { 
		  city = newCity;     //set value for City to newCity
	 }
	 /**
	  * set the State part of the address.
	  * @param newState
	  */
	 public void setState(String newState) { 
		  state = newState;   //set value for State to newState
	 }
	 /**
	  * set the Zip part of the address.
	  * @param newZip
	  */
	 public void setZip(String newZip)     { //newZip is a parameter
		  zip = newZip;       //set value for Zip to newZip	
	 }
	 /**
	  * set the Country part of the address.
	  * @param newCountry
	  */
	 public void setCountry(String newCountry){ 
		  country = newCountry;//set value for Country to newCountry
	 }
	 /**
	  * return a formatted full address.
	  */
	 public String toString(){ 
		  String address;      //create variable address to store the formatted address
		  address = house + "\n" + city + ", " +state + " " + zip + "\n" + country;
		  //Format the address
		  return address; 
	 }
}


/**
12345 El Monte Road
Los Altos Hills, CA 94022
USA
21250 Stevens Creek Blvd.
Cupertino, CA 95014
USA
**/
