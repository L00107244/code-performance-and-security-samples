package Original_Code;

public class Date
{
	
		   private int day;
		   private int month;
		   private int year;

		   // Default Constructor 
		   //	==> Called when a Date object is created as follows - Date d1 = new Date();
		   public Date(){
			   day=month=year=0;
		   }

		   // Initialization Constructor
		   // ==> Called when a Date object is created as follows - Date d2 = new Date(14,9,2010);
			// Initialisation Constructor
		 	public Date(int day, int month, int year)throws IllegalArgumentException{
			   if(day <=0 || day > 31 || month < 0 || month > 12 || year < 0)
				   throw new IllegalArgumentException("DATE IS INVALID.");		

		   	this.day = day;
		   	this.month = month;
			this.year = year;
		  }

		   // toString() method
		   // ==> Called when a String of the class is used, e.g. - System.out.print(d1);
		   //																  or System.out.print(d1.toString());
		   public String toString(){
			  return (day + "/" + month + "/" + year);
		   }
			
		   // equals() method
		   // ==> Called when comparing an object with another object, e.g. - if(d1.equals(d2))
		   public boolean equals(Date dateIn){
			  if(day == dateIn.day && month == dateIn.month && year == dateIn.year)
				  return true;
			  else
				  return false;
		   }
			
		   // get methods
		   // ==> Called when retrieving part of an object, e.g. - if (d1.getYear() == d2.getYear())
		   public int getDay(){
			  return day;
			}
			public int getMonth(){
			   return month;
			}
			public int getYear(){
			   return year;
			}

			// set methods
			// ==> Called when setting part of an object, e.g. - d1.setDay(14);
			//													 d1.setMonth(9);
			//												     d1.setYear(2010);
			public void setDay(int setDayTo) throws IllegalArgumentException{
			   if(setDayTo <=0 || setDayTo > 31)
				  throw new IllegalArgumentException("DAY IS NOT IN RANGE 1 TO 31.");		

			   // NO EXCEPTION THROWN
		  	   day=setDayTo;
			}
		 	public void setMonth(int setMonthTo)throws IllegalArgumentException{
		 	   if(setMonthTo <=0 || setMonthTo > 12)
		 		   throw new IllegalArgumentException("MONTH IS NOT IN RANGE 1 TO 12.");		

		 		// NO EXCEPTION THROWN
		 		month = setMonthTo;
		 	}
		 	public void setYear(int setYearTo)throws IllegalArgumentException{
		 	   if(setYearTo <=0)
		 		   throw new IllegalArgumentException("YEAR CANNOT BE NEGATIVE.");		

		 		// NO EXCEPTION THROWN
		 		year = setYearTo;
		 	}
		
}
