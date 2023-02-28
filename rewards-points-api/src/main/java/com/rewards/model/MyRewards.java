/**
 * 
 */
package com.rewards.model;

import lombok.Setter;

/**
 * @author User
 *
 */

@Setter
public abstract class MyRewards {
	
	protected Long points;
	
	protected Long getPoints() {
		return points;
	}

}
