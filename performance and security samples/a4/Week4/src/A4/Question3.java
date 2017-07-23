package Asignment4;

import java.util.concurrent.Semaphore;

public class Question3 extends Thread
{
	
	 private int threadId;
	 private Semaphore semaphore;

	 public Question3(Semaphore semaphore) {
	   this.semaphore = semaphore;
	 }

	 protected void setThreadId(int threadId) {
	    this.threadId = threadId;
	    }

	 private int random(int n)
	 {
	   return (int) Math.round(n * Math.random());
	 }

	 private void busyCode() {
	   int sleepPeriod = random(500);
	    try {
	       sleep(sleepPeriod);
	    } catch (InterruptedException e) {
	    }
	 }

	 private void noncriticalCode()
	 {
	   busyCode();
	 }

	 private void criticalCode()
	 {
	   busyCode();
	 }

	 public void run()
	 {
	   for (int i = 0; i < 3; i++) {
	           try {
	              semaphore.acquire();
	              criticalCode();
	              semaphore.release();
	           } catch (InterruptedException e) {
	              System.out.println("Exception " + e.toString());
	           }
	   }
	   for (int i = 0; i < 3; i++) {
	           noncriticalCode();
	   }
	 }

	 public static void main(String[] args)
	 {
	   final int numberOfProcesses = 3;
	   final int numberOfPermits = 2;

	   Semaphore semaphore = new Semaphore(numberOfPermits, true);
	   Question3 p[] = new Question3[numberOfProcesses];

	   for (int i = 0; i < numberOfProcesses; i++)
	   {
	     p[i] = new Question3(semaphore);
	     p[i].setThreadId(p[i].hashCode());
	     p[i].start();
	     System.out.println(p[i]);
	   }
	 }
	

}
