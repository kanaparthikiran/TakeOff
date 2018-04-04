/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 *
 */
public class TopNNumbers {

	/**
	 * 
	 */
	public TopNNumbers() {
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
	TopNNumbers topNNumbers = new TopNNumbers();
	
	int result[] = topNNumbers.topNNumbers(new int[]{3,5,1,7,2});
	
	for(int resultElem : result) {
		System.out.println(" resultElem "+resultElem);
	}
	
		
		  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named UnSortedArrayAllElementsWithGivenSum. */
//	       Scanner sc=new Scanner(System.in);  
//
//	        System.out.println(" n value is "+ sc.nextInt());
//
//	        int n = sc.nextInt();
		int n =10;
	        String hello = "HelloWorld";
	        String str = "";
	        System.out.println(" n value is "+n);
	        for (int i=0;i<n;i++) {
	            if(i==1) {
	                str = hello;
	            } else if(i>1) {
	                str = str+"-"+hello;
	            } else {
	                System.out.println(" Error Condition i "+i);
	            }
	        }
	      //  sc.close();
	        System.out.print(str);
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] topNNumbers(int input[]) {
		int [] result = new int[2];
		int topFirst=0,topSecond=0;
		if(input!=null && input.length>0) {
			for(int inputValue : input) {
				System.out.println(" Received input "+inputValue);
				if(inputValue>topFirst) {
					topSecond = topFirst;
					topFirst = inputValue;
					//5 7
				} else if(inputValue>topSecond) {
					topSecond = inputValue;
					//1
				}
			}
		}
		result[0] = topFirst;
		result[1] = topSecond;
		return result;
	}

}
