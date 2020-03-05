package com.Stock.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IPODetails")
public class IPODetails 
{
	
	@Id
	@Column(name="ipoId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ipoId;
	
	@Column(name="ipocompanyName")
	String ipocompanyName;
	
	@Column(name="ipoPricePerShare")
	int ipoPricePerShare;
	
	@Column(name="ipoTotalNumberOfShares")
	int ipoTotalNumberOfShares;
	
	
	public int getIpoId() {
		return ipoId;
	}
	public void setIpoId(int ipoId) {
		this.ipoId = ipoId;
	}
	public String getIpocompanyName() {
		return ipocompanyName;
	}
	public void setIpocompanyName(String ipocompanyName) {
		this.ipocompanyName = ipocompanyName;
	}
	public int getIpoPricePerShare() {
		return ipoPricePerShare;
	}
	public void setIpoPricePerShare(int ipoPricePerShare) {
		this.ipoPricePerShare = ipoPricePerShare;
	}
	public int getIpoTotalNumberOfShares() {
		return ipoTotalNumberOfShares;
	}
	public void setIpoTotalNumberOfShares(int ipoTotalNumberOfShares) {
		this.ipoTotalNumberOfShares = ipoTotalNumberOfShares;
	}

	
}
