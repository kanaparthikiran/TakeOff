/**
 * 
 */
package com.datastructures.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kkanaparthi
 *
 */
public class Trie {

	TrieNode root;
	
	public Trie() {
		this.root = new TrieNode();
	}

	public void insert(String word) {
		Map<Character,TrieNode> children = root.children;
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			TrieNode t;
			if(children.containsKey(c)) {
				t = children.get(c);
			} else {
				t = new TrieNode();
				children.put(c, t);
			}
			children = t.children;
			if(i==word.length()-1) {
				t.leaf =true;
			}
		}
	}
	
	public boolean search(String word) {
		TrieNode t = searchNode(word);
		if(t!=null && t.leaf) {
			return true;
		}
		return false;
	}
	
	public TrieNode searchNode(String word) {
		Map<Character,TrieNode> children = root.children;
		TrieNode t = null;
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			if(children.containsKey(c)) {
				t = children.get(c);
			} else {
				return null;
			}
		}
		
		return t;
	}
	
	 public boolean dfsSearch(Map<Character, TrieNode> children, String word, int start) {
	        if(start == word.length()){
	            if(children.size()==0) 
	                return true; 
	            else
	                return false;
	        }
	 
	        char c = word.charAt(start);    
	 
	        if(children.containsKey(c)){
	            if(start == word.length()-1 && children.get(c).leaf){
	                return true;
	            }
	 
	            return dfsSearch(children.get(c).children, word, start+1);
	        }else if(c == '.'){
	            boolean result = false;
	            for(Map.Entry<Character, TrieNode> child: children.entrySet()){
	                if(start == word.length()-1 && child.getValue().leaf){
	                    return true;
	                } 
	 
	                //if any path is true, set result to be true; 
	                if(dfsSearch(child.getValue().children, word, start+1)){
	                    result = true;
	                }
	            }
	 
	            return result;
	        }else{
	            return false;
	        }
	    }
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}


class TrieNode {
	char c;
	boolean leaf;
	Map<Character,TrieNode> children = new HashMap<>();
	public TrieNode() {
		
	}
	public TrieNode(char c) {
		this.c = c;
	}
}