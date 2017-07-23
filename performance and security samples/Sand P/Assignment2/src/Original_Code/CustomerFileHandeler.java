package Original_Code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerFileHandeler
{
	//creates array list of customer
   private ArrayList <Customer> customers;
   //calls in the scanner
   private Scanner keyBoard = new Scanner(System.in);

   //default constructor 
   public CustomerFileHandeler()
   {
	   //sets customers to array list
	   customers = new ArrayList<Customer>();
   }
   //add method
   public void add()
   {
	   Customer Cust = new Customer();
	   //call read method here
	   Cust.read();
	   // call it a differnt object
	   customers.add(Cust);
	   
   }
   //write record to file method
   public void writeARecordToFile()
   {
	   try{
		   
	   FileOutputStream fileStream = new FileOutputStream("Customer.bin");
	   ObjectOutputStream outStream = new ObjectOutputStream(fileStream);
	   outStream.writeObject(customers);
	   outStream.close();
	   }
	   catch(FileNotFoundException fnfe)
	   {
		   System.out.println("Cannot create file to store Customer");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	 }
	   
	   
   //read method from file method
   public void readRecordsFromFile()
   {
	 try{
		 FileInputStream fileStream = new FileInputStream("Customer.bin");
		 ObjectInputStream InputStream = new ObjectInputStream(fileStream);
		 customers =( ArrayList<Customer>)InputStream.readObject();
		 InputStream.close();
		
	 }
	 catch(FileNotFoundException fNFE)
	 {
		 System.out.println("file has not been found");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
   }
   //list method
   public void List()
   {
	  //creates for loop to print out customers
	 for(Customer custF: customers)
		 System.out.println(custF);
   }
   //Veiw method
   public void veiw()
   {
	   System.out.println("Enter the name of the customer you are searching for:");
	   int custIdToGet = keyBoard.nextInt();
	   //for loop to print out a certin customer
	   for(Customer custF: customers)
	   {
		   if(custF.getID() == custIdToGet)
		   {
			   System.out.print(custF);
		   }
	   }
   }
   //delete method
   public void Delete()
   {
	   System.out.println("Enter ID of customer to delete: ");
	   int CustomerToDelete = keyBoard.nextInt();
	   //for loop to loop threw customers 
	   for(Customer CustF: customers)
	   {
		   if(CustF.getID() == CustomerToDelete)
		   {
		     System.out.println(CustF);
		     //deletes a record from a file
		     customers.remove(CustF);
		     
		     break;
		   }
	   }
   }
   //Edit method
   public void Edit()
   {
	   System.out.println(" Enter ID of customer to edit");
	   int CustomerToEdit = keyBoard.nextInt();
	   //for loop to loop threw customers
	   for(Customer CustF: customers)
	   {
		   if(CustF.getID() == CustomerToEdit)
		   {
			   System.out.println(CustF);
			   //get videos index
			   int index = customers.indexOf(CustF);
			   //read in a new video and...
			   CustF.read();
			   //reset the object in videoList
			   customers.set(index, CustF);
			   break;
		   }
	   }
   }
   
   
   
}

