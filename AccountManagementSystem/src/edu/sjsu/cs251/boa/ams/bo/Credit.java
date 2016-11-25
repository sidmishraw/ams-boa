/**
 * 
 */
package edu.sjsu.cs251.boa.ams.bo;

import java.io.Serializable;

import edu.sjsu.cs251.boa.ams.utils.Money;

/**
 * @author sidmishraw
 *
 */
public class Credit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Money amount;
	private Account accountCredited;

	/**
	 * 
	 */
	public Credit() {}

	/**
	 * @param amount
	 * @param accountCredited
	 */
	public Credit(Money amount, Account accountCredited) {
		super();
		this.amount = amount;
		this.accountCredited = accountCredited;
	}

	/**
	 * @return the amount
	 */
	public Money getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}

	/**
	 * @return the accountCredited
	 */
	public Account getAccountCredited() {
		return accountCredited;
	}

	/**
	 * @param accountCredited the accountCredited to set
	 */
	public void setAccountCredited(Account accountCredited) {
		this.accountCredited = accountCredited;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountCredited == null) ? 0 : accountCredited.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Credit)) {
			return false;
		}
		Credit other = (Credit) obj;
		if (accountCredited == null) {
			if (other.accountCredited != null) {
				return false;
			}
		} else if (!accountCredited.equals(other.accountCredited)) {
			return false;
		}
		if (amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Credit [amount=");
		builder.append(amount);
		builder.append(", accountCredited=");
		builder.append(accountCredited);
		builder.append("]");
		return builder.toString();
	}
}
