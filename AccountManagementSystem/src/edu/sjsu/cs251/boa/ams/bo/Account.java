/**
 * 
 */
package edu.sjsu.cs251.boa.ams.bo;

import java.io.Serializable;

import edu.sjsu.cs251.boa.ams.constants.AccountType;
import edu.sjsu.cs251.boa.ams.utils.Money;

/**
 * @author sidmishraw
 *
 */
public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String accountId;
	private String accountName;
	private AccountType accountType;
	private Money accountBalance;

	/**
	 * 
	 */
	public Account() {}

	/**
	 * @param accountName
	 * @param accountType
	 * @param accountBalance
	 */
	public Account(String accountName, AccountType accountType, Money accountBalance) {
		super();
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the accountType
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the accountBalance
	 */
	public Money getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(Money accountBalance) {
		this.accountBalance = accountBalance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountBalance == null) ? 0 : accountBalance.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
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
		if (!(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		if (accountBalance == null) {
			if (other.accountBalance != null) {
				return false;
			}
		} else if (!accountBalance.equals(other.accountBalance)) {
			return false;
		}
		if (accountId == null) {
			if (other.accountId != null) {
				return false;
			}
		} else if (!accountId.equals(other.accountId)) {
			return false;
		}
		if (accountName == null) {
			if (other.accountName != null) {
				return false;
			}
		} else if (!accountName.equals(other.accountName)) {
			return false;
		}
		if (accountType != other.accountType) {
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
		builder.append("Account [accountId=");
		builder.append(accountId);
		builder.append(", accountName=");
		builder.append(accountName);
		builder.append(", accountType=");
		builder.append(accountType);
		builder.append(", accountBalance=");
		builder.append(accountBalance);
		builder.append("]");
		return builder.toString();
	}
}
