/**
 * 
 */
package com.datastructures.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author kkanaparthi
 *
 */
public class SentenceToMobileKeypadSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str[] = new String[]{"2","22","222",
									"3","33","333",
									"4","44","444",
									"5","55","555",
									"6","66","666",
									"7","77","777","7777",
									"8","88","888",
									"9","99","999","9999"};
		String input = "test";
		System.out.println(" The Keypad Sequence is "+ numToChar(str,input));
		System.out.println(" The Keypad Sequence is "+ printSequence(str,input));

		getAllPermutations("", "abc", new ArrayList<>());
		Stack<String> stack = new Stack<>();
		stack.push("4");
		stack.push("1");
		stack.push("2");
		stack.push("6");
		System.out.println("Stack before reversal : "+ stack);
		reverseStack(stack);
		System.out.println("Stack after reversal : "+ stack);
		System.out.println("Stack before Sorting : "+ stack);
		Stack<Integer> stackIn = new Stack<>();
		stackIn.push(4);
		stackIn.push(1);
		stackIn.push(2);
		stackIn.push(6);
		sortStack(stackIn);
		System.out.println("Stack after Sorting : "+ stackIn);

//		.stream().
//			forEach(element->System.out.println(element));
	}
	
	private static String printSequence(String[] str,String input) {
		String output = "";
		int n = input.length();
		for(int i=0;i<n;i++) {
			if(input.charAt(i)==' ') {
				output += '0';
			} else {
				int position = input.charAt(i)-'a';
				output+= str[position];
			}
		}
		return output;
	}
	
	private static String numToChar(String[] all, String input) {
		int n = input.length();
		String output = "";
		for(int i=0;i<n;i++) {
			if(input.charAt(i)==' ') {
				output+='0';
			} else {
				output += all[input.charAt(i)-'a'];
			}
		}
		return output;
	}
	
	
	private static List<String> getAllPermutations(String prefix,
			String suffix,List<String> results) {
		if(suffix==null||suffix.length()==0) {
			results.add(prefix+suffix);
			System.out.println(prefix+suffix);
		} else {
			for(int i=0;i<suffix.length();i++) {
				String s = suffix.substring(0, i)+suffix.substring(i+1);
				getAllPermutations(prefix+suffix.charAt(i), s, results);
			}
		}
		return results;
	}
	
	private static void reverseStack(Stack<String> stack) {
		if(stack.isEmpty()) {
			return;
		} else {
			String element = stack.pop();
			reverseStack(stack);
			insertElementAtBottom(stack,element);
		}
	}
	
	private static void insertElementAtBottom(Stack<String> stack,
				String element) {
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			String poppedElement = stack.pop();
			insertElementAtBottom(stack, element);
			stack.push(poppedElement);
		}
	}
	
	private static void sortStack(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			Integer element = stack.pop();
			sortStack(stack);
			insertSorted(stack,element);
		}
	}
	
	private static void insertSorted(Stack<Integer> stack, 
			Integer element) {
		if(stack.isEmpty()||  element>stack.peek()) {
			stack.push(element);
//			return;
		} else {
			Integer poppedElement = stack.pop();
			insertSorted(stack, element);
			stack.push(poppedElement);			
		}
	}
	
}
