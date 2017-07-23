package Original_Code;

import java.util.Scanner;

public class CustomerTester
{
  public static void main(String[] args)
  {
	  //calls in scanner 
	   Scanner keyBoard = new Scanner(System.in);
	   //calls in customer file handler class
	  CustomerFileHandeler cfh = new CustomerFileHandeler();
	  //calls in menu class
	  Menu menu = new Menu();
	  //do while loop
	  do
	  {
		  //displays the menu
		  menu.Display();
		  //reads option from the user
		  menu.readOption();
		  
		  switch(menu.getOption())
		  {
		  //case 1 is to add a user
		  case 1: cfh.add();
		  break;
		//case 1 is to add a user
		  case 2: cfh.List();
		  break;
		//case 1 is to add a user
		  case 3: cfh.veiw();
		  break;
		//case 1 is to add a user
		  case 4: cfh.Edit();
		  break;
		//case 1 is to add a user
		  case 5: cfh.Delete();
		  break;
		//case 1 is to add a user
		  case 6: System.out.print("Goodbye!");
		  break;
		//case 1 is to add a user
		  default: System.out.println("Invalied option entered");
			  
		  }
	  }
	  //while loop
	   while(menu.getOption() != 6);
	  //writes recrds to file
	  cfh.writeARecordToFile();
  	    
  }
}

