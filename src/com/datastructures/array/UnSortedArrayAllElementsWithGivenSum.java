/**
 * 
 */
package com.datastructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Write a program that takes an array of numbers as an input {2,7,4,6,3,5,11,-2}
 * and also takes another input of a target number say 9 in this case. 
 * Find all the combination of 2 elements in the array such that adding the two will
 * return the target integer 9. The output will be array of indices [{0,1}, {2,5},{3,4}]

 * To execute Java, please define "static void main" on a class
 * named UnSortedArrayAllElementsWithGivenSum.
 *
 * If you need more classes, simply define them inline.
 */

class UnSortedArrayAllElementsWithGivenSum {
    public static void main(String[] args) {
      int a[] = new int[]{2,7,4,6,3,5,11,-2};
      int sum = 9;
      
      List<Pair> result = printArrayIndicesWithSumWorstCase(a,sum);
      
      System.out.println(" Printing the results ");
      
      if(result!=null && result.size()>0) {
          Arrays.asList(result).stream().
          	forEach(elem->System.out.print(elem));  
      }
      
      System.out.println("\n\n Printing the results With Hashing");

      List<Pair> pairOfElems =
    		  printArrayWithGivenSumHashing(a, sum);
      
      if(pairOfElems!=null && pairOfElems.size()>0) {
          Arrays.asList(pairOfElems).stream().
          	forEach(elem->System.out.print(elem));  
      }
    }

    /**
     * 
     * @param array
     * @param sum
     * @return
     */
    private static List<Pair> printArrayIndicesWithSumWorstCase
    	(int array[],int sum) {
      List<Pair> points = new ArrayList<>();
      if(array!=null && array.length>0) {
        int length= array.length;
        for(int i=0;i<length;i++) {
          for(int j=i+1;j<length;j++)  {
            if(array[i]+array[j]==sum) {
               points.add(new Pair(array[i],array[j]));
            }
          }
        }
      }
      return points;
    }
  
    /**
     * 
     * @param array
     * @param num
     * @return
     */
	private static List<Pair> printArrayWithGivenSumHashing
			(int array[], int sum) {
		List<Pair> pairs = new ArrayList<>();
		Set<Integer> setOfElems = new HashSet<>();
		//      int a[] = new int[]{2,7,4,6,3,5,11,-2};

		for(int i : array) {
			int complement = sum-i;
			
			//System.out.println(" complement "+complement+" i "+i);
			 
			if(setOfElems.contains(complement) &&
					!setOfElems.contains(i)) {
				pairs.add(new Pair(i, complement));
			}
			setOfElems.add(i);
		}
		return pairs;	
	}

}
/**
 * 
 * @author kkanaparthi
 *
 */
class Pair {
	int a,b;
  
  Pair(int a, int b){
    this.a = a;
    this.b= b;
  }
  
  public int getA(){
	  return this.a; 
  }
  public int getB(){
    return this.b;
  }
   public String toString() {
    return this.a+","+this.b;
  }
  
}
