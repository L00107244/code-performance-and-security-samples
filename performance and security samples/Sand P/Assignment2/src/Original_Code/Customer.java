package Original_Code;

/**
 * Name: Stephen Curran
 * Student Number: L00107244
 * Date 05/11/2015
 * Assignment Stage 2
 */

import java.io.*;
import java.util.Scanner;
public class Customer extends Person implements Serializable
{
	// INHERITANCE - Customer IS-A Person
		 // Customer has name & phoneNumber from Person
private String emailAddress;
private int CustomerID;
private static int ID;// AND emailAddress


// Default Constructor
// Called when object is created like this ==> 
//   Customer cObj = new Customer();	
public Customer(){
super();			// NOTE:Don't need to call super()
emailAddress=null;
CustomerID = ID++;
}

// Initialization Constructor
// Called when object is created like this ==>
// Customer cObj = new Customer("Mr","Joe","Doe","0871234567","joe@hotmail.com");
public Customer(String t, String fN, String sn, String pNo, String email){
// Call super class constructor - Passing parameters required by Person ONLY!
super(t, fN, sn, pNo);
// And then initialise Customers own instance variables
emailAddress=email;
CustomerID = ID++;
}
//reads in the details of the user
public void read()throws IllegalArgumentException
{
	//calls in scanner class for an int
	Scanner KBin = new Scanner(System.in);
	//creates string scanner class
	Scanner KBString = new Scanner(System.in);
	//creates name scanner class
	Scanner KBName = new Scanner(System.in);
	System.out.println("Customer Details");
	//allows user to enter in name
	System.out.println("name: "); name.read();
	//aloows user to enter in e-mail
	System.out.println("Enter Customer E-mail: "); emailAddress =KBString.nextLine();
	 //exception handling for email if email does not contain @ error message will occur
	  if(!emailAddress.contains("@") )
		   throw new IllegalArgumentException("Email invalied");
	//allows user to enter in phone number
	System.out.println("Customer phone Number: "); phoneNumber = KBString.nextLine();
	//exception handling for phone number if phone number  does not contain 08 error message will occur
	  if(!phoneNumber.contains("08"))
		   throw new IllegalArgumentException("phone number not valied");
	
	
}
//returns the id of the user
public int getID()
{
	return CustomerID;
}

}
