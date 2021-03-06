/**
 * 
 */
package com.datastructures.stack;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * @author kkanaparthi
 *
 */
public class ReverseStackRecursion {


	
//	
	private static void reverseStack(Stack stack) {
		if(stack.isEmpty()) {
			return;
		}
		Integer element = (Integer) stack.pop();
		reverseStack(stack);
		insertElementAtBottom(stack,element);
	}
	
	private static void insertElementAtBottom(Stack stack,Integer element) {
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			Integer poppedElement = (Integer) stack.pop();
			insertElementAtBottom(stack,element);
			stack.push(poppedElement);
		}
	}
	
	private static void reverseQueue(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			return;
		} else {
			Integer element = queue.poll();
			reverseQueue(queue);
			queue.add(element);
		}
		
	}
	
	
	public static void list(File file) {
	    System.out.println(file.getName());
	    File[] children = file.listFiles();
	    if(children!=null && children.length>0) {
		    for (File child : children) {
		        list(child);
		    }
	    }
	}
	
	  public static void walk( String path ) {
	        File root = new File( path );
	        File[] list = root.listFiles();
	        if (list == null) return;
	        for ( File f : list ) {
	            if ( f.isDirectory() ) {
	                walk( f.getAbsolutePath() );
	                System.out.println( "Dir:" + f.getAbsoluteFile() );
	            }
	            else {
	                System.out.println( "File:" + f.getAbsoluteFile() );
	            }
	        }
	  }
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		list(new File("/Users/kkanaparthi/Desktop/AAAA"));
		walk("/Users/kkanaparthi/Desktop/AAAA");
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(" Stack before reverse "+stack);
		reverseStack(stack);
		System.out.println(" Stack after reverse "+stack);
		Queue queue = new LinkedList<>();
		queue.add(1);
		queue.add(3);
		queue.add(4);
		queue.add(6);
		queue.add(7);
		System.out.println(" Queue before reverse "+queue);
		reverseQueue(queue);
		System.out.println(" Queue after reverse "+queue);
		
		
	}

}
