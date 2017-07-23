package Week6Prac;

public class Human
{
   private String name;
   private int Age;
   private String Address;
   private String Height;
   private String Weight;
   
   public Human(String n, int a, String Add, String h, String w)
   {
	name = n;
	Age = a;
	Address = Add;
	Height = h;
	Weight = w;
   }
   public Human()
   {
	   
   }
   public void setName(String nameIn)
   {
	   name = nameIn;
   }
   public void setAge(int AgeIn)
   {
	   Age = AgeIn;
   }
   public void setAddres(String AddressIn)
   {
	   Address = AddressIn;
   }
   public void setHeight(String HeightIn)
   {
	   Height = HeightIn;
   }
   public void setWeight(String WeightIn)
   {
	   Weight = WeightIn;
   }
   public String getName()
   {
	   return name;
   }
   public int getAge()
   {
	   return Age;
   }
   public String getAddress()
   {
	   return Address;
   }
   public String getHeight()
   {
	   return Height;
   }
   public String getweight()
   {
	   return Weight;
   }
   public String ToString()
   {
	   return this.getName()+this.getAge()+this.getAddress()+this.getHeight()+this.getweight();
   }
}
