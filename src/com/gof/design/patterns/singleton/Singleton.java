/**
 * 
 */
package com.design.patterns.singleton;

/**
 * @author kkanaparthi
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
