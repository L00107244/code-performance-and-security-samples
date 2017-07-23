package week6PracFix;

import java.util.InputMismatchException;

public abstract class HumanRefactered 
{
	   private String name;
	   private int Age;
	   private String Address;
	   private String Height;
	   private String Weight;
	   
	   private HumanRefactered(String n, int a, String Add, String h, String w)
	   {
		this.name = n;
		this.Age = a;
		this.Address = Add;
		this.Height = h;
		this.Weight = w;
	   }
	   private HumanRefactered()
	   {
		   
	   }
	   protected void setName(String nameIn)
	   {
		   name = nameIn;
	   }
	   protected void setAge(int AgeIn) throws Exception
	   {
		 try{
			 Age = AgeIn;
			 throw new InputMismatchException("Invalied data entered");
		 }
		 catch (InputMismatchException iEA)
		 {
			 System.out.print("You have entered a charchter please enter a digit");
		 }
		 catch(Exception E)
		 {
			 System.out.println("Error");
		 }
		   
	   }
	   protected void setAddres(String AddressIn)
	   {
		   Address = AddressIn;
	   }
	   protected void setHeight(String HeightIn)
	   {
		   Height = HeightIn;
	   }
	   protected void setWeight(String WeightIn)
	   {
		   Weight = WeightIn;
	   }
	   protected String getName()
	   {
		   return name;
	   }
	   protected int getAge()
	   {
		   return Age;
	   }
	   protected String getAddress()
	   {
		   return Address;
	   }
	   protected String getHeight()
	   {
		   return Height;
	   }
	   protected String getweight()
	   {
		   return Weight;
	   }
	   
	 
}
