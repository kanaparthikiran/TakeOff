/**
 * 
 */
package com.resto.comparator;

/**
 * @author kkanaparthi
 *
 */
public class NodeData {
	
	private String nodeType;
	private long quantity;
	private long offset;
	private boolean webEnabled;
	
	private String bestETAWH;
	private String consolidatedWH;
	private String shipVia;
	private String scfWh;
	
	private int warehousePriority;
	private int stockingLevel;

	private long poOffset;
	private int poWaitFactor1;
	private int poWaitFactor2;

	
	/**
	 * @return the poWaitFactor1
	 */
	public int getPoWaitFactor1() {
		return poWaitFactor1;
	}
	/**
	 * @param poWaitFactor1 the poWaitFactor1 to set
	 */
	public void setPoWaitFactor1(int poWaitFactor1) {
		this.poWaitFactor1 = poWaitFactor1;
	}
	/**
	 * @return the poWaitFactor2
	 */
	public int getPoWaitFactor2() {
		return poWaitFactor2;
	}
	/**
	 * @param poWaitFactor2 the poWaitFactor2 to set
	 */
	public void setPoWaitFactor2(int poWaitFactor2) {
		this.poWaitFactor2 = poWaitFactor2;
	}


	/**
	 * @return the scfOffset
	 */
	public long getScfOffset() {
		return scfOffset;
	}
	/**
	 * @param pScfOffset the scfOffset to set
	 */
	public void setScfOffset(long pScfOffset) {
		scfOffset = pScfOffset;
	}
	/**
	 * @return the transitOffset
	 */
	public long getTransitOffset() {
		return transitOffset;
	}
	/**
	 * @param pTransitOffset the transitOffset to set
	 */
	public void setTransitOffset(long pTransitOffset) {
		transitOffset = pTransitOffset;
	}
	private long scfOffset;
	private long transitOffset;
	
