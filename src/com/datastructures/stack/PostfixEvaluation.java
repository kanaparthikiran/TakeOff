/**
 * 
 */
package com.datastructures.stack;

import java.util.Stack;
/**
 * @author kkanaparthi
 *
 */
public class PostfixEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value = evaluatePostfix("231*+9-");
		System.out.println(" The expression value is "+value);
		
		
	    int i1 = 65;                // 4 bytes
	    // char ch = i1;            // error, 4 bytes to 2 bytes

	    char ch = (char) i1;        // int is type converted to char

	    System.out.println("int value: " + i1);                // prints 65
	    System.out.println("Converted char value: " + ch);     // prints A (65 is ASCII value for A)

	}
	
	
	
	/**
	 * 
	 * @param expression
	 * @return
	 */
	private static int evaluatePostfix(String expression) {
		int result = -1;
		Stack<Integer> elements = new Stack<>();
		for(int i=0;i<expression.length();i++) {
			char element = expression.charAt(i);
			if(!Character.isDigit(element)) {
				if(element=='*') {
					int temp1 = elements.pop();
					int temp2 = elements.pop();
					int temp = temp1 * temp2;
					elements.push(temp);
				} else if(element=='+') {
					int temp1 = elements.pop();
					int temp2 = elements.pop();
					int temp = temp1 + temp2;
					elements.push(temp);
				} else if(element=='-') {
					int temp1 = elements.pop();
					int temp2 = elements.pop();
					int temp = temp1 - temp2;
					elements.push(temp);
				}
			} else {
				System.out.println(" element before 0 subtraction "+element);
				int elementValue = element-'0';
				System.out.println(" element after 0 subtraction "+elementValue);
				
				System.out.println(" element as integer "+ (int)element);

				System.out.println(" element as integer using zero "+ (int)'0');

				elements.push(element-'0');
			}
		}
		return elements.peek();
	}

}
