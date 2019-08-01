/**
 * 
 */
package com.datastructures.trees;

/**
 * @author kkanaparthi
 *
 */
public class SortedArrayToBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = new int[] {1,2,3,4,5,6,7};
		TreeNode rootNode = convertArray(data,0,data.length-1);
		inOrder(rootNode);
		int elementIndex = 
				binarySearchIterative(data,9,0,data.length-1);
		System.out.println(" Element Index is "+elementIndex);
		int recElement = bianrySearchRecursive(data,0,data.length-1,5);
		System.out.println(" The search Element Recursive is "+recElement);
	}
	
	private static int binarySearchIterative(int[] data, int element, int start, int end) {
		if(data==null||data.length==0) {
			return -1;
		}
		 int elementIndex =  -1;
		while(start<=end ) {
			int middle = start+(end-start)/2;
			 if(data[middle]==element) {
				 elementIndex = middle;
				 return elementIndex;
			 } else if(data[middle]>element) {
				 end  = middle-1;
			 } else if(data[middle]<element) {
				 start = middle+1;
			 } else {
				 return -1;
			 }
		}
		return elementIndex;
	}
	
	
	private static int bianrySearchRecursive(int[]data, int start, int end , int searchElement) {
		if(data==null||data.length==0) {
			return -1;
		}
		int middle = start + (end-start)/2;
		if(data[middle]==searchElement) {
			return middle;
		} else if(searchElement<data[middle]) {
			return bianrySearchRecursive(data, start, middle-1, searchElement);
		} else if(searchElement>data[middle]) {
			return  bianrySearchRecursive(data, middle+1, end, searchElement);
		} else {
			return -1;
		}
	}
	
	

//	/**
//	 * 
//	 * @param a
//	 * @param size
//	 * @param x
//	 * @param start
//	 * @param end
//	 * @return
//	 */
//	private int binarySearchRecursive(int a[],int size,int x,int start,int end) {
//		int indexOfElement = -1;
//		int mid = (start+end)/2;
//		
//		if(x==a[mid]) {
//			indexOfElement = mid;
//			System.out.println("The Element FOund Using Recursion as well at the Index "
//					+ " "+ indexOfElement);
//		} else if(x<a[mid]) {
//			System.out.println(" x<a[mid] condition is reached ");
//			return binarySearchRecursive(a, size, x, start, mid-1);
//		} else if(x>a[mid]) {
//			System.out.println(" x>a[mid] condition is reached ");
//			return binarySearchRecursive(a, size, x, mid+1, end);
//		}  else {
//			System.out.println("It Should NOT be printed at all ");
//		}
//	
//		return indexOfElement;
//	}
//	
	
//	/**
//	 * 
//	 * @param elements
//	 * @return
//	 */
//	private int binarySearchIterative(int [] elements,
//				int searchElement,int start,int end) {
//		int elementIndex = -1;
//		if(elements!=null && elements.length>0) {
//			while(start<=end) {
//				int middle = start+(end-start)/2;
//				if(elements[middle]==searchElement) {
//					return middle;
//				} else if(elements[middle]>searchElement) {
//					end = middle-1;
//				} else if(elements[middle]<searchElement) {
//					start = middle+1;
//				} else {
//					
//				}
//			}
//		}
//		return elementIndex;
//	}
//	
	
	
	private static TreeNode convertArray(int[] data,int start, int end) {
		if(data==null||data.length==0) {
			return null;
		}
		if(start>end) return null;
		TreeNode root = null;
		int middle = start + (end - start)/2;
		root = new TreeNode(data[middle]);
		root.setLeft(convertArray(data, start, middle-1));
		root.setRight(convertArray(data, middle+1, end));
		return root;
	}
	
	private static void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
}





class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public TreeNode(int data) {
		this.data = data;
	}
}