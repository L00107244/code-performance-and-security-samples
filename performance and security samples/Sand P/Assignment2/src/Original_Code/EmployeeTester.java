package Original_Code;

import java.util.ArrayList;

public class EmployeeTester {

	public static void main(String[] args)
	{
		Employee employeeA = new Employee();
		
		// display employeeA's details on screen
		System.out.println(employeeA);
					
		// set employeeA's details
		employeeA.setName(new Name("Mr","Homer","Simpson"));
		employeeA.setPhoneNumber("087 1234567");		
		employeeA.setDOB(new Date(25, 12, 1952));
		employeeA.setSalary(60000);				
		employeeA.setStartDate(new Date(12, 2, 1999));
							
		// display employeeA's details on screen
		System.out.println(employeeA);
					
		// Create a Employee object called employeeB with initial values
		Employee employeeB = new Employee("Ms","Lisa","Simpson","086 0987653",20,12,1992,25000,1,2,2009);
							
		// display employeeB's details on screen
		System.out.println(employeeB);
							
		// change employeeB's firstName to "Lisa-Marie"
		employeeB.getName().setFirstName("Lisa-Marie");
					
		// display employeeB's details on screen
		System.out.println(employeeB);
					
		// Create a Employee object called employeeC with initial values
		Employee employeeC = new Employee("Mrs","Marge","Simpson","087 0987654",25,10,1965,55000,15,7,1982);
					
		// check if employeeA is the same as employeeB
		if(employeeA.equals(employeeB))
			System.out.println(employeeA + " is the same employee as " + employeeB);
		else
			System.out.println(employeeA + " is not the same employee as " + employeeB);
					
		// check if employeeA is female
		if(employeeA.getName().isFemale())		// OR	if(personA.isFemale()==true)
			System.out.println(employeeA + " is female.");			
		else
			System.out.println(employeeA + " is male.");	
							
		// Create an ArrayList of Employee objects called employees
		ArrayList<Employee> employees = new ArrayList<Employee>();
		// Add 4 Employee objects to names
		employees.add(new Employee("Mr","Bart","Simpson","086 1234567",10,10,1990,15000,25,1,2008));
		employees.add(employeeA);
		employees.add(employeeB);
		employees.add(employeeC);		
		// trim the capacity of names to be names current size
 		employees.trimToSize();	
							
		// print every element in employees
		System.out.println("\nArrayList contains ==>");
		for(Employee tempEmployee:employees)
			System.out.println(tempEmployee);
        
		if(employeeSearch(employeeA, employees))
			System.out.println(employeeA + " is in the list!");
		else
			System.out.println(employeeA + " is not in the list!");
	}

	public static boolean employeeSearch(Employee employeeToFind, ArrayList<Employee> listOfEmployees){
		for(Employee eachEmployee:listOfEmployees){
			if(eachEmployee.equals(employeeToFind))
				return true;
		}
		return false;

	}

}

