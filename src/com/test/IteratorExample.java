/**
 * 
 */
package com.test;

/**
 * @author kkanaparthi
 *
 */
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {

	public static void main(String args[]){
		List<String> myList = new ArrayList<String>();
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		
//		Iterator<String> it = myList.iterator();
//		while(it.hasNext()){
//			String value = it.next();
//			System.out.println("List Value:"+value);
//			
//			if(value.equals("3"))  {
//				myList.remove(value);
//			//	myList.clear();
//			}
//			
//	//		System.out.println("List Value AFTER :"+value);
//		}
		
//		
//		for(String myListElem : myList) {
//			System.out.println("myListElem Value:"+myListElem);
//			
//			if(myListElem.equals("3"))  {
//			//	myList.remove(myListElem);
//				myList.clear();
//			}
//			
//	//		System.out.println("List Value AFTER :"+value);
//		}
		
		
		System.out.println("BEFORE STARTING NEXT LOOP");
		
		Iterator<String> it2 = myList.iterator();

		while(it2.hasNext()){
			String value = it2.next();
//			System.out.println("List Value:"+value);
//			
//			if(value.equals("3"))  {
//			//	myList.remove(value);
//				myList.clear();
//			}
			
			System.out.println("List Value NEXT LOOP :"+value);
		}
		
		Iterator<String> iter = myList.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.println("3rd List List Value NEXT LOOP :"+str);

		      if( str.equals("3") )
		      {
		        iter.remove();
		      }
		}
		
		Iterator<String> iter4 = myList.iterator();

		while(iter4.hasNext()){
			String value = iter4.next();
//			System.out.println("List Value:"+value);
//			
//			if(value.equals("3"))  {
//			//	myList.remove(value);
//				myList.clear();
//			}
			
			System.out.println("4444 TH List Value NEXT LOOP :"+value);
		}
		
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("A");
		llist.add("B");

		for (String s : llist) {
			System.out.println("555555 TH List Value NEXT LOOP :"+s);

			if (s.equals("B")) {
				llist.remove(s);
			}
		}
		
		
		for (String s : llist) {
			System.out.println("666666 TH List Value NEXT LOOP :"+s);

//			if (s.equals("B")) {
//				llist.remove(s);
//			}
		}
		
//		Map<String,String> myMap = new HashMap<String,String>();
//		myMap.put("1", "1");
//		myMap.put("2", "2");
//		myMap.put("3", "3");
//
//		Iterator<String> it1 = myMap.keySet().iterator();
//		while(it1.hasNext()){
//			String key = it1.next();
//			System.out.println("Map Value:"+myMap.get(key));
//			if(key.equals("2")){
//				myMap.put("1","4");
//				//myMap.put("4", "4");
//			}
//		}
		
	}
}