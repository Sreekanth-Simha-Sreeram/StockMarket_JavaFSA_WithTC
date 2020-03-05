package com.Stock.Services;
import com.Stock.Entities.Company;
import com.Stock.Entities.IPODetails;

import java.util.List;
public interface AdminService
{	
	public void createCompany(Company company );
	public boolean deleteCompany(int companyId);
	public Company editCompany(String companyName,int companyId);
	public Company getCompany(String companyName,int companyId);
	public List<Company> viewCompany(Company company);
	Company findCompany(int companyId);
	IPODetails updateIPODetails(int ipoId);
	
}