/**
 * 
 */
package com.ccivw.medium;

/**
 * @author kkanaparthi
 *
 */
public class MaxOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	//Flips a 1 to 0 and a 0 to 1
	private static int flip(int bit) {
		return 1^bit;
	}
	
	//Returns 1 if a is positive, and o if a is negative
	private static int sign(int a) {
		return flip((a>>31) & 0x1);
	}
//	
//	private static int getMaxNaive(int a, int b) {
//		int k = sign(a-b);
//		int q = flip(k);
//		return a*k+b*q;
//	}
	
	//If a and b have different signs
	//if a>0, then b<0, and k=1
	//If a<0, then b>0, and k=0
	//so either way, k=sign(a)
	//let k = sign(a)
	//else 
	//let k= sign(a-b)
	int getMax(int a, int b) {
		
		int c = a-b;
		int sa = sign(a);//If a>=0 then 1 else 0
		int sb = sign(b);//If b>=0 then 1 else 0
		int sc = sign(c);//depends on whether or not a-b overflows
		//Goal - Define a variable k which is 1 if a>b and 0 if a<b
		//If a=b, it doesn't matter which value k is.

		//If a and b have different signs, then k=sign(a)
		int useOfSignA = sa^sb;

		//If a and b have same signs, then k = sign(a-b)
		int useofSignC =  flip(sa^sb);
		
		int k = useOfSignA*sa+useofSignC*sc;
		
		int q = flip(k);//opposite of k
		
		return a*k+b*q;
	}
}
