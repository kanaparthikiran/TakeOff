package com.algorithms.factorial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{ 
	
	
    private static int[][] convertListToMatrix(List<List<Integer>> list) {
        int[][] matrix = new int[list.size()][list.get(0).size()];
        int  i  = 0;
        for(List<Integer> outerList : list) {
        	for(int j=0;j<outerList.size();j++) {
        		matrix[i][j] = (int) outerList.get(j);
        	}
        	i++;
        }
        return matrix;
    }
    
    
    private static void printMatrix(int[][] matrix ) {
        for(int i=0;i< matrix.length;i++) {
        	for(int j=0;j<matrix[i].length;j++) {
        		System.out.println("  "+matrix[i][j]);
        	}
        	System.out.println();
        }
    }
    
    private static List<List<Integer>> convertMatrixToList(int[][] matrix) {
    	List<List<Integer>> finalList = new ArrayList<>();
        for(int i=0;i< matrix.length;i++) {
        	List<Integer> innerList = new ArrayList<>();
        	for(int j=0;j<matrix[i].length;j++) {
        		innerList.add(matrix[i][j]);
        	}
        	finalList.add(innerList);
        }
        return finalList;
    }
    
	
	public static void main(String a[]) {
		//Arrays.asList(new int[] {20,70,90,30,60}
		List al = new ArrayList<>();
		al.add(20);
		al.add(70);
		al.add(90);
		al.add(30);
		al.add(60);
		
		List al2 = new ArrayList<>();
		al2.add(11);
		al2.add(22);
		al2.add(23);
		al2.add(24);
		al2.add(25);
		
		List<List<Integer>> masterList = new ArrayList<>();
		masterList.add(al);
		masterList.add(al2);
		System.out.println(" masterList  "+masterList);
		int[][] mm = convertListToMatrix(masterList);
		printMatrix(mm);
	//	System.out.println(" masterMatrix "+mm);

	//	System.out.println( " result :"+ new Solution().IDsOfPackages(110,al));
	}
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	ArrayList<Integer> IDsOfPackages(int truckSpace, 
	                                 ArrayList<Integer> packagesSpace)
	{
        ArrayList<Integer> results = new ArrayList<>();
        if(packagesSpace==null || packagesSpace.size()==0) {
            return results;
        }
        Set<Element> existingItems = new HashSet<>();
        for(int i=0;i<packagesSpace.size();i++) {
            int complement = truckSpace-packagesSpace.get(i);
            if(!existingItems.contains(new Element(complement))) {
                Element element = new Element(packagesSpace.get(i),i);
                existingItems.add(element);
            } else {
                results.add(getIndexFromElement(existingItems,complement));
                results.add(i);
            }
        }
    	return results;
	}
	
	private int getIndexFromElement(Set<Element> set,int complement) {
	    for(Element check : set) {
	        if(check.data==complement) {
	            return check.index;
	        }
	    }
	    return -1;
	}
}

class Element {
    public Element(int data) {
		super();
		this.data = data;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (data != other.data)
			return false;
		return true;
	}
	int data;
    int index;
    public int getData() { return this.data; }
    public int getIndex() { return this.index;}
    public Element(int data,int index) {
        this.data = data;
        this.index = index;
    }
}

