package Original_Code;

public class Person 
{
		protected Name name;			// COMPOSITION - Person HAS-A name
		protected String phoneNumber;

		
		public Person(){
		   name=new Name();
		   phoneNumber=null;
		}

		// Initialisation Constructor
		// Called when object would have been created like this (not possible cos Abstract!)
		//    ==> Person pObj = new Person("Mr", "Joe", "Doe", "087 1234567");
		public Person(String t, String fN, String sn, String phoneNumber){
			name=new Name(t, fN, sn);	// Calls name initialisation constructor
			this.phoneNumber=phoneNumber;
		}

		// toString() method
		// ==> Calls Name's toString() to display name and
		//		then displays phoneNumber
		public String toString(){
			return name + "," + phoneNumber;
		}

		// equals() method
		// ==> Called when comparing an object with another object, 
		//     e.g. - if(p1.equals(p2))				
		// ==> Calls Name's equals() to compare name to personIn's name, and
		//		compares phoneNumber to personIn's phoneNumber
		public boolean equals(Person personIn){
			if(name.equals(personIn.name) &&
			   phoneNumber.equals(personIn.phoneNumber))
				return true;
			else
			   return false;
		}
				
		// set() and get() methods
		public void setName(Name nameIn){
			name = nameIn;
		}
		public Name getName(){
			return name;
		}
					
		public void setPhoneNumber(String phoneNumberIn){
			phoneNumber = phoneNumberIn;
		}
		public String getPhoneNumber(){
			return phoneNumber;
		}
	}

