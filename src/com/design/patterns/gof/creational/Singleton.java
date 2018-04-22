/**
 * 
 */
package com.design.patterns.gof.creational;

/**
 * @author kkanaparthi
 * 
 * This class implements Singleton Design Pattern
 * which allows only one instance of the Class is 
 * created, at any time. It also prevents users from
 * Cloning the Object to make more copies. Uses Private 
 * Constructor to prevent the clients from instantiating 
 * to make more copies of the instance.
 *
 */
public class Singleton implements Cloneable  {

	private static volatile Singleton myInstance = null;
	
	/**
	 * 
	 */
	private Singleton() {
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton Prevents Cloning");
	}

	public static Singleton getMyInstance() {
		if(myInstance==null)  {
			synchronized (Singleton.class) {
				if(myInstance == null) {
					myInstance  = new Singleton();
				}
			}
		}
		return myInstance;
	}
	
	

}
