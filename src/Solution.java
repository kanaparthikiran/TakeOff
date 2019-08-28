import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

class ListNode<T> {
	ListNode(T x) {
	value = x;
	}
	T value;
	ListNode<T> next;
}

class Node  {
	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
	public Node(int value) {
		super();
		this.value = value;
	}
	Node next;
	int value;
}

public class Solution {
	 private static final Scanner scan = new Scanner(System.in);
	    
	 
	  public static ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
	        if(l1 == null && l2 == null) {
	            return null;
	        }
	        if(l1 == null) {
	            return l2;
	        }
	        if(l2 == null) {
	            return l1;
	        }
	        ListNode<Integer> dummy = new ListNode<Integer>(0);
	        ListNode<Integer> l3 = dummy;
	        int carry = 0;
	        while(l1!=null || l2!=null) {
	            int x = l1!=null?l1.value:0;
	            int y = l2!=null?l2.value:0;
	            int tempSum = x+y+carry;
	            carry = tempSum/10;
	            ListNode<Integer> temp = new ListNode<Integer>(tempSum%10);
	            l3.next = temp;
	            if(l1!=null) {
	                l1 = l1.next;
	            }
	            if(l2!=null) {
	                l2 = l2.next;
	            }
	            l3 = l3.next;
	        }
	        if(carry>0) {
	            l3.next = new ListNode(carry);
	        }
	        return dummy.next;
	    }
	  
	 	private static Node deleteNode(Node node, int value) {
	 		if(node == null) {
	 			return null;
	 		}
	 		if(node.value == value) {
	 			node = node.next;
	 		}
	 		Node currentNode = node;
	 		Node previousNode = null;
	 		while(currentNode != null) {
	 			while(currentNode != null && currentNode.value != value) {
	 				previousNode = currentNode;
	 				currentNode = currentNode.next;
	 			}
	 			if(currentNode == null) {
	 				return node;
	 			}
	 			previousNode.next = currentNode.next;
	 			currentNode = previousNode.next;
	 		}
	 		return node;
	 	}
	 	
	 	private static void printListElements(Node node) {
	 		if( node == null) {
	 			return;
	 		}
	 		Node currentNode = node;
	 		while(currentNode!=null) {
	 			System.out.print(currentNode.value+" => ");
	 			currentNode = currentNode.next;
	 		}
	 	}

	 	
	 	private static void printListElements(ListNode node) {
	 		if( node == null) {
	 			return;
	 		}
	 		ListNode currentNode = node;
	 		while(currentNode!=null) {
	 			System.out.print(currentNode.value+" => ");
	 			currentNode = currentNode.next;
	 		}
	 	}
	 	
	    public static ListNode removeNthFromEnd(ListNode head, int n) {
	        if(n < 0 || head == null) {
	            return head;
	        }
	        ListNode firstPointer = head;
	        int i = 0;
	        while(firstPointer!=null && i<n) {
	            firstPointer = firstPointer.next;
	            i++;
	        }
	        if(firstPointer==null) {
	            return head;
	        }
	        ListNode secondPointer = head;
	        ListNode prevNode = null;
	        
	        //while(secondPointer!=null) {
		        while(firstPointer!=null) {
		            prevNode = secondPointer;
		            firstPointer = firstPointer.next;
		            secondPointer = secondPointer.next;
		        }
		        prevNode.next = secondPointer.next;
		        secondPointer = prevNode.next;
	       // }

	        return head;
	    }
	    
	    
	    public static String longestCommonPrefix(String[] strs,String minByLength) {
	        StringBuilder sb = new StringBuilder("");
	        if(strs == null || strs.length == 0) {
	            return sb.toString();
	        }
	        for(int i=0;i<minByLength.length();i++) {
	            char c = minByLength.charAt(i);
	            boolean matched = false;
	            for(int j = 1;j<strs.length;j++) {
	                if(strs[j].charAt(i)!=c) {
	                   return sb.toString();
	                } else {
	                    matched = true;
	                }
	            }
	            if(matched) {
	                sb.append(c);
	            }
	        }
	        
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        minHeap.add(1);
	        return sb.toString();
	    }
	 	
	    
	    public static boolean isPalindrome(String s) {
	        if(s==null || s.length()==0) {
	            return true;
	        }
	        int i = 0;
	        int j = s.length()-1;
	        char[] elements = s.toCharArray();
	        while(i<j) {
	            if(Character.isAlphabetic(elements[i]) && Character.isAlphabetic(elements[j])) {
	            	
//		        	System.out.println(" i "+i+"j "+j+" elem i "+elements[i]+" sec "+elements[j]);

	              if(Character.toUpperCase(elements[i])==Character.toUpperCase(elements[j])) {
	                  i++;
	                  j--;
	               } else {
	                  return false;
	              }
	              } else if(!Character.isAlphabetic(elements[i])) {
	                i++;
	              } else if(!Character.isAlphabetic(elements[j])) {
	                j--;
	              } else {
	                   i++;
	                   j--;
	              }
	        }
	          return true;
	      }
	    private static int strstr(String s, String x) {
	        if(s==null || x==null) {
	            return -1;
	        }
	        int index = 0;
	        char[] sElements = s.toCharArray();
	        char[] xElements = x.toCharArray();
            for(int j=0;j<sElements.length;j++) {
            	if(sElements[j]==xElements[0]) {
            		int size = 0;
            		index = j;
                    while(j<sElements.length && size<xElements.length) {
                        if(sElements[j++]!=xElements[size]) {
                           break;
                        } else {
                        	size++;
                        }
                    }
                    if(size == xElements.length) {
                    	return index;
                    } 
                } else {
                }
             }
	        return -1;
	        
    }
	    
	 	public static void main(String args[]) throws Exception {
	 		String[] data = new String[] {"aa","a"};
	 		Map<String,String> map = new HashMap<>();
	 		boolean isPalindrome = isPalindrome("OP");
	 		System.out.println(" IS Palindrome "+isPalindrome);
//	 		
//	 		int response = strstr("mississippi", "issip");
//	 		System.out.println(" str str response is " + response);
	 		
//	 		//map.getOrDefault(key, defaultValue);
//	 		PriorityQueue<String> byLength = new PriorityQueue<>((a,b)->a.length()-b.length());
//	        for(String element : data) {
//	        	byLength.add(element);
//	        }
//	 		System.out.println(" byLength "+byLength);
//	 		String shortest = byLength.poll();
//	 		int minimum = Integer.MAX_VALUE;
//	 		for(String element : data) {
//	 			minimum =
//	 					Math.min(element.length(), minimum);
//	 			
//	 		}
//	 		
//	 		String lcp = longestCommonPrefix(data,shortest);
//	 		System.out.println(" Longest Common Prefix "+lcp);
	 		
//	    	Node n1 = new Node(1);
//	    	Node n2 = new Node(2);
//	    	Node n3 = new Node(3);
//	    	Node n4 = new Node(4);
//	    	Node n5 = new Node(5);
////	    	Node n6 = new Node(7);
//	    	n1.next = n2;
//	    	n2.next = n3;
//	    	n3.next = n4;
//	    	n4.next = n5;
	    	//n5.next = n6;
//	    	printListElements(n1);
//	    	
//	    	deleteNode(n1, 3);
//	    	System.out.println(" After Delete from the List ");
//	    	printListElements(n1);
//	    	System.out.println();
	 		
	 		ListNode n1 = new ListNode(1);
	 		ListNode n2 = new ListNode(2);
	 		ListNode n3 = new ListNode(3);
	 		ListNode n4 = new ListNode(4);
	 		ListNode n5 = new ListNode(5);
	 		n1.next = n2;
	 		n2.next = n3;
	 		n3.next = n4;
	 		n4.next = n5;

	 		ListNode n11 = new ListNode(5);
	 		ListNode n12 = new ListNode(9);
	 		ListNode n13 = new ListNode(9);
	 		ListNode n14 = new ListNode(9);
	 		ListNode n15 = new ListNode(9);
	 		n11.next = n12;
	 		n12.next = n13;
	 		n13.next = n14;
	 		n14.next = n15;
	 		
	 		ListNode<Integer> merged = 
	 				addTwoNumbers(n1, n12);
	 		printListElements(merged);
	 		System.out.println();
//	    	Node n6 = new Node(7);
	//    	n1.next = n2;
//	    	n2.next = n3;
//	    	n3.next = n4;
//	    	n4.next = n5;
//	    	ListNode response = removeNthFromEnd(n1, 1);
//	    	System.out.println(" After Delete from the List ");
//	    	printListElements(n1);
//	    	System.out.println();
	    	
//	        // read the string filename
//	        String filename;
//	        filename = scan.nextLine();
//	        
//		    String data = "burger.letters.com - - [01/Jul/1995:00:00:12 -0400] \"GET /shuttle/countdown/video/livevideo.gif HTTP/1.0\" 200 0";	
//	    	Map<String,List<String>> response = 
//	    			eligibleInputData(data);
//	    	System.out.println(" Response is "+response);
//	    	int response = 
//	    			myAtoi("   -42");
//	    	System.out.println(" Response is "+response);
	    	
//	    	FileWriter fileWriter = new FileWriter(new File("test.text"));
//	    	PrintWriter pw = new PrintWriter(fileWriter);
//	    	pw.print("TEST MESSAGE 1");
//	    	pw.print("TEST MESSAGE 2");
//	    	pw.print("TEST MESSAGE 3");
//
//	    	pw.close();
//	    	
//	    	int sqrtResult = mySqrt(8);
//	    	System.out.println(" Square root result "+sqrtResult);
//	    	System.out.println(" Response is "+ (0%-3));
	    }

	    private static Map<String,List<String>> eligibleInputData(String data) {
            if(data==null||data.length()==0) {
                return null;
            }
            
            int a = 1/0;
            Map<String,List<String>> dataOutput = new HashMap<>();
            String[] parsedData = data.split("- -");
            String fileName = null;
            if(parsedData!=null||parsedData.length>2) {
                String requestType = 
                    parsedData[1].substring(parsedData[1].indexOf('"'),parsedData[1].lastIndexOf('"'));
                System.out.println(" requestType contains GET "+
                    requestType.contains("GET")+"  requestType "+requestType);
                String statusCode = 
                    parsedData[1].substring(parsedData[1].lastIndexOf('"')).split("\\s+")[1];
                String[] imagesTag = requestType.split("\\s+")[1].split("/");
                String isGiffile =  imagesTag[imagesTag.length-1];
                    System.out.println(" statusCode "+statusCode+" requestType "+
                requestType+" isGiffile "+isGiffile);
                fileName = "gifs_"+parsedData[0];
              //  dataOutput.add(fileName);
                if(dataOutput.containsKey(fileName)) {
                    List<String> innerListExisting =  dataOutput.get(fileName);
                    innerListExisting.add(isGiffile);
                    dataOutput.put(fileName,innerListExisting);
                } else {
                    List<String> innerList = new ArrayList<>();
                    innerList.add(isGiffile);
                    dataOutput.put(fileName,innerList);
                }
            }
            return dataOutput;
    }
	    
	    
	    public static int mySqrt(int x) {
	        if(x<=0) {
	            return x;
	        }
	        int start = 1;
	        int end = x;
	        int result = -1;
	        while(start<=end) {
	            int middle = start+ (end-start)/2;
	            if(x==middle*middle) {
	                return middle;
	            } else if(middle*middle<x) {
	               start = middle+1; 
	            } else {
	                end = middle-1;
	            }  
	        }
	        return result;
	    }
	    
	    
	    public static int myAtoi(String str) {
	        if(str==null||str.length()==0||str.trim().length()==0) {
	            return 0;
	        }
	        String trimmedData = str.trim();
	        boolean isNegativeNumber = false;
	        String data = null;
	        if(trimmedData.charAt(0)=='-') {
	            isNegativeNumber = true;
	            if(trimmedData.length()>1) {
	                data = trimmedData.substring(1);
	            } else {
	                return 0;
	            }
	        } else if(trimmedData.charAt(0)=='+') {
	            data = trimmedData.substring(1);
	            if(trimmedData.length()>1) {
	                data = trimmedData.substring(1);
	            } 
	        } 
	        int number = 0;
	        if(data!=null && !data.isEmpty()) {
		        for(char element : data.toCharArray()) {
		            if(element<'0'||element>'9') {
		                return 0;
		            }
		            int temp = element-'0';
		            number = number*10+temp;
		            System.out.println(" Number before conversion is "+number);
		        }
	        }
	        if(isNegativeNumber) {
	            return -1*number;
	        }
	        return number;
	    }
}