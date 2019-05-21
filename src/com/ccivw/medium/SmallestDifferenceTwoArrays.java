/**
 * 
 */
package com.ccivw.medium;

import java.util.Arrays;

/**
 * @author kkanaparthi
 *
 */
public class SmallestDifferenceTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] {1,2,11,15};
		int b[] = new int[] {5,18,19,23,127,235};
		
		int smallestDifference = 
				getSmallestDifference(a, b);
		System.out.println(" Smallest difference is "+smallestDifference);
		int n = getFactorialZeros(29);
		System.out.println(" Factorial zeroes "+n);
		int elementIndex = binarySearch(0, b.length-1, b, 127);
		System.out.println(" Binary Search on the data is "+elementIndex);
		int binRecResult = bianrySearchRecursive(0, b.length-1, b, 127);
		System.out.println(" Binary Search Recursive result "+binRecResult);
		int insertIndex = searchInsert(new int[] {1,3,5,6}, 2);
		System.out.println(" Insert index is "+insertIndex);
	}

	private static int getSmallestDifference(int a[], int b[]) {
		Arrays.sort(a);
		Arrays.sort(b);
		int m = a.length-1;
		int n = b.length-1;
		int i = 0;
		int j = 0;
		int smallestDifference = Integer.MAX_VALUE;
		while(i<m&&j<n) {
			if(Math.abs(a[i]-b[j])<smallestDifference) {
				smallestDifference = Math.abs(a[i]-b[j]);
			}
			if(a[i]<b[j]) {
				i++;
			} else {
				j++;
			}
			
		}
		return smallestDifference;
	}
	
	private static int getFactorialZeros(int n) {
		if(n<0) {
			return 0;
		}
		int count = 0;
		for(int i=5;n/i>0;i=i*5) {
			count+=n/i;
		}
		return count;
	}
	
	
    private static int searchInsert(int[] nums, int target) {
        int targetIndex = -1;
        if(nums!=null && nums.length>0) {
            int start = 0;
            int end = nums.length-1;
            while(start<end) {
                int middle = start + (end-start)/2;
                if(target==nums[middle]) {
                    return middle;
                } 
                if(target>nums[middle]) {
                    start = middle+1;
                } else {
                    end = middle-1;
                }
            }
        }
        return targetIndex;
    }
    
	private static int binarySearch(int start,int end, int[] data, int element) {
		int indexOfElement = -1;
		if(data!=null && data.length>0) {
			while(start<end) {
				int middle = start+ (end-start)/2;
				if(element == data[middle]) {
					return middle;
				} 
				if(element>data[middle]) {
					start = middle+1;
				} else {
					end = middle-1;
				}
			}
		}
		return indexOfElement;
	}
	
	private static int bianrySearchRecursive(int start, int end, int[] data, int element) {
		int result = -1;
		if(data!=null && data.length>0) {
			int middle = start + (end-start)/2;
			if(data[middle]==element) {
				return middle;
			} else if(element>data[middle]) {
				return bianrySearchRecursive(middle+1,end,data,element);
			} else {
				return bianrySearchRecursive(start,middle-1,data,element);
			}
		}
		return result;
	}
}
