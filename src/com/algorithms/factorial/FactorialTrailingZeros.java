/**
 * 
 */
package com.algorithms.factorial;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author kkanaparthi
 *
 */
public class FactorialTrailingZeros {

	private static int[][] convertListToMatrix(List<List<Integer>> after) {
		int[][] response = null;
		int [][] afterMatrix = new int[after.size()][after.get(0).size()];
   	    int[][] beforeMatrix = new int[after.size()][after.get(0).size()];
		    
   	    for(List<Integer> outer : after) {
	        for(int j=0;j<outer.size();j++) {
	            afterMatrix[outer.get(j)][j] = 0;
	        }
   	    }
		return response;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<List<Integer>> elements = new ArrayList();
//		elements.add(e)
		//convertListToMatrix(after);
//		System.out.println("  "+ squareNumber(100));
//		Stack<Integer> stack = new Stack<>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		stack.stream().forEach(element->System.out.print(" "+element));
//		reverse(stack);
//		System.out.println("\nAfter reversal ");
//		stack.stream().forEach(element->System.out.print(" "+element));
//		Queue<Integer> queue = new LinkedList<Integer>();
//		queue.add(1);
//		queue.add(2);
//		queue.add(3);
//		queue.add(4);
//		queue.add(5);
//		queue.add(6);
//		System.out.println("\n Queue before reversal ");
//		queue.stream().forEach(element->System.out.print(" "+element));
//		reverseQueue(queue);
//		System.out.println("\n Queue after reversal");
//		queue.stream().forEach(element->System.out.print(" "+element));
//		System.out.println("\n Factorial zeroes "+ factorialZeroes(5));
//		System.out.println(" Factorial using Memoization "+ factorial(5, new int[6]));
//		System.out.println("\n Fibonacci Number is "+fiboDynamic(6,new int[7]));
//		
//		
//		printAllFibo(40);
		
		Stack<String> elementsA = new Stack<>();
		elementsA.push("a");
		elementsA.push("b");
		elementsA.push("c");
		System.out.println("Stack elements before reversal "+elementsA);
		reverseStack(elementsA);
		System.out.println("Stack elements after reversal "+elementsA);

		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);

		System.out.println(" Queue before reverse "+queue);
		reverseGivenQueue(queue);
		System.out.println(" Queue after reverse "+queue);
		
		List<String> letterCombinations =
				phoneLetterCombinations("27753");
		letterCombinations.stream().forEach(element->System.out.println(element));
		
		System.out.println("Factorial Result is "+factorial(new BigInteger("625")));
		
		System.out.println("Trailing Zeroes are "+trailingZeroes(625));

		Queue<Integer> queueTest = new LinkedList<>();
		queueTest.add(1);
		queueTest.add(2);
		queueTest.add(3);
		
		System.out.println("Before Reverse of Queue "+queueTest);

		revQueue(queueTest);
		
		System.out.println("After Reverse of Queue "+queueTest);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Before Reverse Stack is "+stack);

		
		reverseStackTest(stack);
		
		System.out.println("Reverse Stack is "+stack);

	}
	
	
	private static void reverseStackTest(Stack<Integer> stack) {
		if(stack==null||stack.isEmpty()) {
			return;
		} else {
			int element = stack.pop();
			reverseStackTest(stack);
			reverseStackTestHelper(stack,element);
		}
	}
	
	private static void reverseStackTestHelper(Stack<Integer> stack,int element) {
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			int elementPopped = stack.pop();
			reverseStackTestHelper(stack, element);
			stack.push(elementPopped);
		}
	}
	
	
	private static void revQueue(Queue<Integer> queue) {
		if(queue==null||queue.isEmpty()) {
			return;
		}
		int element = queue.poll();
		revQueue(queue);
		queue.add(element);
	}
	 
	
