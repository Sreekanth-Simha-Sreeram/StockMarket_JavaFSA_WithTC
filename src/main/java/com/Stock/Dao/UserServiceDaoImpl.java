package com.Stock.Dao;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Stock.Entities.Chart;
import com.Stock.Entities.Company;
import com.Stock.Entities.User;

@Component
@Repository ("userServiceDao")

public class UserServiceDaoImpl implements UserServiceDao {

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public User updateProfile(int userID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Company> searchCompany(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Company> filterCompany(String companyName, String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Chart GetChart(Company company, String stockExchange, Date fromTime, Date toTime) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Company> DisplayChart(List<Color> color) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean ExportDataFromChart(Chart chart) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	

}
