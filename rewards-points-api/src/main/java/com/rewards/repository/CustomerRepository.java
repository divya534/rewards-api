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
 *This class is to invoke the entity class to pull the data
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
