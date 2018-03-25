/**
 * 
 */
package com.test.basics;

/**
 * @author kkanaparthi
 *
 */
public class CallByValueVsCallByRef {

	int a,b;
	/**
	 * 
	 */
	public CallByValueVsCallByRef() {
	}


	
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
		
		System.out.println(" Inside Method Values a "+callByValueVsCallByRef.getA()+" b "+callByValueVsCallByRef.getB());

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
		CallByValueVsCallByRef  callByValueVsCallByRef = new CallByValueVsCallByRef();
		System.out.println(" Before Values a "+a+" b "+b);
		callByValueVsCallByRef.callPrimitives(a, b);
		System.out.println(" After Values a "+a+" b "+b);
		
		callByValueVsCallByRef.setA(1);
		callByValueVsCallByRef.setB(2);
		
		System.out.println(" Before Object Values a "+callByValueVsCallByRef.getA()
		+" b "+callByValueVsCallByRef.getB());

		CallByValueVsCallByRef  callByValueVsCallByRefTwo = new CallByValueVsCallByRef();

		callByValueVsCallByRef.callObjects(callByValueVsCallByRef,callByValueVsCallByRefTwo);

		
		System.out.println(" AFTER callByValueVsCallByRef Object Values a "+callByValueVsCallByRef.getA()
		+" b "+callByValueVsCallByRef.getB());

		System.out.println(" AFTER callByValueVsCallByRefTwo Object Values a "+callByValueVsCallByRefTwo.getA()
		+" b "+callByValueVsCallByRefTwo.getB());
		
//		System.out.println(" After Object Values a "+callByValueVsCallByRef.getA()
//			+" b "+callByValueVsCallByRef.getB());
		
		
		CallByValueVsCallByRef temp = callByValueVsCallByRef;
		callByValueVsCallByRef = callByValueVsCallByRefTwo;
		callByValueVsCallByRefTwo = temp;
		
		System.out.println("AFTER SWAPPING ORIGINAL REFERENCES "
				+ "callByValueVsCallByRefTwo Object Values a "+callByValueVsCallByRefTwo.getA()
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
 * @author kkanaparthi
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
