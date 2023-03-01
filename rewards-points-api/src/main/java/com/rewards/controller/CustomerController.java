/**
 * 
 */
package com.rewards.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.model.Customer;
import com.rewards.service.CustomerService;
/**
 * @author User
 *This class is to map the request to get the customer details
 */
@RestController("api")
public class CustomerController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService customerService;
	
	/**
	 * Get Customer by passing an Id
	 * @param id
	 * @return
	 */
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		LOGGER.info("getCustomer with ID: STARTED");
		Customer customer = customerService.getCustomerById(id);
		if (customer == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		LOGGER.info("getCustomer with ID: ENDED");
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	/**
	 * Get all the Customers
	 * @return
	 */
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getCustomer() {
		LOGGER.info("getCustomer : STARTED");
		List<Customer> customer = customerService.getAllCustomers();
		LOGGER.info("getCustomer : ENDED");
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}


}
