/**
 * 
 */
package com.design.patterns.gof.creational;

import java.util.Queue;


/**
 * @author kkanaparthi
 *
 */
public class SingletonClient implements Runnable {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonClient client1 = new SingletonClient();
		Thread t1 = new Thread(client1);
		Thread t2 = new Thread(client1);
		t1.start();
		t2.start();
		
		Queue ll = new java.util.LinkedList<>();
	}

	@Override
	public void run() {
		System.out.println("\n Calling Singleton Instance from the Thread "+ Thread.currentThread().getName());
		Singleton singleton  = Singleton.getMyInstance();
		System.out.println("\n Called Singleton Instance from the Thread "+ Thread.currentThread().getName()
				+"\n and the Instance  Identification is  "+ System.identityHashCode(singleton)
				+"\n Regular HashCode "+singleton.hashCode());

	}

}
