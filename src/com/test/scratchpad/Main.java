package com.test.scratchpad;

import java.util.HashSet;
import java.util.Set;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Main {
    public int solution(int[] A) {
        Set<Integer> elements = new HashSet<Integer>();
        int count = 0;
        int element = 0;
        int k =2;
        // write your code in Java SE 8
        if(A!=null && A.length>0) {
            while(true) {
                if(elements.contains(A[k])) {
                    break;
                } else {
                  element = A[k];
                  elements.add(A[element]);
                  count++;  
                }
            }
        }
        System.out.println(count);
        return count;
    }
    
    private int element(int A[], int k,int count) {
        Set<Integer> elements = new HashSet<Integer>();
        if(elements.contains(A[k])) {
        	return count;
        }
    	return element(A, A[k],count++);
    }
}