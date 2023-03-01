/**
 * 
 */
package com.rewards.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rewards.model.Customer;
import com.rewards.repository.CustomerRepository;

/**
 * @author User
 *
 *This is an service class to call the repository calls
 */
@Service
public class CustomerService {
	private static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	/**
	 * Call the Repository method to get all the customers
	 * @return
	 */
	public List<Customer> getAllCustomers() {
		LOGGER.info("getAllCustomers : STARTED");
		return customerRepository.findAll();
	}

	/**
	 * Call the repository method by passing an ID to get the customer details
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(Integer id) {
		LOGGER.info("getCustomerById : STARTED");
		return customerRepository.findById(id).orElse(null);
	}

}
