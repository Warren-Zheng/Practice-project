package com.zxh.service;

import java.util.List;

import com.zxh.pojo.BaseDict;
import com.zxh.pojo.Customer;
import com.zxh.pojo.QueryVo;

public interface CustomerService {

	public List<BaseDict> findDictByCode(String code);
	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateById(Customer customer);
	
	public void deleteById(Long id);
}
