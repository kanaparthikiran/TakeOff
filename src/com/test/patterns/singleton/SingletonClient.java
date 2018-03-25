/**
 * 
 */
package com.test.patterns.singleton;

import java.util.Queue;

import com.test.core.LinkedList;

/**
 * @author kkanaparthi
 *
 */
public class SingletonClient implements Runnable {

	/**
	 * 
	 */
	public SingletonClient() {
	}

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
		System.out.println("Calling Singleton Instance from the Thread "+ Thread.currentThread().getName());
		Singleton singleton  = Singleton.getMyInstance();
		System.out.println("Called Singleton Instance from the Thread "+ Thread.currentThread().getName()
				+" and the Instance  Identification is  "+ System.identityHashCode(singleton)
				+" Regular HashCode "+singleton.hashCode());

	}

}
