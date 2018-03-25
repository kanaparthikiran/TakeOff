package com.resto.comparator;

/**
 * @author kkanaparthi
 *
 */

/**
 * This class implements Comparable to sort the Edge Elements based on the Number of
 *  Days  it takes to deliver the Item.
 * 
 */
public class Edge implements Comparable<Edge>{
	
	/**
	 * @param startNode
	 */
	public Edge(NodeData startNode, long l) {
		super();
		this.startNode = startNode;
		this.noOfDays = l;
	}
	
	
	private NodeData startNode; 
	private NodeData endNode;
	private long noOfDays;
	
	/**
	 * @return the startNode
	 */
	public NodeData getStartNode() {
		return startNode;
	}
	
	
	public Edge(NodeData startNode, NodeData endNode, long l) {
		super();
		this.startNode = startNode;
		this.endNode = endNode;
		this.noOfDays = l;
	}

	/**
	 * @param startNode the startNode to set
	 */
	public void setStartNode(NodeData startNode) {
		this.startNode = startNode;
	}
	/**
	 * @return the endNode
	 */
	public NodeData getEndNode() {
		return endNode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Edge [startNode=" + startNode + ", endNode=" + endNode
				+ ", noOfDays=" + noOfDays + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endNode == null) ? 0 : endNode.hashCode());
		result = prime * result + (int) (noOfDays ^ (noOfDays >>> 32));
		result = prime * result
				+ ((startNode == null) ? 0 : startNode.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (endNode == null) {
			if (other.endNode != null)
				return false;
		} else if (!endNode.equals(other.endNode))
			return false;
		if (noOfDays != other.noOfDays)
			return false;
		if (startNode == null) {
			if (other.startNode != null)
				return false;
		} else if (!startNode.equals(other.startNode))
			return false;
		return true;
	}


	/**
	 * @param endNode the endNode to set
	 */
	public void setEndNode(NodeData endNode) {
		this.endNode = endNode;
	}
	
	/**
	 * This method is overridden to sort the Edges based on the Number of Days  it takes to ship the Item.
	 */
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		long compareQty = ((Edge)o).getNoOfDays();
		int difference = (int)(this.getNoOfDays() - compareQty);
		return difference;
	}
	
	
	/**
	 * @param noOfDays the noOfDays to set
	 */
	public void setNoOfDays(long noOfDays) {
		this.noOfDays = noOfDays;
	}
	/**
	 * @return the noOfDays
	 */
	public long getNoOfDays() {
		return noOfDays;
	}

}