	/**
	 * @return the backOrderNegativeOffset
	 */
	public boolean isBackOrderNegativeOffset() {
		return backOrderNegativeOffset;
	}
	/**
	 * @param backOrderNegativeOffset the backOrderNegativeOffset to set
	 */
	public void setBackOrderNegativeOffset(boolean backOrderNegativeOffset) {
		this.backOrderNegativeOffset = backOrderNegativeOffset;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(long offset) {
		this.offset = offset;
	}
	private boolean backOrderNegativeOffset;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (backOrderNegativeOffset ? 1231 : 1237);
		result = prime * result + ((bestETAWH == null) ? 0 : bestETAWH.hashCode());
		result = prime * result + ((consolidatedWH == null) ? 0 : consolidatedWH.hashCode());
		result = prime * result + ((nodeType == null) ? 0 : nodeType.hashCode());
		result = prime * result + (int) (offset ^ (offset >>> 32));
		result = prime * result + poWaitFactor1;
		result = prime * result + poWaitFactor2;
		result = prime * result + (int) (quantity ^ (quantity >>> 32));
		result = prime * result + (int) (scfOffset ^ (scfOffset >>> 32));
		result = prime * result + ((scfWh == null) ? 0 : scfWh.hashCode());
		result = prime * result + ((shipVia == null) ? 0 : shipVia.hashCode());
		result = prime * result + stockingLevel;
		result = prime * result + (int) (transitOffset ^ (transitOffset >>> 32));
		result = prime * result + warehousePriority;
		result = prime * result + (webEnabled ? 1231 : 1237);
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
		NodeData other = (NodeData) obj;
		if (backOrderNegativeOffset != other.backOrderNegativeOffset)
			return false;
		if (bestETAWH == null) {
			if (other.bestETAWH != null)
				return false;
		} else if (!bestETAWH.equals(other.bestETAWH))
			return false;
		if (consolidatedWH == null) {
			if (other.consolidatedWH != null)
				return false;
		} else if (!consolidatedWH.equals(other.consolidatedWH))
			return false;
		if (nodeType == null) {
			if (other.nodeType != null)
				return false;
		} else if (!nodeType.equals(other.nodeType))
			return false;
		if (offset != other.offset)
			return false;
		if (poWaitFactor1 != other.poWaitFactor1)
			return false;
		if (poWaitFactor2 != other.poWaitFactor2)
			return false;
		if (quantity != other.quantity)
			return false;
		if (scfOffset != other.scfOffset)
			return false;
		if (scfWh == null) {
			if (other.scfWh != null)
				return false;
		} else if (!scfWh.equals(other.scfWh))
			return false;
		if (shipVia == null) {
			if (other.shipVia != null)
				return false;
		} else if (!shipVia.equals(other.shipVia))
			return false;
		if (stockingLevel != other.stockingLevel)
			return false;
		if (transitOffset != other.transitOffset)
			return false;
		if (warehousePriority != other.warehousePriority)
			return false;
		if (webEnabled != other.webEnabled)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NodeData [nodeType=" + nodeType + ", quantity=" + quantity + ", offset=" + offset + ", webEnabled="
				+ webEnabled + ", bestETAWH=" + bestETAWH + ", consolidatedWH=" + consolidatedWH + ", shipVia="
				+ shipVia + ", scfWh=" + scfWh + ", warehousePriority=" + warehousePriority + ", stockingLevel="
				+ stockingLevel + ", poOffset=" + poOffset + ", poWaitFactor1=" + poWaitFactor1 + ", poWaitFactor2="
				+ poWaitFactor2 + ", scfOffset=" + scfOffset + ", transitOffset=" + transitOffset
				+ ", backOrderNegativeOffset=" + backOrderNegativeOffset + "]";
	}


	/**
	 * @return the nodeType
	 */
	public String getNodeType() {
		return nodeType;
	}


	/**
	 * 
	 * @param nodeType
	 * @param quantity
	 * @param offset
	 * @param webEnabled
	 * @param backOrderNegativeOffset
	 * @param bestETAWH
	 * @param consolidatedWH
	 * @param shipVia
	 * @param scfWh
	 * @param scfOffset
	 * @param transitOffset
	 * @param warehousePriority
	 * @param stockingLevel
	 * @param poOffset
	 * @param poWaitFactor1
	 * @param poWaitFactor2
	 */
	public NodeData(String nodeType, long quantity, long offset, boolean webEnabled, boolean backOrderNegativeOffset,
			String bestETAWH, String consolidatedWH, String shipVia, String scfWh, long scfOffset, long transitOffset,
			int warehousePriority, int stockingLevel, long poOffset, int poWaitFactor1, int poWaitFactor2) {
		super();
		this.nodeType = nodeType;
		this.quantity = quantity;
		this.offset = offset;
		this.webEnabled = webEnabled;
		this.backOrderNegativeOffset = backOrderNegativeOffset;
		this.bestETAWH = bestETAWH;
		this.consolidatedWH = consolidatedWH;
		this.shipVia = shipVia;
		this.scfWh = scfWh;
		this.scfOffset = scfOffset;
		this.transitOffset = transitOffset;
		this.warehousePriority = warehousePriority;
		this.stockingLevel = stockingLevel;
		this.poOffset = poOffset;
		this.poWaitFactor1 = poWaitFactor1;
		this.poWaitFactor2 = poWaitFactor2;
	}
	/**
	 * @param nodeType the nodeType to set
	 */
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	/**
	 * @return the quantity
	 */
	public long getQuantity() {
		return quantity;
	}
/*	*//**
	 * @param nodeType
	 * @param quantity
	 * @param offset
	 *//*
	public NodeData(String nodeType, long quantity, long offset) {
		super();
		this.nodeType = nodeType;
		this.quantity = quantity;
		this.offset = offset;
	}*/
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the offset
	 */
	public long getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	/**
	 * @return the webEnabled
	 */
	public boolean isWebEnabled() {
		return webEnabled;
	}
	/**
	 * @param webEnabled the webEnabled to set
	 */
	public void setWebEnabled(boolean webEnabled) {
		this.webEnabled = webEnabled;
	}
	/**
	 * @return the bestETAWH
	 */
	public String getBestETAWH() {
		return bestETAWH;
	}
	/**
	 * @param pBestETAWH the bestETAWH to set
	 */
	public void setBestETAWH(String pBestETAWH) {
		bestETAWH = pBestETAWH;
	}
	/**
	 * @return the consolidatedWH
	 */
	public String getConsolidatedWH() {
		return consolidatedWH;
	}
	/**
	 * @param pConsolidatedWH the consolidatedWH to set
	 */
	public void setConsolidatedWH(String pConsolidatedWH) {
		consolidatedWH = pConsolidatedWH;
	}
	/**
	 * @return the shipVia
	 */
	public String getShipVia() {
		return shipVia;
	}
	/**
	 * @param pShipVia the shipVia to set
	 */
	public void setShipVia(String pShipVia) {
		shipVia = pShipVia;
	}
	/**
	 * @return the scfWh
	 */
	public String getScfWh() {
		return scfWh;
	}
	/**
	 * @param pScfWh the scfWh to set
	 */
	public void setScfWh(String pScfWh) {
		scfWh = pScfWh;
	}

	/**
	 * @return the warehousePriority
	 */
	public int getWarehousePriority() {
		return warehousePriority;
	}
	/**
	 * @param warehousePriority the warehousePriority to set
	 */
	public void setWarehousePriority(int warehousePriority) {
		this.warehousePriority = warehousePriority;
	}
	/**
	 * @return the stockingLevel
	 */
	public int getStockingLevel() {
		return stockingLevel;
	}
	/**
	 * @param stockingLevel the stockingLevel to set
	 */
	public void setStockingLevel(int stockingLevel) {
		this.stockingLevel = stockingLevel;
	}
	/**
	 * @return the poOffset
	 */
	public long getPoOffset() {
		return poOffset;
	}
	/**
	 * @param poOffset the poOffset to set
	 */
	public void setPoOffset(long poOffset) {
		this.poOffset = poOffset;
	}
	

	

}
