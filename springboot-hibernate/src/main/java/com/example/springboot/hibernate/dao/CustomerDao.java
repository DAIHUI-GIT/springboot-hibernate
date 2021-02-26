package com.example.springboot.hibernate.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.hibernate.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	/**
	 * 删除指定id的记录
	 * @Transactional 事务支持
	 * @Modifying 涉及增删改时添加
	 * @param id
	 */
	@Transactional
	@Modifying
	void deleteByDisabled(Integer disabled) ;
	/**
	 * 根据disabled查询数据
	 * @Transactional 事务支持
	 * @Query 自定义HQL查询
	 * @param disabled
	 * @param name
	 * @return
	 */
	@Transactional(timeout = 1000)
	@Query("from Customer where disabled = ?1 and name = ?2")//这是HQL写法，其中‘?1’代表第1个参数
	List<Customer> findByDisabledAndName(Integer disabled,String name) ;
	/**
	 * 根据mobile查询数据
	 * @Transactional 事务支持
	 * @Query 自定义HQL查询
	 * @param mobile
	 * @return
	 */
	@Transactional(timeout = 1000)
	@Query("from Customer where mobile =:mobile")//这是HQL写法，其中‘:mobile’代表指定参数名mobile
	List<Customer> findByMobile(String mobile) ;
	
	/**
	 * 根据code查询数据
	 * 		select * from customer where code = ?
	 * @param code
	 * @return
	 */
	Customer findByCode(String code) ;
	
	/**
	 * 根据name查询数据
	 * 		select * from customer where name = ?
	 * @param name
	 * @return
	 */
	@Query(value = "select * from customer where name = ?",nativeQuery=true)//nativeQuery表示用原生SQL查询
	List<Customer> findByName(@Param("name") String name) ;
	
	/**
	 * 根据name模糊查询数据
	 * 		select * from customer where name like ?
	 * @param name
	 * @return
	 */
	List<Customer> findByNameLike(String name) ;
	
	/**
	 * 根据name模糊查询数据
	 * 		select * from customer where name = ? or code = ?
	 * @param name
	 * @param code
	 * @return
	 */
	List<Customer> findByNameOrCodeStartingWith(String name,String code) ;
	
	/**
	 * 根据name模糊查询（忽略大小写）数据
	 * 		select * from customer where name = ? 
	 * @param name
	 * @return
	 */
	List<Customer> findByNameIgnoreCase(String name) ;
	
	/**
	 * 根据name模糊查询并且根据id排序查询数据
	 * 		select * from customer where name = ? order by id desc 
	 * @param name
	 * @return
	 */
	List<Customer> findByNameOrderByIdDesc(String name) ;
	
	/**
	 * 分页查询所有数据
	 * @param pageable 分页工具类，使用方法：
	 *  	int page=1,int size=10;
	 *  	Sort sort = new Sort(Direction.DESC, "id");
	 *  	Pageable pageable = new PageRequest(page, size, sort);
	 * @return
	 */
	Page<Customer> findAll(Pageable pageable) ;
	
}
