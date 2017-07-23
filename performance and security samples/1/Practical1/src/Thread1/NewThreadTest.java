package Thread1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewThreadTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
			   new NewThread(); // create a new thread
			   try {
			      for(int i = 5; i > 0; i--) {
			         System.out.println("Main Thread: " + i);
			         Thread.sleep(1000);
			      }
			   } catch (InterruptedException e) {
			      System.out.println("Main thread interrupted.");
			   }
			   System.out.println("Main thread exiting.");
			}
	

}
