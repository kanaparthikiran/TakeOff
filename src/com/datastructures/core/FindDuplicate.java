/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 *
 */
class FindDuplicate
{
    void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for(i = 0; i < size; i++)
        {
        	
         System.out.println("  hh  hhhh  "+ arr[Math.abs(arr[i])]);
            if(arr[Math.abs(arr[i])] > 0)  {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];}
            else {
                System.out.print(Math.abs(arr[i]) + " ");
            }
        }         
    } 
    
    void findDuplicate(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for(i = 0; i < size-1; i++)
        {
        	
        	System.out.println("  hh  hhhh  "+ arr[i]+" "+arr[i+1]);
            if(arr[i]==arr[i+1])  {
            	System.out.println("Duplicate  "+arr[i]);
              }
        }
              
    } 
 
    /* Driver program to test the above function */
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {1,2,2,4,4};
        int arr_size = arr.length;
     duplicate.printRepeating(arr, arr_size);
        
        duplicate.findDuplicate(arr, arr_size);
    }
}
 