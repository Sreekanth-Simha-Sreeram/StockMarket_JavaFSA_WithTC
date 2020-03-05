package com.Stock.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StockExchange")
public class StockExchange {
	@Id
	@Column(name="stockExchangeId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  int stockExchangeId;
	
	@Column(name="stockExchange")
      String stockExchange;
	
	@Column(name="contactAdress")
      String contactAdress;
	
	@Column(name="brief")
      String brief;
	
	@Column(name="remarks")
      String remarks;
	
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getContactAdress() {
		return contactAdress;
	}
	public void setContactAdress(String contactAdress) {
		this.contactAdress = contactAdress;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
      
      

}
