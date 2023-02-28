/**
 * 
 */
package com.rewards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rewards.model.Customer;
import com.rewards.repository.CustomerRepository;

/**
 * @author User
 *
 */
@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getCustomerAll() {
		return customerRepository.findAll();
	}


	public Customer getCustomerById(Integer id) {
		return customerRepository.findById(id).orElse(null);
	}

}
