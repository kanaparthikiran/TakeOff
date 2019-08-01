/**
 * 
 */
package com.datastructures.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class WordsOfStringInReverseOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "I AM A GEEK"; 
	      
	    System.out.print(wordReverse(str)); 
	    
	    List<TestUser> userList = new ArrayList<>();
	    userList.add(new TestUser(10, "K"));
	    userList.add(new TestUser(20, "J"));
	    userList.add(new TestUser(6, "H"));
	    
	    userList.forEach(element->System.out.println(element));
	    

	    userList.sort((TestUser t1,TestUser t2)->t2.getName().compareToIgnoreCase(t1.getName()));	    
	    userList.forEach(element->System.out.println(element));

	}

	
	private static String wordReverse(String str) { 
		StringBuilder sb = new StringBuilder();
		int j = str.length();
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' '||i==0) {
				//str.replace(' ', '*');
				if(i==0) {
					sb.append(str.substring((i),j));
				} else {
					sb.append(str.substring((i+1),j)+' ');

				}
				j = i;
			}
		}
		return sb.toString();
	} 
}


class TestUser {
	@Override
	public String toString() {
		return "TestUser [age=" + age + ", name=" + name + "]";
	}
	private int age;
	public TestUser(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}