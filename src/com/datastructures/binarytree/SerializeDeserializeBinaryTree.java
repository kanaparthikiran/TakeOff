/**
 * 
 */
package com.datastructures.binarytree;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class SerializeDeserializeBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node = new Node(1);
		Node nodeTwo = new Node(2);
		Node nodeThree = new Node(3);
		node.setLeftNode(nodeTwo);
		node.setRightNode(nodeThree);
		
		Node nodeFour = new Node(4);
		Node nodeFive = new Node(5);

		Node nodeSix = new Node(6);
		Node nodeSeven = new Node(7);

		nodeTwo.setLeftNode(nodeFour);
		nodeTwo.setRightNode(nodeFive);
		
		nodeThree.setLeftNode(nodeSix);
		nodeThree.setRightNode(nodeSeven);
		String serialized = serialize(node);
		System.out.println(" Serialized "+serialized);
		Node nodeDeserialized = deserialize(serialized);
		System.out.println(" DeSerialized "+serialize(nodeDeserialized));
		printAllFiles("/Users/kkanaparthi/Desktop",new File("/Users/kkanaparthi/Desktop"));
	}
	
	
	private static void printAllFiles(String filePath,File folder) {
		if(filePath==null) {
			return;
		}
		File[] files = folder.listFiles();
		for(File element : files) {
			if(element.isDirectory()) {
				printAllFiles(filePath,element);
			} else {
				System.out.println(" FileName "+ element.getName());
			}
		}
	}
	
	
	private static String serialize(Node node) {
		StringBuilder serData = new StringBuilder();
		if(node==null) {
			return "null,";
		}
		serData.append(node.getData()+",");
		serData.append(serialize(node.getLeftNode()));
		serData.append(serialize(node.getRightNode()));
		return serData.toString();
	}
	static int index;

	
	private static Node deserializeValues(String[] data) {
		if (index > data.length || data[index].equals("null")) {
            index++;
            return null;
        }
	    Node node = new Node(Integer.parseInt(data[index++]));
        node.setLeftNode(deserializeValues(data));
        node.setRightNode(deserializeValues(data));
 
        return node;
	}
	
	private static Node deserialize(String data) {
		String[] dataValues = data.split(",");
		return deserializeValues(dataValues);
	}
}
