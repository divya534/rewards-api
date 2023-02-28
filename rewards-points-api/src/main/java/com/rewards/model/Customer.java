/**
 * 
 */
package com.rewards.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

/**
 * @author User
 *
 */
@Getter
@Setter
@Entity
@Table(name ="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "customer_id")
	private Integer customerId;
	@Column(name = "customer_name")
	private String customerName;
	
	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<MyTransactions> transactions;
	
	@JsonInclude
	@Transient
	private Long rewardPoints;
	@JsonInclude
	@Transient
	private Double totalPurchases;
	
	
	public Long getRewardPoints() {
		if (transactions == null || transactions.isEmpty()) return 0l;
		
		return transactions.stream().map(x -> x.getPoints().intValue()).reduce(0, (a,b) -> a + b).longValue();
	}
	public Double getTotalPurchases() {
		if (transactions == null || transactions.isEmpty()) return 0d;
		
		return transactions.stream().map(x -> x.getTotalAmount().doubleValue()).reduce(0d, (a,b) -> a + b).doubleValue();
	}

}
