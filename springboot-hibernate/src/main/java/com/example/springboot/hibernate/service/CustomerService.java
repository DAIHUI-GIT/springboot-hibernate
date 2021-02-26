package com.example.springboot.hibernate.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.springboot.hibernate.entity.Customer;

public interface CustomerService {
	
	/**
	 * 批量添加
	 * @param list
	 * @throws Exception
	 */
	void insertAll(List<Customer> list) throws Exception;
	
	/**
	 * 删除指定id的记录
	 * @param id
	 */
	void deleteByDisabled(Integer id) throws Exception;
	/**
	 * 根据disabled查询数据
	 * @param disabled
	 * @param name
	 * @return
	 */
	List<Customer> findByDisabledAndName(Integer disabled,String name) throws Exception;
	/**
	 * 根据mobile查询数据
	 * @param mobile
	 * @return
	 */
	List<Customer> findByMobile(String mobile) throws Exception;
	
	/**
	 * 根据code查询数据
	 * @param code
	 * @return
	 */
	Customer findByCode(String code) throws Exception;
	
	/**
	 * 根据name查询数据
	 * @param name
	 * @return
	 */
	List<Customer> findByName(String name) throws Exception;
	
	/**
	 * 根据name模糊查询数据
	 * @param name
	 * @return
	 */
	List<Customer> findByNameLike(String name) throws Exception;
	
	/**
	 * 根据name模糊查询数据
	 * @param name
	 * @param code
	 * @return
	 */
	List<Customer> findByNameOrCodeStartingWith(String name,String code) throws Exception;
	
	/**
	 * 根据name模糊查询（忽略大小写）数据
	 * @param name
	 * @return
	 */
	List<Customer> findByNameIgnoreCase(String name) throws Exception;
	
	/**
	 * 根据name模糊查询并且根据id排序查询数据
	 * @param name
	 * @return
	 */
	List<Customer> findByNameOrderByIdDesc(String name) throws Exception;
	
	/**
	 * 分页查询所有数据
	 * @param pageable 分页工具类，使用方法：
	 *  	int page=1,int size=10;
	 *  	Sort sort = new Sort(Direction.DESC, "id");
	 *  	Pageable pageable = new PageRequest(page, size, sort);
	 * @return
	 */
	Page<Customer> findAll(Pageable pageable) throws Exception;
	
}
