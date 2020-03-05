package com.Stock.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Stock.Entities.Company;
import com.Stock.Entities.IPODetails;

@Component
@Repository ("adminServiceDao")

public class AdminServiceDaoImpl implements AdminServiceDao {
	
	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public void createCompany(Company company) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public boolean deleteCompany(int companyId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Company editCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Company getCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Company> viewCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Company findCompany(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public IPODetails updateIPODetails(int ipoId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
}
