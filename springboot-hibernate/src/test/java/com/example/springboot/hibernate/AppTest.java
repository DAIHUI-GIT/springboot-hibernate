package com.example.springboot.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.springboot.hibernate.entity.Customer;
import com.example.springboot.hibernate.service.impl.CustomerServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:application.properties"})
@SpringBootTest
public class AppTest {
	
	@Autowired
	CustomerServiceImpl service;
	
	@Test
	public void insertAll() throws Exception {
		List<Customer> data = new ArrayList<Customer>(2);
		data.add(new Customer(263, "CU219", "客户219", "", "21", "", "", "", "", 0));
		data.add(new Customer(0, "CU217", "客户217", "", "21", "", "", "", "", 0));
		data.add(null);
		data.add(new Customer(261, "CU217", "客户217", "", "21", "", "", "", "", 0));
		try {
			service.insertAll(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void deleteByDisabled() throws Exception {
		service.deleteByDisabled(1);
	}
	
	@Test
	public void findByDisabledAndName() throws Exception {
		Integer disabled = 0;
		String name = "客户10";
		List<Customer> data = service.findByDisabledAndName(disabled,name);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
	@Test
	public void findByMobile() throws Exception {
		String mobile = "1234567";
		List<Customer> data = service.findByMobile(mobile);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
	@Test
	public void findByCode() throws Exception {
		String code = "CU001";
		Customer customer = service.findByCode(code);
		System.out.println(customer.toString());
	}

	@Test
	public void findByName() throws Exception {
		String name = "客户1";
		List<Customer> data = service.findByName(name);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
	@Test
	public void findByNameLike() throws Exception {
		String name = "客户10";
		List<Customer> data = service.findByNameLike(name);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
	@Test
	public void findByNameOrCodeStartingWith() throws Exception {
		String name = "客户10";
		String code = "CU00";
		List<Customer> data = service.findByNameOrCodeStartingWith(name,code);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
	@Test
	public void findByNameIgnoreCase() throws Exception {
		String name = "客户10";
		List<Customer> data = service.findByNameIgnoreCase(name);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
	@Test
	public void findByNameOrderByIdDesc() throws Exception {
		String name = "客户10";
		List<Customer> data = service.findByNameOrderByIdDesc(name);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
	@Test
	public void findAll() throws Exception {
		int page=1,size=15;
		Sort sort = new Sort(Direction.DESC, "id");
		Pageable pageable = PageRequest.of(page, size, sort);
		Page<Customer> data = service.findAll(pageable);
		for (Customer customer : data) {
			System.out.println(customer.toString());
		}
	}
	
}
