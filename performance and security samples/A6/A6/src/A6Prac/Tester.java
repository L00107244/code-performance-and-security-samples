package Week6Prac;

import java.util.*;

public class Tester
{
  public static void main(String [] args)
  {
	  int menu_option;
	  Scanner keyIn = new Scanner(System.in);
	  Human human = new Human();
	  
	  
	  do{
		  System.out.println("Human Menu");
		  System.out.println("\t1. Add Human");
		  System.out.println("\t2. View Humans");
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
		          human.setAge(a);
		          keyIn.nextLine();
		          System.out.println("\n\nEnter Addresss: ");
		          String add = keyIn.nextLine();
		          human.setAddres(add);
		          System.out.println("\n\nEnter Height: ");
		          String h = keyIn.nextLine();
		          human.setHeight(h);
		          System.out.println("\n\nEnter Weight: ");
		          String w = keyIn.nextLine();
		          human.setWeight(w);
		          break;
		          
		  case 2: System.out.println("View all humans");
		          System.out.println(human.getName());
		          System.out.println(human.getAge());
		          System.out.println(human.getAddress());
		          System.out.println(human.getHeight());
		          System.out.println(human.getweight());
		          break;
		  }
	  }
	  while(menu_option !=3);
	  
	  
	  
  }
}
