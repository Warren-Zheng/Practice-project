package com.zxh.dao;

import java.util.List;

import com.zxh.pojo.Customer;
import com.zxh.pojo.QueryVo;

public interface CustomerMapper {

	//高级查询并分页显示
	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	//通过ID查找客户
	public Customer findCustomerById(Long id);
	//通过ID修改客户
	public void updateById(Customer customer);
	//通过ID删除客户
	public void deleteById(Long id);
}
