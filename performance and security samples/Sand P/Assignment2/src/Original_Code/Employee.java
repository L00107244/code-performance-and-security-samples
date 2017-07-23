package Original_Code;

public class Employee extends Person
{
		// INHERITANCE - Employee IS-A Person
		// Employee has name & phoneNumber from Person
private Date dob;					// AND dob, salary, startDate & number	
private double salary;
private Date startDate;
private int number;						

private static int nextNumber=1;	// static for unique number - starts off at 1

private final double MAX_SALARY = 70000;
private final double INCREMENT = 250;	

// Default Constructor
// Called when object is created like this ==> Employee eObj = new Employee();	
public Employee(){
super();		// NOTE:Not needed
dob=new Date();
salary=0.0;
startDate=new Date();
// Set number to static nextNumber before incrementing nextNumber
number=nextNumber++;
}

// Initialization Constructor
// Called when object is created like this ==>
//    Employee prObj = new Employee("Mr","Joe","Doe","087 1234567",25,12,1970,55000,1,1,2010);
public Employee(String t, String fN, String sn, String phoneNo, int d, int m, int y, 
double salary, int sD, int sM, int sY){
// Call super class constructor - Passing parameters required by Person ONLY!
super(t, fN, sn, phoneNo);
// And then initialise Employees own instance variables
dob=new Date(d,m,y);
this.salary=salary;
startDate=new Date(sD,sM,sY);
// Set number to static nextNumber before incrementing nextNumber
number = nextNumber++;						
}

// OVERRIDING the Person toString() method!
// Calling Persons toString() method, and adding additional bits
@Override
public String toString(){
return number + " " + super.toString() + " €" + salary;
}

// ==> Called when comparing an object with another object, e.g. - if(emp1.equals(emp2))										
// Because Employee number is unique (static) its sufficient to compare the number
public boolean equals(Employee employeeIn){
if(number == employeeIn.number)
return true;
else
return false;
}

// set() and get() methods
public void setDOB(Date dob){
this.dob=dob;
}
public Date getDOB(){
return dob;
}
public void setSalary(int salary){
this.salary=salary;
}
public double getSalary(){
return salary;
}
public void setStartDate(Date startDate){
this.startDate=startDate;
}
public Date getStartDate(){
return startDate;
}	
public int getNumber(){
return number;
}	

// incrementSalary() method to increment an Employees salary by 250, to a max salary of 70,000
public void incrementSalary(){
if(salary + INCREMENT <= MAX_SALARY)
salary += INCREMENT;
else
salary = MAX_SALARY;
}
}
