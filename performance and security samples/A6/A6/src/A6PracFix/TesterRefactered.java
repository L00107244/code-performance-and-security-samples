package week6PracFix;

import java.util.InputMismatchException;

import java.util.Scanner;

import Week6Prac.Human;



public class TesterRefactered
{
	private static final int exitNumber = 3;
	private static final int MinimiumAge = 1;
	private static final int MaximumAge = 120;
	private static final String addresscheck = "Co.";
	private static final String heightcheck = "ft";
	private static final String weightcheck = "kg";
	public static void main(String [] args)
	  {
		  int menu_option;
		  @SuppressWarnings("resource")
		Scanner keyIn = new Scanner(System.in);
		  Human human = new Human();
		  
		  
		  do{
			  System.out.println("Human Menu");
			  System.out.println("\t1. Add Human");
			  System.out.println("\t2. View Humans");
			  System.out.println("\t3. press 3 to exit");
			  System.out.println("Enter Menu option [1|2|3]");
			  menu_option = keyIn.nextInt();
	
				  
			  
			  switch(menu_option)
			  {
			  case 1: System.out.println("Add A human");
			          keyIn.nextLine();
			          System.out.println("\n\nEnter name: ");
			          String n = keyIn.nextLine();
			          human.setName(n);
			          System.out.println("\n\nEnter Age: ");
			          int a = keyIn.nextInt();
			          if(a < MinimiumAge || a > MaximumAge)
			          {
			        	  do{
			        	  try
			        	  {
			        	  throw new IllegalArgumentException("AGE IS INVALID.");
			        	  }
			          catch(InputMismatchException | IllegalArgumentException iEA)
			          {
							System.out.println("Incorrect please enter a age between 1 and 120");
							
							System.out.print("RE-ENTER AGE:");
							a = keyIn.nextInt();
			        	  
			          }
			          catch(Exception e)
			        	{
							System.out.println("An Error Occurred.");
						}
			        	  }while(a < MinimiumAge ||a > MaximumAge);
			          }
			       
			          human.setAge(a);
			          keyIn.nextLine();
			         
			          System.out.println("\n\nEnter Addresss: ");
			          String add = keyIn.nextLine();
			          if(!add.contains(addresscheck))
			          {
			        	do{
			        	  try
			        	  {
			        	  throw new IllegalArgumentException("Address IS INVALID.");
			        	  }
			          catch( IllegalArgumentException iEA)
			          {
							System.out.println("Incorrect address please input a Co for county");
							
							System.out.print("\n\nRE-ENTER address:");
							add = keyIn.nextLine();
			        	  
			          }
			        	 
			          catch(Exception e)
			        	{
							System.out.println("An Error Occurred.");
						}
			        	 			        	  
			        	}
			        	while(!add.contains(addresscheck)); 
			          }
			          human.setAddres(add);
			          System.out.println("\n\nEnter Height: ");
			          String h = keyIn.nextLine();
			          if(!h.contains(heightcheck))
			          {
			        	do{
			        	  try
			        	  {
			        	  throw new IllegalArgumentException("height IS INVALID.");
			        	  }
			          catch( IllegalArgumentException iEA)
			          {
							System.out.println(" please input  ft for height");
							
							System.out.print("\n\nRE-ENTER address:");
							h = keyIn.nextLine();
			        	  
			          }
			        	 
			          catch(Exception e)
			        	{
							System.out.println("An Error Occurred.");
						}
			        	 			        	  
			        	}
			        	while(!add.contains(addresscheck)); 
			          }
			          human.setHeight(h);
			          System.out.println("\n\nEnter Weight: ");
			          String w = keyIn.nextLine();
			          if(!w.contains(weightcheck))
			          {
			        	do{
			        	  try
			        	  {
			        	  throw new IllegalArgumentException("Weight IS INVALID.");
			        	  }
			          catch( IllegalArgumentException iEA)
			          {
							System.out.println("Incorrect address please input a kg for weight");
							
							System.out.print("\n\nRE-ENTER weight:");
							w = keyIn.nextLine();
			        	  
			          }
			        	 
			          catch(Exception e)
			        	{
							System.out.println("An Error Occurred.");
						}
			        	 			        	  
			        	}
			        	while(!w.contains(weightcheck)); 
			          }
			          human.setWeight(w);
			          break;
			          
			  case 2: System.out.println("View all humans");
			          System.out.println(human.getName());
			          System.out.println(human.getAge());
			          System.out.println(human.getAddress());
			          System.out.println(human.getHeight());
			          System.out.println(human.getweight());
			          break;
			  case 3: System.out.println("Goodbye!!!");
			  break;
			  default: System.out.println("Invalied option");
			  }
		  }
		  while(menu_option !=exitNumber);
		  
		  
		  
	  }
}
