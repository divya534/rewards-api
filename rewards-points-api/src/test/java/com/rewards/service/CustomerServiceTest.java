/**
 * 
 */
package com.rewards.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rewards.model.Customer;
import com.rewards.repository.CustomerRepository;

/**
 * @author User
 *
 */

@SpringBootTest
public class CustomerServiceTest {
	
	@Autowired
	private CustomerService customerService;
	
	@Mock
	private CustomerRepository customerRepository;
	
	@Test
	public void getCustomerAll_NotEmpty() {
		List<Customer> customerData = new ArrayList<>();
		Customer customer = new Customer();
		customerData.add(customer);
		Mockito.when(customerRepository.findAll()).thenReturn(customerData);
		List<Customer> results = customerService.getCustomerAll();
		assertTrue(!results.isEmpty());
	}
	
	@Test
	public void getCustomerById_NotEmpty() {
		Customer customer = customerService.getCustomerById(1000);
		assertTrue(null != customer);
	}

}
