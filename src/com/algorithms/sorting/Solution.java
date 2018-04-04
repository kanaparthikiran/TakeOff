/**
 * 
 */
package com.algorithms.sorting;

/**
 * @author kkanaparthi
 *
 */
import java.util.*;

/*
 * Write a program that takes an array of numbers as an input {2,7,4,6,3,5,11,-2}
 * and also takes another input of a target number say 9 in this case. 
 * Find all the combination of 2 elements in the array such that adding the two will
 * return the target integer 9. The output will be array of indices [{0,1}, {2,5},{3,4}]
 *
 */

class Solution {
    public static void main(String[] args) {
      int a[] = new int[]{2,7,4,6,3,5,11,-2};
      int sum = 9;
      
      List<Pair> result = printArrayIndicesWithSum(a,sum);
      
      System.out.println(" Printing the results ");
      
      if(result!=null && result.size()>0) {
          Arrays.asList(result).stream().forEach(elem->System.out.print(elem));  
      }
    }

    
    /**
     * 
     * @param array
     * @param sum
     * @return
     */
    private static List<Pair> printArrayIndicesWithSum(int array[],int sum) {
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
