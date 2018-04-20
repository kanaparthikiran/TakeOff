/**
 * 
 */
package com.test.scratchpad;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kiran
 *
 */
public class BinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree BinaryTree =
				new BinaryTree();
		BinaryTree.solution(new int[] {5,4,0,3,1,6,2});
	}

	
    public int solution(int[] A) {
        Set<Integer> elements = new HashSet<Integer>();
        int count = 0;
        int element = 0;
        int k =2;
        // write your code in Java SE 8
        if(A!=null && A.length>0) {
            while(true) {
                element = A[k];
                if(elements.contains(A[element])) {
                    break;
                } else {
                  System.out.println(" element "+element+" a[k] "+A[k]);
                  elements.add(A[element]);
                  element = A[element];
                  count++;  
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
