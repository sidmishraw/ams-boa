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
public class Debit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Money amount;
	private Account accountDebited;

	/**
	 * 
	 */
	public Debit() {}
	
	/**
	 * @param amount
	 * @param accountDebited
	 */
	public Debit(Money amount, Account accountDebited) {
		super();
		this.amount = amount;
		this.accountDebited = accountDebited;
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
	 * @return the accountDebited
	 */
	public Account getAccountDebited() {
		return accountDebited;
	}

	/**
	 * @param accountDebited the accountDebited to set
	 */
	public void setAccountDebited(Account accountDebited) {
		this.accountDebited = accountDebited;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountDebited == null) ? 0 : accountDebited.hashCode());
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
		if (!(obj instanceof Debit)) {
			return false;
		}
		Debit other = (Debit) obj;
		if (accountDebited == null) {
			if (other.accountDebited != null) {
				return false;
			}
		} else if (!accountDebited.equals(other.accountDebited)) {
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
		builder.append("Debit [amount=");
		builder.append(amount);
		builder.append(", accountDebited=");
		builder.append(accountDebited);
		builder.append("]");
		return builder.toString();
	}
}
