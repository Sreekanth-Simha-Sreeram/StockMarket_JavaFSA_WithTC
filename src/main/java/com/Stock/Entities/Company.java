package com.Stock.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Company")
public class Company 
{
	
	@Id
	@Column(name="companyId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int companyId;
	
	@Column(name="companyName")
	String companyName;
	
	@Column(name="companyTurnover")
	int companyTurnover;
	
	@Column(name="companyCEO")
	String companyCEO;
	
	@Column(name="companyBoardOfDirectors")
	String companyBoardOfDirectors;
	
	@Column(name="companySector")
	String companySector;
	
	@Column(name="companyBriefWriteUp")
	String companyBriefWriteUp;
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getCompanyTurnover() {
		return companyTurnover;
	}
	public void setCompanyTurnover(int companyTurnover) {
		this.companyTurnover = companyTurnover;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public String getCompanyBoardOfDirectors() {
		return companyBoardOfDirectors;
	}
	public void setCompanyBoardOfDirectors(String companyBoardOfDirectors) {
		this.companyBoardOfDirectors = companyBoardOfDirectors;
	}
	public String getCompanySector() {
		return companySector;
	}
	public void setCompanySector(String companySector) {
		this.companySector = companySector;
	}
	public String getCompanyBriefWriteUp() {
		return companyBriefWriteUp;
	}
	public void setCompanyBriefWriteUp(String companyBriefWriteUp) {
		this.companyBriefWriteUp = companyBriefWriteUp;
	}
	
	
	
}