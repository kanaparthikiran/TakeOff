/**
 * 
 */
package com.datastructures.stack;

/**
 * @author kkanaparthi
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedParenthesis {
    
    private static final List<Character> startChars = Arrays.asList('(','{','[');
    private static final List<Character> endChars = Arrays.asList(')','}',']');

    private static CharStack stack = new CharStack();
    static String isBalanced(String s) {
        String result  = "YES";
        // Complete this function
        char[] charArray = null;
        if(s!=null && s.length()>0) {
           charArray = s.toCharArray();
            for(char charElem : charArray) {
                if(startChars.contains(charElem)) {
                    stack.push(charElem);
                } else if(endChars.contains(charElem)) {
                    CharNode gotNode = stack.pop();
                    if(gotNode!=null) {
	                    System.out.println(" Popped Element "+ gotNode.data+" charElem  "+charElem
	                    		+"  charElem=='('  "+((char)charElem=='(')+" gotNode.data==')' "+
	                    		(gotNode.data==')'));
	                    if(charElem==')' && gotNode.data=='(') {
	                    	System.out.println(" Condition matched 11 ");
	                    } else if(charElem==']' && gotNode.data=='[')  {
	                    	System.out.println(" Condition matched 222 ");
	                    } else if(charElem=='}' && gotNode.data=='{') {
	                    	System.out.println(" Condition matched 3333 ");
	                    } else {
	                    	System.out.println(" Condition matched 444 ");
	                        return  "NO";
	                    }
                    } else {
                    	System.out.println(" Condition matched 555 ");
                        return  "NO";
                    }
                }
            }
        }
        return result;
    }

    /**
     *
     */
    public static void main(String[] args) {
    	
    	Arrays.asList("1");
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for(int a0 = 0; a0 < t; a0++){
//            String s = in.next();
//            String result = isBalanced(s);
//            System.out.println(result);
//        }
    	System.out.println(" Result is "+isBalanced("{[()]}"));
        //in.close();
    }
}

class CharStack {
    
	CharNode topOfStack;
    
    public void push(char data) {
    	CharNode node = new CharNode(data);
        if(topOfStack==null) {
            topOfStack = node;
            System.out.println(" Added Element to Stack as First Element "+ node.data);
        }  else {
        	node.nextNode = topOfStack;
            topOfStack = node;
            System.out.println(" Added Element to Stack "+ node.data);
        }
    }
    
    public CharNode pop() {
    	CharNode poppedElement = null;
        if(topOfStack==null) {
            return null;
        } else {
            poppedElement = topOfStack;
            topOfStack = topOfStack.nextNode;
        }
        return poppedElement;
    }
}

class CharNode {
    
	CharNode nextNode;
    char data;
    
    CharNode(char data) {
        this.data = data;
    }
            
}