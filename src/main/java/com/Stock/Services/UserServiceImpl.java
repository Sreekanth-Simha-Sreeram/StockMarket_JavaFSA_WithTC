package com.Stock.Services;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Stock.Dao.UserServiceDao;
import com.Stock.Entities.Chart;
import com.Stock.Entities.Company;
import com.Stock.Entities.User;


@Component
@Service ("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserServiceDao userServiceDao;
	@Transactional

	public User updateProfile(int userID) {
		return null;
		// TODO Auto-generated method stub

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