//	
//	private static void reverseStack(Stack<String> stack) {
//		if(stack==null||stack.isEmpty()) {
//			return;
//		}
//		String element = stack.pop();
//		reverseStack(stack);
//		insertElementInBottom(stack,element);
//	}
//	
//	private static void insertElementInBottom
//		(Stack<String>stack, String element) {
//		if(stack==null||stack.isEmpty()) {
//			stack.push(element);
//		} else {
//			String elementPopped = stack.pop();
//			insertElementInBottom(stack, element);
//			stack.push(elementPopped);
//		}
//	}
//	
	
    private static int trailingZeroes(int n) {
        if(n<=0) {
            return 0;
        }
        int total = 0;
        for(int i = 5; n/i>0;) {
            total += n/i;
            n = n/i;
        }
        return total;
    }
    
	private static List<String> dictionary = Arrays.asList(new String[]{"apple"});
	private static List<String> phoneLetterCombinations(String digits) {
		List<String> result = new ArrayList<>();

		if(digits==null||digits.length()==0) {
			return result;
		}
		StringBuilder sb = new StringBuilder();
		Map<Character,char[]> letterCombos = getLetterCombos();
		phoneLetterHelper(digits,sb,letterCombos,result);
		return result;
	}

	private static void phoneLetterHelper
		(String digits,StringBuilder sb,Map<Character,char[]>letterCombos,List<String> result) {
		if(sb.length()==digits.length()) {
			if(dictionary.contains(sb.toString())) {
				result.add(sb.toString());
			}
			return;
		}
		for(char c : letterCombos.get(digits.charAt(sb.length()))) {
			sb.append(c);
			phoneLetterHelper(digits, sb, letterCombos, result);
			sb.deleteCharAt(sb.length()-1);
		}
		
	}
	
	private static Map<Character,char[]> getLetterCombos() {
		Map<Character,char[]> phoneData = new HashMap<>();
		phoneData.put('0', new char[] {});
		phoneData.put('1', new char[] {});
		phoneData.put('2', new char[] {'a','b','c'});
		phoneData.put('3',  new char[] {'d','e','f'});
		phoneData.put('4',  new char[] {'g','h','i'});
		phoneData.put('5',  new char[] {'j','k','l'});
		phoneData.put('6',  new char[] {'m','n','o'});
		phoneData.put('7',  new char[] {'p','q','r','s'});
		phoneData.put('8',  new char[] {'t','u','v'});
		phoneData.put('9',  new char[] {'w','x','y','z'});
		return phoneData;
	}
	
	
	private static BigInteger factorial(BigInteger n) {
		if(n.intValue()<=1) {
			return new BigInteger("1");
		} else {
			return n.multiply(factorial(n.subtract(new BigInteger("1"))));
		}
	}
	
	private static void printAllFibo(int n) {
		int a =0;
		int b =1;
		System.out.print(a+" "+b);
		for(int i=2;i<n;i++) {
			int c = a+b;
			a =b;
			b=c;
			System.out.print(" "+c);
		}
	}

	private static void reverseGivenQueue(Queue<Integer> queue) {
		if(queue==null||queue.isEmpty()) {
			return;
		}
		Integer element = queue.remove();
		reverseGivenQueue(queue);
		queue.add(element);
	}
	
	private static int fiboDynamic(int n, int[] memo) {
		///System.out.print(" 0 1 ");
		if(n==0||n==1) {
			return n;
		}
		if(memo[n]==0) {
			memo[n] = fiboDynamic(n-1,memo)+fiboDynamic(n-2,memo);
		}
		return memo[n];
	}
	
	private static int getTrailing(int n) {
		if(n<=5) {
			return 0;
		}
		int count = 0;
		for(int i=5;n/i>0;i=i*5) {
			count+=n/i;
		}
		return count;
	}
	
	private static int factorial(int n, int[]memo) {
		if(n<=1) {
			return 1;
		}
		int fact = 0;
		if(memo[n]>0) {
			System.out.println(" Got the value from Memoization "+memo[n]);
			fact = memo[n];
		} else {
			memo[n] = n * factorial(n-1, memo);
			fact = memo[n];
		}
		return fact;
	}
	
	private static int squareNumber(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=n;
		}
		return sum;
	}
	
	private static int getTrailigZerosForFactorial(int number) {
		if(number<=1) {
			return 0;
		}
		int count = 0;
		for(int i=5;number/i>0;i=i*5) {
			count+=number/i;
		}
		return count;
	}
	
	private static int factorial(int n,List<Integer> allValues) {
		if(n==0||n==1) {
			return 1;
		}
		int fact =  n*factorial(n-1,allValues);
		if(n==2||n==5) {
			System.out.println(" called special case "+n);
			allValues.add(n);
		}
		return fact;
	}
	
	
	private static int factorialZeroes(int n) {
		int count = 0;
		if(n<=0) {
			return 0;
		}
		for(int i=5;n/i>0;i=i*5) {
			count += n/i;
		}
		return count;
	}

	
	private static void reverseStack(Stack<String> stack) {
		if(stack==null||stack.isEmpty()) {
			return;
		}
		String element = stack.pop();
		reverseStack(stack);
		insertElementInBottom(stack,element);
	}
	
	private static void insertElementInBottom
		(Stack<String>stack, String element) {
		if(stack==null||stack.isEmpty()) {
			stack.push(element);
		} else {
			String elementPopped = stack.pop();
			insertElementInBottom(stack, element);
			stack.push(elementPopped);
		}
	}
	
	
	private static void reverseQueue(Queue<Integer> queue) {
			if(queue==null||queue.isEmpty()) {
				return;
			}
			Integer element = queue.remove();
			reverseQueue(queue);
			queue.add(element);
	}
	
	private static void reverse(Stack<Integer> stack) {
		if(stack==null||stack.isEmpty()) {
			return;
		}
		Integer element = stack.pop();
		reverse(stack);
		insertElementAtBottom(stack,element);
		return;
	}
	
	private static void insertElementAtBottom(Stack<Integer> stack, Integer element) {
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			Integer poppedElement = stack.pop();
			insertElementAtBottom(stack, element);
			stack.push(poppedElement);
		}
	}
//	private List<Integer> listOfMultiples(int number,List<Integer> allValues) {
//		if(number==0||number==1) {
//			allValues.add(1); 
//		} else {
//			number*listOfMultiples(number-1, allValues);
//		}
//		
//		return null;
//	}
}
