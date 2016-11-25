/**
 * 
 */
package edu.sjsu.cs251.boa.ams.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import edu.sjsu.cs251.boa.ams.exceptions.IntegrityFailureException;

/**
 * @author sidmishraw
 *
 */
public class JournalEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String entryId;
	private long timestamp 		= 0L;
	private Set<Debit> debits 	= null;
	private Set<Credit> credits = null;

	/**
	 * 
	 */
	public JournalEntry() {}

	/**
	 * @param timestamp
	 * @param debits
	 * @param credits
	 */
	public JournalEntry(long timestamp, Set<Debit> debits, Set<Credit> credits) throws IntegrityFailureException {

		super();

		boolean integrity = false;

		// if the check throws, it will prevent the construction of 
		// object.
		integrity = verifyIntegrity(debits, credits);

		if (integrity) {

			this.timestamp = timestamp;
			this.debits = debits;
			this.credits = credits;
		}
	}

	/**
	 * Returns true iff sum of debits = sum of credits in the journal entry, else throws an Exception.
	 * @param debits
	 * @param credits
	 * @return boolean
	 * @throws IntegrityFailureException
	 */
	private boolean verifyIntegrity(Set<Debit> debits, Set<Credit> credits) throws IntegrityFailureException {

		BigDecimal sumDebits  = new BigDecimal(0);
		BigDecimal sumCredits = new BigDecimal(0);

		for ( Debit db : debits ) {

			sumDebits = sumDebits.add(db.getAmount().getAmount());
		}

		for ( Credit cr : credits ) {

			sumCredits = sumCredits.add(cr.getAmount().getAmount());
		}

		if ( sumDebits.equals(sumCredits) ) {

			return true;
		} else {

			throw new IntegrityFailureException("Credits and Debits of the Journal "
					+ "Entry don't match, can't make the entry. Retry!");
		}
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the entryId
	 */
	public String getEntryId() {
		return entryId;
	}

	/**
	 * @return the timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the debits
	 */
	public Set<Debit> getDebits() {
		return debits;
	}

	/**
	 * @return the credits
	 */
	public Set<Credit> getCredits() {
		return credits;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		result = prime * result + ((debits == null) ? 0 : debits.hashCode());
		result = prime * result + ((entryId == null) ? 0 : entryId.hashCode());
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
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
		if (!(obj instanceof JournalEntry)) {
			return false;
		}
		JournalEntry other = (JournalEntry) obj;
		if (credits == null) {
			if (other.credits != null) {
				return false;
			}
		} else if (!credits.equals(other.credits)) {
			return false;
		}
		if (debits == null) {
			if (other.debits != null) {
				return false;
			}
		} else if (!debits.equals(other.debits)) {
			return false;
		}
		if (entryId == null) {
			if (other.entryId != null) {
				return false;
			}
		} else if (!entryId.equals(other.entryId)) {
			return false;
		}
		if (timestamp != other.timestamp) {
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
		builder.append("JournalEntry [entryId=");
		builder.append(entryId);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", debits=");
		builder.append(debits);
		builder.append(", credits=");
		builder.append(credits);
		builder.append("]");
		return builder.toString();
	}
}
