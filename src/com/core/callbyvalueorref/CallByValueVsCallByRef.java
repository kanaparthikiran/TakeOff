/**
 * 
 */
package com.core.callbyvalueorref;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kiran Kanaparthi
 *
 */
public class CallByValueVsCallByRef {

	
	public static void printHierarchy(Map<String,List<String>> data) {
		if(data==null||data.isEmpty()) {
			return;
		}
		printHierarchy(data);
//		printHierarchyHelper(data,element,data.get(element));
	
	}
	
	/**
	 * 
	 * @param data
	 * @param element
	 * @param list
	 */
	public static void printHierarchyHelper(Map<String,List<String>> data,
			String element,List<String> list) {
		if(!data.containsKey(element)) {
			return;
		} else  {
			System.out.println(" element "+element);
			list.forEach(elementA->System.out.println(elementA));
			printHierarchyHelper(data, element, list);
		}
	}
	
	
	
	int a,b;
	
	private int callPrimitives(int a,int b) {
		a = a+10;
		b = b+15;
		System.out.println(" Inside Method Values a "+a+" b "+b);

		int c =  a+b;
		return c;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int callObjects(CallByValueVsCallByRef callByValueVsCallByRef,
			CallByValueVsCallByRef callByValueVsCallByRefTwo) {
		callByValueVsCallByRef.setA(a+10);
		callByValueVsCallByRef.setB(b+20);
	//	callByValueVsCallByRef = new CallByValueVsCallByRef();
		
//		callByValueVsCallByRef.setA(a+30);
//		callByValueVsCallByRef.setB(b+40);
		CallByValueVsCallByRef temp = callByValueVsCallByRef;
		callByValueVsCallByRef = callByValueVsCallByRefTwo;
		callByValueVsCallByRefTwo = temp;
		
		
		
//		CallByValueVsCallByRef temp = callByValueVsCallByRef;
//		callByValueVsCallByRef = callByValueVsCallByRefTwo;
//		callByValueVsCallByRefTwo = temp;
		
		
		System.out.println(" Inside Method Values a "+callByValueVsCallByRef.getA()
			+" b "+callByValueVsCallByRef.getB()+"  callByValueVsCallByRefTwo Values  "
				+callByValueVsCallByRefTwo.getA()
			+"  callByValueVsCallByRefTwo  "+callByValueVsCallByRefTwo.getB());

		int c =  callByValueVsCallByRef.getA()+callByValueVsCallByRef.getB();
		return c;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private void callObjectsSwap(CallByValueVsCallByRef callByValueVsCallByRef, 
			CallByValueVsCallByRef callByValueVsCallByRefTwo) {
		CallByValueVsCallByRef temp = callByValueVsCallByRef;
		callByValueVsCallByRef = callByValueVsCallByRefTwo;
		callByValueVsCallByRefTwo = temp;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=5,b=10;
		Map<String,List<String>> data = new HashMap<>();
		data.put("A", Arrays.asList(new String[]{"B","C","D"}));
		data.put("B", Arrays.asList(new String[]{"E","F"}));
		data.put("G", Arrays.asList(new String[]{"H,I"}));

  		printHierarchy(data);
  		
  		
		CallByValueVsCallByRef  callByValueVsCallByRef = new CallByValueVsCallByRef();
//		System.out.println(" Before Values a "+a+" b "+b);
//		callByValueVsCallByRef.callPrimitives(a, b);
//		System.out.println(" After Values a "+a+" b "+b);
//		
//		callByValueVsCallByRef.setA(1);
//		callByValueVsCallByRef.setB(2);
//		
//		System.out.println(" Before Object Values a "+callByValueVsCallByRef.getA()
//		+" b "+callByValueVsCallByRef.getB());

		CallByValueVsCallByRef  callByValueVsCallByRefTwo =
				new CallByValueVsCallByRef();

		callByValueVsCallByRef.callObjects
		(callByValueVsCallByRef,callByValueVsCallByRefTwo);

		
		System.out.println(" AFTER callByValueVsCallByRef Object Values a "
				+callByValueVsCallByRef.getA()
		+" b "+callByValueVsCallByRef.getB());

		System.out.println(" AFTER callByValueVsCallByRefTwo Object Values a "
				+callByValueVsCallByRefTwo.getA()
		+" b "+callByValueVsCallByRefTwo.getB());
		
//		System.out.println(" After Object Values a "+callByValueVsCallByRef.getA()
//			+" b "+callByValueVsCallByRef.getB());
		
		
		CallByValueVsCallByRef temp = callByValueVsCallByRef;
		callByValueVsCallByRef = callByValueVsCallByRefTwo;
		callByValueVsCallByRefTwo = temp;
		
		System.out.println("AFTER SWAPPING ORIGINAL REFERENCES "
				+ "callByValueVsCallByRefTwo Object Values a "
				+callByValueVsCallByRefTwo.getA()
		+" b "+callByValueVsCallByRefTwo.getB());
		
	}



	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}



	/**
	 * @param pA the a to set
	 */
	public void setA(int pA) {
		a = pA;
	}



	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}



	/**
	 * @param pB the b to set
	 */
	public void setB(int pB) {
		b = pB;
	}

}

/**
 * 
 * @author Kiran Kanaparthi
 *
 */
class Point {
	int x,y;

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param pX the x to set
	 */
	public void setX(int pX) {
		x = pX;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param pY the y to set
	 */
	public void setY(int pY) {
		y = pY;
	}
	
}
