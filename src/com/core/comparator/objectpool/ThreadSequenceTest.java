/**
 * 
 */
package com.core.comparator.objectpool;

import java.util.concurrent.Semaphore;

/**
 * @author kkanaparthi
 *
 */
public class ThreadSequenceTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Started Main Program ");
		Semaphore sem = null;
		for(int i=0;i<2;i++) {
			TestObject testObject = new TestObject();
			Thread t1 = new Thread(testObject);
			testObject.setData(1);
			t1.start();
//			try {
//				t1.join(20000);
//			} catch(Exception ex) {
//				ex.printStackTrace();
//			}
			
			Thread t2 = new Thread(testObject);
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(" Completed Main Program ");
	}

}

class TestObject implements Runnable {
  
	private int data;
	
	@Override
	public void run() {
		printData(this.data);
	}
	
	public void printData(int x) {
		for(int i =1;i<=3;i++) {
			System.out.println("number "+i*x
					+" With Thread Name "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param pData the data to set
	 */
	public void setData(int pData) {
		data = pData;
	}
	
}