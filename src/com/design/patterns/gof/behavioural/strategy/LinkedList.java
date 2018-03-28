/**
 * 
 */
package com.design.patterns.gof.behavioural.strategy;

/**
 * @author kkanaparthi
 *
 */
public class LinkedList {

	/**
	 * 
	 */
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Started Process () ");
		// TODO Auto-generated method stub
		String s1 = new String();
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			String s2 = s1.concat("123");
			System.out.println(" identity HashCode " +System.identityHashCode(s2));
			System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory()
					+" Free Memory "+ Runtime.getRuntime().freeMemory());
		}
		
		System.out.println(" Completed Process () ");

	}

}


class Node  {

	int data;
	Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
	
}