package com.example.springboot.hibernate.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.springboot.hibernate.dao.CustomerDao;
import com.example.springboot.hibernate.entity.Customer;
import com.example.springboot.hibernate.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;
	
	@Override
	public void deleteByDisabled(Integer disabled) throws Exception {
		customerDao.deleteByDisabled(disabled);
	}

	@Override
	public List<Customer> findByDisabledAndName(Integer disabled, String name) throws Exception {
		return customerDao.findByDisabledAndName(disabled, name);
	}

	@Override
	public List<Customer> findByMobile(String mobile) throws Exception {
		return customerDao.findByMobile(mobile);
	}

	@Override
	public Customer findByCode(String code) throws Exception {
		return customerDao.findByCode(code);
	}

	@Override
	public List<Customer> findByName(String name) throws Exception {
		return customerDao.findByName(name);
	}

	@Override
	public List<Customer> findByNameLike(String name) throws Exception {
		return customerDao.findByNameLike(name);
	}

	@Override
	public List<Customer> findByNameOrCodeStartingWith(String name, String code) throws Exception {
		return customerDao.findByNameOrCodeStartingWith(name, code);
	}

	@Override
	public List<Customer> findByNameIgnoreCase(String name) throws Exception {
		return customerDao.findByNameIgnoreCase(name);
	}

	@Override
	public List<Customer> findByNameOrderByIdDesc(String name) throws Exception {
		return customerDao.findByNameOrderByIdDesc(name);
	}

	@Override
	public Page<Customer> findAll(Pageable pageable) throws Exception{
		return customerDao.findAll(pageable);
	}
	
	@Transactional(rollbackOn=Exception.class)
	@Override
	public void insertAll(List<Customer> list) throws Exception {
		for (Customer customer : list) {
			customerDao.save(customer);
		}
//		customerDao.saveAll(list);
	}

}
