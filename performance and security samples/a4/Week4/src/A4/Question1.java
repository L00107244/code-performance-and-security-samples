/*
 * Stephen Curran
 * L00107244
 */
package Asignment4;

public class Question1
{
	   public static void main(String[] args)
	   {
		   //object of printing 
		   printing PT = new printing();
		   //Thread object
		   Threads t1 = new Threads("thread1", PT);
		   Threads t2 = new Threads("thread2", PT);
		   //starting the threads
		   t1.start();
		   t2.start();
		   
		   try
		   {
			   t1.join();
			   t2.join();
		   }
		   catch( Exception e)
		   {
			   System.out.print("thread interrupted");
		   }
	   }
}
 class printing
{
   // This method prints out the counter number is it is interrupted it also will print this out 
   protected void Print()
   {
	   try{
		   for(int i =5; i > 0; i--)
		   {
			   System.out.println(" Counter: "+i);
		   }
	   }
	   catch(Exception e)
	   {
		   System.out.println("Thread was intterrupted");
	   }
   
   }
}
 //thread class
   class Threads extends Thread
   {
	   private Thread t;
	   private String threadName;
	  printing printT;
	  
	  Threads(String name, printing pT)
	  {
		 threadName = name;
		 printT = pT;
	  }
	  public void run()
	  {
		 synchronized(printT)
		 {
			 printT.Print();
		 }
		  System.out.println("Thread: " +threadName+ " is exitiing");
	  }
	
	  public void start()
	  {
		  System.out.println(threadName+ " is starting");
		  if( t == null)
		  {
			  t = new Thread(this, threadName);
			  t.start();
		  }
	  }
	   
   }

   


