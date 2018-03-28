/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 *
 */
public class BinarySearch {

	/**
	 * 
	 */
	public BinarySearch() {
	}

	private static int binarySearch(int a[],int key) {
		int num = 0;
		int start=0; int end=a.length-1; int mid=0;
		
		for(int i=0;i<end;i++) {
			mid = (start+end)/2;
			
			//if even count
			if(mid==0) {
				
			} else  {
				
				
			}
			
			
			if(key<a[mid]) {
				end  = mid-1;
			} else if(key>a[mid]) {
				start = mid+1;
			} else {
				System.out.println("Found the Number at Middle "+key+" at the Location ");
				return mid;
			}
		}
		System.out.println("Found the Number "+key+" at the Location ");
		return num;
	}
	
	
	/**
	 * 
	 */
	private static void printDuplicateInArray()  {
		int[] arr = {1,2,3,4,5,5,32767,32767};  
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("arr[i] "+arr[i]+"  arr[i+1] "+arr[i+1]);
			if(arr[i]==arr[i+1]) {
				System.out.println
				("The Elements are Like this  "+ arr[i]);
			}
		}
	}
	

	
	private static  void printFibonacci(int maxNum)  {
		int fibo1 = 1; 
		int fibo2 = 1;
		
		System.out.println("Prnting the Fibonacci Numbers ");
		
		if(maxNum<=2) {
			System.out.print(fibo1+" "+fibo2);
			return;
		}
		
		System.out.print(fibo1+" "+fibo2);
		
		for(int i=2;i<maxNum;i++) {
			
			int fibo3 = fibo1+fibo2;
			
			System.out.print(" "+fibo3);
			
			fibo1 = fibo2;
			fibo2 = fibo3;
		}
	}

	private static int printFiboRecursive(int maxNum)  {
//		int fib1 = 1;
//		int fib2 = 1;
		
		if(maxNum<2) {
		//	System.out.print(maxNum+"  ");
			return maxNum;
		} else {
			int fiboNum  = printFiboRecursive(maxNum-1) + printFiboRecursive(maxNum-2);
			
			return	fiboNum;
		}
	
	}
	
//    if ((number == 0) || (number == 1)) // base cases
//        return number;
//      else
//        // recursion step
//        return fibonacci(number - 1) + fibonacci(number - 2);
//    }

	
	private static int printSumOfFirstRecursive(int maxNum)  {
		if(maxNum<=1) {
			return maxNum;
		}  else  {
			maxNum  = maxNum +printSumOfFirstRecursive(maxNum-1);
			return maxNum;
		}
	}
	
	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//printFibonacci(10);
//		
//		System.out.print("   "+ printFiboRecursive(10));
//		
//	//	System.exit(1);
//		printDuplicateInArray();
		
		System.out.println(" print of first n numbers  "+printSumOfFirstRecursive(10));
		
		System.exit(1);
//		int a[]  = new int[]{1,2,3,5,6};
//		binarySearch(a,2);
		
	     int[] arr = {10,9,3,6,4,7,8,1,2};  
	        int length = arr.length;  
	          
	        int indexes = 10;  
	        int values = 0;  
	          
	        for (int i = 0; i < length; i++) {  
	            indexes = indexes+i+1;  
	            values = values+arr[i];  
	            System.out.println("indexes  is "+indexes+"  values  "+values);
	        }  
	          
	        int result = indexes - values;  
	          
	        System.out.println("Missing number is: "+result);
	        
	        
	        int[] array = {
	        		10,9,3,6,4,7,8,1,2}; 
	        
	        int lengthOne = array.length; 
	        int resultOne = array.length + 1;

	        for (int i = 0; i < lengthOne; i++) { 
	        	System.out.println(" i at each step   "+i
	        			+"  arr[i]  "+arr[i]
	        					//+"  i + 1 - arr[i]  "+(i + 1 - arr[i])
	        					);
	        	resultOne = resultOne+(i + 1 - arr[i]);
	        	System.out.println("resultOne at each step  "+ resultOne);
	        }
	        
	        System.out.println("\n Missing number is: "+resultOne);
	 
	        
	        for(int i=0;i<arr.length;) {
	        	if(arr[i]!=i+1) {
	        		System.out.println("Missing Number is" + (i+1));
	        			break;
	        		}  else {
	        			i++;
	        		}
	        }
	        
	        displayMissing();
	}
	
    static int ar[]={3,5,8,44};
    
    /*
     * Method finds out missing number in given range.
     */
    static public void displayMissing(){
           
           System.out.print("given array(already sorted): ");
           for (int j = 0; j < ar.length; j++) {
                  System.out.print(ar[j] +" "); // display it
           }
           
           
           System.out.print("\nNumbers missing between 1 to 100 in array :  ");
           
           int j=0;
           
           for(int i=1;i<=100;i++)  {
                  if(j<ar.length) {
                	  if(i==ar[j]) {
                		  
                	  }
                        j++;
                  }  else {
                        System.out.print(i+" ");
                  }
           }
    }
}
