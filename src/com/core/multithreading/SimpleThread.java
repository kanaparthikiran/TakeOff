/**
 * 
 */
package com.core.multithreading;

/**
 * @author kkanaparthi
 *
 */
public class SimpleThread implements Runnable {


	/**
	 * This is a sample method accessing a resource
	 * like a printer,database etc.,
	 */
	private   void accessResource() {
		System.out.println(" Started to access resource "+Thread.currentThread().getName());
		sleep(1000);
		System.out.println(" Completed accessing resource "+Thread.currentThread().getName());
	}

	/**
	 * 
	 */
	private void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		//System.out.println(" Thread Started "+Thread.currentThread().getName());
		accessResource();
		//System.out.println(" Thread Completed "+Thread.currentThread().getName());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleThread simpleThread = new SimpleThread();
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100;i++) {
			Thread t = new Thread(simpleThread);
			t.start();
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(" Total time taken to complete 100 threads is "
				+ ""+ (endTime-startTime)+" milli seconds ");
	}

}
