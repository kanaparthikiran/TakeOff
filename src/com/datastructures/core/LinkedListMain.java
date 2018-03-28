/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 *
 */
public class LinkedListMain {

	/**
	 * 
	 */
	public LinkedListMain() {
	}
	
	
	 public static int fibonacciRecusion(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacciRecusion(number-1) + 
	        		fibonacciRecusion(number -2); //tail recursion
	    }

	 static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){    
	    if(count>0){  
	    	System.out.println("count value "+count);
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    

	 static void printFibonacciIterative(int count){    
		 for(int i=2;i<count;i++) {
		         n3 = n1 + n2;   
		         System.out.print(" "+n3);   
		         n1 = n2;    
		         n2 = n3;    
		 }
//		         printFibonacci(count-1);    
		 }  
	/**
	 * @param args
	 */
	public static void main(String[] args)  throws ClassNotFoundException {
		 int count=10;    
		  System.out.print(n1+" "+n2);//printing 0 and 1    
		 printFibonacci(count-2);//n-2 because 2 numbers are already printed
		//  printFibonacciIterative(count-2);
	//      long data[] = new long[1000000000]; 

//		System.out.print("\n\n Fibo Recursion Print "+fibonacciRecusion(5));

	//	System.out.println("\n Printing 2 power of 5  "+  (1<<5));
		if((31&30)==0) {
			System.out.println("\n Find if power of 2  True");
		} else {
			System.out.println("\n Find if power of 2 False");
		}

		// System.exit(1);
		 
		TestLinkedList link1 = new TestLinkedList(5,null);
		System.out.println("The Linked List Node is  "+   link1);
		
		
		TestLinkedList link2 = new TestLinkedList(10,null);

		System.out.println("The Linked List Node is  "+   link2);

		TestLinkedList link3 = new TestLinkedList(15,null);

		System.out.println("The Linked List Node is  "+   link3);

		link1.next = link2;
		link2.next = link3;
		
		link3.addNode(new TestLinkedList(20, null));
		
		link3.deleteNode(link3);
		
		System.out.println("Complete Linked List as  NOW "
				+ link1.data+"  "+link1.next.data+"  "+link1.next.next.data);
		
		while(link1!=null)  {
			System.out.print("  "+link1.data);
			link1 = link1.next;

		}
		
		
		
	}

	void reverseLinkedList(TestLinkedList linkedList)  {
		linkedList.next = null;
	}
}



class  TestLinkedList {
	java.util.LinkedList ll;
	
	int data;
	TestLinkedList next;
		
	TestLinkedList(int data,TestLinkedList next) {
		this.data  = data;
		this.next = next;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " [data=" + data + ", next=" + next + "]=>";
	}
	
	public void addNode(TestLinkedList next)  {
		this.next = next;
	}
	
	public void deleteNode(TestLinkedList next)  {
		this.next = null;
	}
}