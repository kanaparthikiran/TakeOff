package com.datastructures.queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
	
	public static void main(String a[]) {
		Solution solution  = new Solution();
		int[] response = solution.twoSum(new int[] {2,7,11,15}, 9);
		System.out.println(Arrays.toString(response));
		
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 }; 
        int x = 8; 
        findFirstAndLast(arr, x); 
        
	}
	
	 // Function for finding first and last occurrence 
    // of an elements 
    public static void findFirstAndLast(int arr[], int x) 
    { 
        int n = arr.length; 
        int first = -1;
        int last = -1; 
        for (int i = 0; i < n; i++) 
        { 
            if (x != arr[i]) 
                continue; 
            if (first == -1) 
                first = i; 
            last = i; 
        } 
        if (first != -1){ 
            System.out.println( "First Occurrence = "  + first); 
            System.out.println("Last Occurrence = " + last); 
        } 
        else
            System.out.println("Not Found"); 
    } 
    
    
    public int[] twoSum(int[] nums, int target) {
        int[] targetIndices = new int[2];
        Map<Integer,NumWithIndex> matchingMap = new HashMap<>();
        if(nums!=null && nums.length>0) {
            for(int num=0;num< nums.length;num++) {
                int difference = target-nums[num];
                if(matchingMap.containsKey(difference)) {
                    NumWithIndex n1 = matchingMap.get(difference);
                    System.out.print(num+" "+n1.getIndex());
                    targetIndices[0] = num;
                    targetIndices[1] = n1.getIndex();
                    break;
                } else {
                    matchingMap.put(nums[num],new NumWithIndex(nums[num],num));
                }
            }
        }
        return targetIndices;
    }
}

    class NumWithIndex {
        int number;
        int index;
        public NumWithIndex(int number,int index) {
            this.number = number;
            this.index = index;
        }
        public int getNumber() {
            return this.number;
        }
        public int getIndex() {
            return this.index;
        }
    }