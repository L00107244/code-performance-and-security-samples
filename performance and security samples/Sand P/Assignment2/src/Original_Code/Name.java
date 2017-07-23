package Original_Code;

import java.util.Scanner;

public class Name
{

		// Instance Variables
		private String title;
		private String firstName;	
		private String surname;		
		
		// Constructors to initialise the Instance Variables
		// Default Constructor 
		//	==> Called when a Name object is created as follows - 
		//        Name n1 = new Name();
		public Name(){
		   title=firstName=surname=null;
		}

		// Initialization Constructor
		// ==> Called when a Name object is created as follows - 
		//       Name n2 = new Name("Mr","Joe","Cole");
		public Name(String t, String fN, String sn){
		   title=t;
		   firstName=fN;
		   surname=sn;
		}
		//read method
		public void read() throws IllegalArgumentException
		{
			//allows user to enter in title
			Scanner TITLEIn = new Scanner(System.in);
			//allows user to enter in first name
			Scanner FNIn = new Scanner(System.in);
			//allows useer to enter in surname
			Scanner SNIn = new Scanner(System.in);
			System.out.println("Title "); title = TITLEIn.nextLine(); 
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////
			///////tried to add exception method to title however it will not work properly               ////////////////
			// if(!title.contains("Ms") || !title.contains("Miss") || !title.contains("Mrs") || !title.contains("MR") )///
			//	   throw new IllegalArgumentException("title invaild");                                                ///
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("First name: "); firstName = FNIn.nextLine(); 
			System.out.println("Surname: "); surname = SNIn.nextLine();
		}

		// toString() method
		// ==> Called when a String of the class is used, e.g. - 
		//       System.out.print(n1);
		//		 or System.out.print(n1.toString());
		public String toString(){
		   return title + " " + firstName + " " + surname;
		}
		
		// equals() method
		// ==> Called when comparing an object with another object, e.g. -
		//       if(n1.equals(n2))
		public boolean equals(Name n){
		   if(firstName.equals(n.firstName) && surname.equals(n.surname))
			   return true;
		   else
			   return false;
		}

		// get methods
		// ==> Called when retrieving part of an object, e.g. - 
		//       if(n1.getSurname().equals(n2.getSurname())
		public String getTitle(){
		   return title;
		}
		public String getFirstName(){
		   return firstName;
		}
		public String getSurname(){
		   return surname;
		}

		// set methods
		// ==> Called when setting part of an object, e.g. - 
		//       n1.setTitle("Mrs");
		//	     n1.setFirstName("Marge");
		//		 n1.setSurname("Simpson");
		public void setTitle(String setTitleTo){
		   title=setTitleTo;
		}
		public void setFirstName(String setFirstNameTo){
		   firstName=setFirstNameTo;
		}
		public void setSurname(String setSurnameTo){
		   surname=setSurnameTo;
		}

		public boolean isFemale(){
			if(title.equalsIgnoreCase("Miss") || 
			   title.equalsIgnoreCase("Ms") || 
			   title.equalsIgnoreCase("Mrs")) 
			    return true;
			else
			    return false;
		}
	}


