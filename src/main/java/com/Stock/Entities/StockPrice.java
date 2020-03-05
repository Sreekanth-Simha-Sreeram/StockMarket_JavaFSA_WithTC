package com.Stock.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.DateTimeSyntax;

@Entity
@Table(name="StockPrice")
public class StockPrice 
{
	@Id
	@Column(name="companyCode")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int companyCode;
	
	@Column(name="stockCurrentPrice")
	int stockCurrentPrice;
	
	@Column(name="stockDate")
	Date stockDate;
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockCurrentPrice() {
		return stockCurrentPrice;
	}
	public void setStockCurrentPrice(int stockCurrentPrice) {
		this.stockCurrentPrice = stockCurrentPrice;
	}
	public Date getStockDate() {
		return stockDate;
	}
	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}
	

}
