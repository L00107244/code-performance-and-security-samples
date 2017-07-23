package Original_Code;

import java.util.Scanner;
public class DateTester {

	public static void main(String[] args)
	{
		
				Scanner keyboard = new Scanner(System.in);

				Date d1 = new Date();
				Date d2 = new Date(28, 12, 1982);

				int setDayTo=32, setMonthTo=13, setYearTo=-2009;
				boolean goodInput=false;

				do{
					try{
						d1.setDay(setDayTo);
						d1.setMonth(setMonthTo);
						d1.setYear(setYearTo);
						goodInput=true;
					}
					catch(IllegalArgumentException iEA){
						System.out.println("Incorrect day, month or year.");
						
						System.out.print("RE-ENTER VALID ARGUMENT FOR Day:");
						setDayTo = keyboard.nextInt();
						System.out.print("RE-ENTER VALID ARGUMENT FOR Month:");
						setMonthTo = keyboard.nextInt();
						System.out.print("RE-ENTER VALID ARGUMENT FOR Year:");
						setYearTo = keyboard.nextInt();				
					}
					catch(Exception e){
						System.out.println("An Error Occurred.");
					}
				}while(!goodInput);	}
		


	}
