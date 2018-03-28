/**
 * 
 */
package com.test.array;

/**
 * @author kkanaparthi
 *
 */
public class PrimeNumbers {

	/**
	 * 
	 * @param a
	 */
	public static void main(String [] a) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		// primeNumbers.printPrimeNumbers();
		 
			//loop through the numbers one by one
			for(int i=1; i < 100; i++){
				
				boolean isPrime = true;
				
				//check to see if the number is prime
				for(int j=2; j < i ; j++){
					
					if(i % j == 0){
						isPrime = false;
						break;
					}
				}
				// print the number 
				if(isPrime)
					System.out.print(i + " ");
			}
			
			primeNumbers.printPrimeNumbers();
			
	}
	
	/**
	 * 
	 */
	private void printPrimeNumbers() {
		int num=100;
		int count=0;
		for(int i=2;i<=num;i++){
			count=0;
			for(int j=2;j<=i/2;j++){
				System.out.println(" Comparing i "+i+" and j "+j);

				if(i%j==0){
					System.out.println(" Match is found for i "+i+" j "+j);
				count++;
				break;
			}
		}
			if(count==0){
				System.out.print(" "+i);
			}
		}
	}
}
