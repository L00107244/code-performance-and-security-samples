package Original_Code;

/**
 * Name: Stephen Curran
 * Student Number: L00107244
 * Date 05/11/2015
 * Assignment Stage 2
 */

import java.util.Scanner;

public class Menu
{
  //creates option variable
  private int option;
  //Display method
  public void Display()
  {
	  //prints out add option
	  System.out.println("\t1. add");
	  //prints out list option
	  System.out.println("\t2. List");
	  //prints out veiw option
	  System.out.println("\t3. Veiw");
	  //prints out edit option
	  System.out.println("\t4 Edit");
	  //prints out delete option
	  System.out.println("\t5 Delete");
	  //prints out Quit option
	  System.out.println("\t6 Quit");
  }
  //read method
  public void readOption()
  {
	  Scanner keyIn = new Scanner(System.in);
	  //allows user to enter option
	  System.out.println("\n\t Enter Option: [1|2|3|4|5|6] ");
	  option=keyIn.nextInt();
	  
  }
  // return option
  public int getOption()
  {
	  return option;
  }
}