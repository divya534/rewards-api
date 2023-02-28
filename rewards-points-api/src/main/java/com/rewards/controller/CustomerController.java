/**
 * 
 */
package com.rewards.controller;
import java.util.List;

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
 *
 */
@RestController("api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = customerService.getCustomerById(id);
		if (customer == null)
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getCustomer() {
		List<Customer> customer = customerService.getCustomerAll();
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}


}
