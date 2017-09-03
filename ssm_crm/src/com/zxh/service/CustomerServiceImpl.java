package com.zxh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.dao.CustomerMapper;
import com.zxh.dao.DictMapper;
import com.zxh.pojo.BaseDict;
import com.zxh.pojo.Customer;
import com.zxh.pojo.QueryVo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private DictMapper dictMapper;
	@Autowired
	private CustomerMapper customerMapper;
	
	public List<BaseDict> findDictByCode(String code) {
		List<BaseDict> list = dictMapper.findDictByCode(code);
		return list;
	}
	
	public List<Customer> findCustomerByVo(QueryVo vo){
		
		List<Customer> list = customerMapper.findCustomerByVo(vo);
		return list;
	}

	public Integer findCustomerByVoCount(QueryVo vo) {
		Integer count = customerMapper.findCustomerByVoCount(vo);
		return count;
	}

	public Customer findCustomerById(Long id) {
		Customer customer = customerMapper.findCustomerById(id);
		return customer;
	}

	public void updateById(Customer customer) {
		customerMapper.updateById(customer);
	}

	public void deleteById(Long id) {
		customerMapper.deleteById(id);
	}

}
