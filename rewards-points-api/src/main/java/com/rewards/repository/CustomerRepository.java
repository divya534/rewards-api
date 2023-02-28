/**
 * 
 */
package com.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rewards.model.Customer;
/**
 * @author User
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
