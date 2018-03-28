/**
 * 
 */
package com.core.comparator;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class OffsetMDB  implements Comparable<OffsetMDB> {
	
	private String shipVia;
	private long offset;
	private long miracleDays;
	private List<String> description;
	private long availabilityStatus;
	private boolean webEnabled;
	private String fullSkuId;
	private boolean isDropshipSku;
	private long totalQty;
	private long hoppingQty;
	private long inStockQty;
	private boolean defaultGrouped;
	private String  skuInDoorOrOutDoor;
	private boolean groupingEligible;
	private long scfOffset;
	private long transitOffset;
	private String scfWh;
	private String offsetType;
	private Calendar calendarOffset;
	private Timestamp itemDeliveryDate;
	private String itemDeliveryDateRange;
	private String itemDeliveryDateRangeNonMetros;
	private String bestETAWH;
	private String consolidatedWH;
	private String cushionOrFrame;
	private String likeItem;
	private String mustBeStocked;
	private String unGroupable;
	private String spoConsDC;
	private String spoToDC;
	private long spoToDCOffset;
	

	/**
	 * @param availabilityStatus the availabilityStatus to set
	 */
	public void setAvailabilityStatus(long availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	
	public boolean isDefaultGrouped() {
		return defaultGrouped;
	}

	public void setDefaultGrouped(boolean defaultGrouped) {
		this.defaultGrouped = defaultGrouped;
	}

	public String getSkuInDoorOrOutDoor() {
		return skuInDoorOrOutDoor;
	}

	public void setSkuInDoorOrOutDoor(String skuInDoorOrOutDoor) {
		this.skuInDoorOrOutDoor = skuInDoorOrOutDoor;
	}

	public boolean isGroupingEligible() {
		return groupingEligible;
	}

	public void setGroupingEligible(boolean groupingEligible) {
		this.groupingEligible = groupingEligible;
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


	/**
	 * @return the calendarOffset
	 */
	public Calendar getCalendarOffset() {
		return calendarOffset;
	}


	/**
	 * 
	 * @param shipVia
	 * @param offset
	 * @param miracleDays
	 * @param description
	 * @param availabilityStatus
	 * @param webEnabled
	 * @param fullSkuId
	 * @param isDropshipSku
	 * @param totalQty
	 * @param hoppingQty
	 * @param inStockQty
	 * @param defaultGrouped
	 * @param skuInDoorOrOutDoor
	 * @param groupingEligible
	 * @param scfOffset
	 * @param transitOffset
	 * @param scfWh
	 * @param offsetType
	 * @param calendarOffset
	 * @param itemDeliveryDate
	 * @param itemDeliveryDateRange
	 * @param itemDeliveryDateRangeNonMetros
	 * @param bestETAWH
	 * @param consolidatedWH
	 * @param cushionOrFrame
	 * @param likeItem
	 * @param mustBeStocked
	 * @param unGroupable
	 * @param spoConsDC
	 * @param spoToDC
	 * @param spoToDCOffset
	 */
	public OffsetMDB(String shipVia, long offset, long miracleDays, List<String> description,
			long availabilityStatus, boolean webEnabled, String fullSkuId, boolean isDropshipSku, long totalQty,
			long hoppingQty, long inStockQty, boolean defaultGrouped, String skuInDoorOrOutDoor,
			boolean groupingEligible, long scfOffset, long transitOffset, String scfWh, String offsetType,
			Calendar calendarOffset, Timestamp itemDeliveryDate, String itemDeliveryDateRange,
			String itemDeliveryDateRangeNonMetros, String bestETAWH, String consolidatedWH, String cushionOrFrame,
			String likeItem, String mustBeStocked, String unGroupable, String spoConsDC, String spoToDC,
			long spoToDCOffset) {
		super();
		this.shipVia = shipVia;
		this.offset = offset;
		this.miracleDays = miracleDays;
		this.description = description;
		this.availabilityStatus = availabilityStatus;
		this.webEnabled = webEnabled;
		this.fullSkuId = fullSkuId;
		this.isDropshipSku = isDropshipSku;
		this.totalQty = totalQty;
		this.hoppingQty = hoppingQty;
		this.inStockQty = inStockQty;
		this.defaultGrouped = defaultGrouped;
		this.skuInDoorOrOutDoor = skuInDoorOrOutDoor;
		this.groupingEligible = groupingEligible;
		this.scfOffset = scfOffset;
		this.transitOffset = transitOffset;
		this.scfWh = scfWh;
		this.offsetType = offsetType;
		this.calendarOffset = calendarOffset;
		this.itemDeliveryDate = itemDeliveryDate;
		this.itemDeliveryDateRange = itemDeliveryDateRange;
		this.itemDeliveryDateRangeNonMetros = itemDeliveryDateRangeNonMetros;
		this.bestETAWH = bestETAWH;
		this.consolidatedWH = consolidatedWH;
		this.cushionOrFrame = cushionOrFrame;
		this.likeItem = likeItem;
		this.mustBeStocked = mustBeStocked;
		this.unGroupable = unGroupable;
		this.spoConsDC = spoConsDC;
		this.spoToDC = spoToDC;
		this.spoToDCOffset = spoToDCOffset;
	}

	/**
	 * @param pCalendarOffset the calendarOffset to set
	 */
	public void setCalendarOffset(Calendar pCalendarOffset) {
		calendarOffset = pCalendarOffset;
	}
	/**
	 * @return the itemDeliveryDate
	 */
	public Timestamp getItemDeliveryDate() {
		return itemDeliveryDate;
	}
	/**
	 * @param pItemDeliveryDate the itemDeliveryDate to set
	 */
	public void setItemDeliveryDate(Timestamp pItemDeliveryDate) {
		itemDeliveryDate = pItemDeliveryDate;
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
	 * @return the availabilityStatus
	 */
	public long getAvailabilityStatus() {
		return availabilityStatus;
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
	public void setOffset(long offset) {
		this.offset = offset;
	}
	/**
	 * @return the miracleDays
	 */
	public long getMiracleDays() {
		return miracleDays;
	}
	/**
	 * @param miracleDays the miracleDays to set
	 */
	public void setMiracleDays(long miracleDays) {
		this.miracleDays = miracleDays;
	}
	/**
	 * 
	 */
	public OffsetMDB() {
	}
	
	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return description;
	}
/**
	 * @param description the description to set
	 */
	public void setDescription(List<String> description) {
		this.description = description;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OffsetMiracleDateBean [shipVia=" + shipVia + ", offset=" + offset + ", miracleDays=" + miracleDays
				+ ", description=" + description + ", availabilityStatus=" + availabilityStatus + ", webEnabled="
				+ webEnabled + ", fullSkuId=" + fullSkuId + ", isDropshipSku=" + isDropshipSku + ", totalQty="
				+ totalQty + ", hoppingQty=" + hoppingQty + ", inStockQty=" + inStockQty + ", defaultGrouped="
				+ defaultGrouped + ", skuInDoorOrOutDoor=" + skuInDoorOrOutDoor + ", groupingEligible="
				+ groupingEligible + ", scfOffset=" + scfOffset + ", transitOffset=" + transitOffset + ", scfWh="
				+ scfWh + ", offsetType=" + offsetType + ", calendarOffset=" + calendarOffset + ", itemDeliveryDate="
				+ itemDeliveryDate + ", itemDeliveryDateRange=" + itemDeliveryDateRange
				+ ", itemDeliveryDateRangeNonMetros=" + itemDeliveryDateRangeNonMetros + ", bestETAWH=" + bestETAWH
				+ ", consolidatedWH=" + consolidatedWH + ", cushionOrFrame=" + cushionOrFrame + ", likeItem=" + likeItem
				+ ", mustBeStocked=" + mustBeStocked + ", unGroupable=" + unGroupable + ", spoConsDC=" + spoConsDC
				+ ", spoToDC=" + spoToDC + ", spoToDCOffset=" + spoToDCOffset + "]";
	}

	/**
	 * @param offset
	 * @param miracleDays
	 * @param description
	 * @param availabilityStatus
	 * @param webEnabled
	 */
	public OffsetMDB(long offset, long miracleDays,
			List<String> description, long availabilityStatus,
			boolean webEnabled) {
		super();
		this.offset = offset;
		this.miracleDays = miracleDays;
		this.description = description;
		this.availabilityStatus = availabilityStatus;
		this.webEnabled = webEnabled;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (availabilityStatus ^ (availabilityStatus >>> 32));
		result = prime * result + ((bestETAWH == null) ? 0 : bestETAWH.hashCode());
		result = prime * result + ((calendarOffset == null) ? 0 : calendarOffset.hashCode());
		result = prime * result + ((consolidatedWH == null) ? 0 : consolidatedWH.hashCode());
		result = prime * result + ((cushionOrFrame == null) ? 0 : cushionOrFrame.hashCode());
		result = prime * result + (defaultGrouped ? 1231 : 1237);
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((fullSkuId == null) ? 0 : fullSkuId.hashCode());
		result = prime * result + (groupingEligible ? 1231 : 1237);
		result = prime * result + (int) (hoppingQty ^ (hoppingQty >>> 32));
		result = prime * result + (int) (inStockQty ^ (inStockQty >>> 32));
		result = prime * result + (isDropshipSku ? 1231 : 1237);
		result = prime * result + ((itemDeliveryDate == null) ? 0 : itemDeliveryDate.hashCode());
		result = prime * result + ((itemDeliveryDateRange == null) ? 0 : itemDeliveryDateRange.hashCode());
		result = prime * result
				+ ((itemDeliveryDateRangeNonMetros == null) ? 0 : itemDeliveryDateRangeNonMetros.hashCode());
		result = prime * result + ((likeItem == null) ? 0 : likeItem.hashCode());
		result = prime * result + (int) (miracleDays ^ (miracleDays >>> 32));
		result = prime * result + ((mustBeStocked == null) ? 0 : mustBeStocked.hashCode());
		result = prime * result + (int) (offset ^ (offset >>> 32));
		result = prime * result + ((offsetType == null) ? 0 : offsetType.hashCode());
		result = prime * result + (int) (scfOffset ^ (scfOffset >>> 32));
		result = prime * result + ((scfWh == null) ? 0 : scfWh.hashCode());
		result = prime * result + ((shipVia == null) ? 0 : shipVia.hashCode());
		result = prime * result + ((skuInDoorOrOutDoor == null) ? 0 : skuInDoorOrOutDoor.hashCode());
		result = prime * result + ((spoConsDC == null) ? 0 : spoConsDC.hashCode());
		result = prime * result + ((spoToDC == null) ? 0 : spoToDC.hashCode());
		result = prime * result + (int) (spoToDCOffset ^ (spoToDCOffset >>> 32));
		result = prime * result + (int) (totalQty ^ (totalQty >>> 32));
		result = prime * result + (int) (transitOffset ^ (transitOffset >>> 32));
		result = prime * result + ((unGroupable == null) ? 0 : unGroupable.hashCode());
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
		OffsetMDB other = (OffsetMDB) obj;
		if (availabilityStatus != other.availabilityStatus)
			return false;
		if (bestETAWH == null) {
			if (other.bestETAWH != null)
				return false;
		} else if (!bestETAWH.equals(other.bestETAWH))
			return false;
		if (calendarOffset == null) {
			if (other.calendarOffset != null)
				return false;
		} else if (!calendarOffset.equals(other.calendarOffset))
			return false;
		if (consolidatedWH == null) {
			if (other.consolidatedWH != null)
				return false;
		} else if (!consolidatedWH.equals(other.consolidatedWH))
			return false;
		if (cushionOrFrame == null) {
			if (other.cushionOrFrame != null)
				return false;
		} else if (!cushionOrFrame.equals(other.cushionOrFrame))
			return false;
		if (defaultGrouped != other.defaultGrouped)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (fullSkuId == null) {
			if (other.fullSkuId != null)
				return false;
		} else if (!fullSkuId.equals(other.fullSkuId))
			return false;
		if (groupingEligible != other.groupingEligible)
			return false;
		if (hoppingQty != other.hoppingQty)
			return false;
		if (inStockQty != other.inStockQty)
			return false;
		if (isDropshipSku != other.isDropshipSku)
			return false;
		if (itemDeliveryDate == null) {
			if (other.itemDeliveryDate != null)
				return false;
		} else if (!itemDeliveryDate.equals(other.itemDeliveryDate))
			return false;
		if (itemDeliveryDateRange == null) {
			if (other.itemDeliveryDateRange != null)
				return false;
		} else if (!itemDeliveryDateRange.equals(other.itemDeliveryDateRange))
			return false;
		if (itemDeliveryDateRangeNonMetros == null) {
			if (other.itemDeliveryDateRangeNonMetros != null)
				return false;
		} else if (!itemDeliveryDateRangeNonMetros.equals(other.itemDeliveryDateRangeNonMetros))
			return false;
		if (likeItem == null) {
			if (other.likeItem != null)
				return false;
		} else if (!likeItem.equals(other.likeItem))
			return false;
		if (miracleDays != other.miracleDays)
			return false;
		if (mustBeStocked == null) {
			if (other.mustBeStocked != null)
				return false;
		} else if (!mustBeStocked.equals(other.mustBeStocked))
			return false;
		if (offset != other.offset)
			return false;
		if (offsetType == null) {
			if (other.offsetType != null)
				return false;
		} else if (!offsetType.equals(other.offsetType))
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
		if (skuInDoorOrOutDoor == null) {
			if (other.skuInDoorOrOutDoor != null)
				return false;
		} else if (!skuInDoorOrOutDoor.equals(other.skuInDoorOrOutDoor))
			return false;
		if (spoConsDC == null) {
			if (other.spoConsDC != null)
				return false;
		} else if (!spoConsDC.equals(other.spoConsDC))
			return false;
		if (spoToDC == null) {
			if (other.spoToDC != null)
				return false;
		} else if (!spoToDC.equals(other.spoToDC))
			return false;
		if (spoToDCOffset != other.spoToDCOffset)
			return false;
		if (totalQty != other.totalQty)
			return false;
		if (transitOffset != other.transitOffset)
			return false;
		if (unGroupable == null) {
			if (other.unGroupable != null)
				return false;
		} else if (!unGroupable.equals(other.unGroupable))
			return false;
		if (webEnabled != other.webEnabled)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(OffsetMDB arg0) {
		long compareMiracle =  arg0.getMiracleDays();
		int difference = (int)(this.getMiracleDays()-compareMiracle);
		return difference;
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

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toStringTrim() {
		return "OffsetMiracleDateBean [offset=" + offset + ", miracleDays="
				+ miracleDays + ", availabilityStatus=" + availabilityStatus
				+ ", webEnabled=" + webEnabled + ", itemDeliveryDate=" + itemDeliveryDate
				+ ", bestETAWH=" + bestETAWH + ", consolidatedWH="
				+  consolidatedWH +", offsetType=" + offsetType+", scfWh=" +scfWh+ ", shipVia=" + shipVia + "  fullSkuId  " + fullSkuId
				+" groupingEligible  "+groupingEligible+" defaultGrouped "+defaultGrouped+ "  cushionOrFrame "+cushionOrFrame
				+" skuInDoorOrOutDoor "+skuInDoorOrOutDoor+" scfOffset"+scfOffset
				+" itemDeliveryDateRange  "+itemDeliveryDateRange+ " totalQty="
				+  totalQty + ", hoppingQty=" + hoppingQty+" inStockQty= " + inStockQty+"]";
	}

	/**
	 * @return the offsetType
	 */
	public String getOffsetType() {
		return offsetType;
	}

	/**
	 * @param pOffsetType the offsetType to set
	 */
	public void setOffsetType(String pOffsetType) {
		offsetType = pOffsetType;
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
	 * @return the itemDeliveryDateRange
	 */
	public String getItemDeliveryDateRange() {
		return itemDeliveryDateRange;
	}

	/**
	 * @param itemDeliveryDateRange the itemDeliveryDateRange to set
	 */
	public void setItemDeliveryDateRange(String itemDeliveryDateRange) {
		this.itemDeliveryDateRange = itemDeliveryDateRange;
	}

	/**
	 * @return the cushionOrFrame
	 */
	public String getCushionOrFrame() {
		return cushionOrFrame;
	}

	/**
	 * @param cushionOrFrame the cushionOrFrame to set
	 */
	public void setCushionOrFrame(String cushionOrFrame) {
		this.cushionOrFrame = cushionOrFrame;
	}

	/**
	 * @return the fullSkuId
	 */
	public String getFullSkuId() {
		return fullSkuId;
	}

	/**
	 * @param fullSkuId the fullSkuId to set
	 */
	public void setFullSkuId(String fullSkuId) {
		this.fullSkuId = fullSkuId;
	}

	/**
	 * @return the itemDeliveryDateRangeNonMetros
	 */
	public String getItemDeliveryDateRangeNonMetros() {
		return itemDeliveryDateRangeNonMetros;
	}

	/**
	 * @param itemDeliveryDateRangeNonMetros the itemDeliveryDateRangeNonMetros to set
	 */
	public void setItemDeliveryDateRangeNonMetros(String itemDeliveryDateRangeNonMetros) {
		this.itemDeliveryDateRangeNonMetros = itemDeliveryDateRangeNonMetros;
	}

	/**
	 * @return the isDropshipSku
	 */
	public boolean isDropshipSku() {
		return isDropshipSku;
	}

	/**
	 * @param isDropshipSku the isDropshipSku to set
	 */
	public void setDropshipSku(boolean isDropshipSku) {
		this.isDropshipSku = isDropshipSku;
	}

	/**
	 * @param totalQty the totalQty to set
	 */
	public void setTotalQty(long totalQty) {
		this.totalQty = totalQty;
	}

	/**
	 * @param hoppingQty the hoppingQty to set
	 */
	public void setHoppingQty(long hoppingQty) {
		this.hoppingQty = hoppingQty;
	}

	/**
	 * @return the totalQty
	 */
	public long getTotalQty() {
		return totalQty;
	}

	/**
	 * @return the hoppingQty
	 */
	public long getHoppingQty() {
		return hoppingQty;
	}

	/**
	 * @return the inStockQty
	 */
	public long getInStockQty() {
		return inStockQty;
	}

	/**
	 * @param inStockQty the inStockQty to set
	 */
	public void setInStockQty(long inStockQty) {
		this.inStockQty = inStockQty;
	}

	/**
	 * @return the likeItem
	 */
	public String getLikeItem() {
		return likeItem;
	}

	/**
	 * @param likeItem the likeItem to set
	 */
	public void setLikeItem(String likeItem) {
		this.likeItem = likeItem;
	}

	/**
	 * @return the mustBeStocked
	 */
	public String getMustBeStocked() {
		return mustBeStocked;
	}

	/**
	 * @param mustBeStocked the mustBeStocked to set
	 */
	public void setMustBeStocked(String mustBeStocked) {
		this.mustBeStocked = mustBeStocked;
	}

	/**
	 * @return the unGroupable
	 */
	public String getUnGroupable() {
		return unGroupable;
	}

	/**
	 * @param unGroupable the unGroupable to set
	 */
	public void setUnGroupable(String unGroupable) {
		this.unGroupable = unGroupable;
	}

	/**
	 * @return the spoConsDC
	 */
	public String getSpoConsDC() {
		return spoConsDC;
	}

	/**
	 * @param spoConsDC the spoConsDC to set
	 */
	public void setSpoConsDC(String spoConsDC) {
		this.spoConsDC = spoConsDC;
	}

	/**
	 * @return the spoToDC
	 */
	public String getSpoToDC() {
		return spoToDC;
	}

	/**
	 * @param spoToDC the spoToDC to set
	 */
	public void setSpoToDC(String spoToDC) {
		this.spoToDC = spoToDC;
	}

	/**
	 * @return the spoToDCOffset
	 */
	public long getSpoToDCOffset() {
		return spoToDCOffset;
	}

	/**
	 * @param spoToDCOffset the spoToDCOffset to set
	 */
	public void setSpoToDCOffset(long spoToDCOffset) {
		this.spoToDCOffset = spoToDCOffset;
	}



	


}