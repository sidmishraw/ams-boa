package edu.sjsu.cs251.boa.ams.constants;

import java.io.Serializable;

/**
 * 
 * @author sidmishraw
 *
 */
public enum AccountType implements Serializable {

	ASSET,
	LIABILITY,
	STOCKHOLDERS_EQUITY,
	OPERATING_REVENUE,
	OPERATING_EXPENSE,
	NON_OPERATING_REVENUE,
	NON_OPERATING_EXPENSE,
	GAIN,
	LOSS;
}
