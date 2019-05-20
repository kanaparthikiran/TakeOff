/**
 * 
 */
package com.datastructures.binarytree;

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
