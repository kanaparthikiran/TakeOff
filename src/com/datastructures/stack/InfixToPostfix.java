/**
 * 
 */
package com.datastructures.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class InfixToPostfix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String postfix = infixToPostfix("a*b+c");
//		System.out.println(" Postfix Evaluation is "+postfix);
		char c = '1';
		System.out.println(2-(int)c);
		Character.getNumericValue(c);
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private static String infixToPostfix(String input) {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		char[] elements = input.toCharArray();
		for(char element : elements) {
			if(isOperand(element)) {
				postfix.append(element);
			} else if(element=='(') {
				//postfix.append(element);
				stack.push(element);
			} else if(element==')'){
				while(!stack.isEmpty() && stack.pop()!='(') {
					postfix.append(stack.pop());
				}
				if(!stack.isEmpty() && stack.pop()!='(') {
					return null;
				} else {
					stack.pop();
				}
			} else {
				int precedence = getPrecedence(element);
					if(stack.isEmpty() ||
							precedence<=getPrecedence(stack.peek())) {
						postfix.append(stack.pop());
					}
				stack.push(element);
			}
		}
		return new String(postfix);
	}

	/**
	 * 
	 * @param element
	 * @return
	 */
	private static int getPrecedence(char element) {
		Map<Character,Integer> precedence = new HashMap<>();
		precedence.put('+', 1);
		precedence.put('-', 1);
		
		precedence.put('*', 2);
		precedence.put('/', 2);

		precedence.put('^', 3);
		if(precedence.containsKey(element)) {
			return precedence.get(element);
		}
		return -1;
	}
	
	private static boolean isOperand(char element) {
		if(element>='a' && element<='z' || element>='A' && element<='Z') {
			return true;
		}
		return false;
	}
}
