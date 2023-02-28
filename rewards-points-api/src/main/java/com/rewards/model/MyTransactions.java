/**
 * 
 */
package com.rewards.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author User
 *
 */
@Getter
@Setter
@Entity
@Table(name = "transaction")
public class MyTransactions extends MyRewards {

	@Id
	@GeneratedValue
	private Integer id;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "total_Amt")
	private Double totalAmount;
	
	@Column(name = "purchase_desc")
	private String purchaseDescription;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trans_date")
	private Date transactionDate;
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
	
	@Override
	public Long getPoints() {
		this.points = 0l;
		
		if (this.totalAmount > 50 && this.totalAmount <= 100) {
			this.points += (this.totalAmount.intValue() - 50) * 1;
			
		} 
		
		if (this.totalAmount > 100) {
			this.points += 50;  
			this.points += (this.totalAmount.intValue() - 100) * 2;  
		}
		
		return this.points;
	}
}
