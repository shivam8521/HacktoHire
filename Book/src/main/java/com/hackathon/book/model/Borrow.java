package com.hackathon.book.model;

import java.util.Date;

public class Borrow {
	
		private long borrowId;

	
		private long borrowerId;

	
		private long bookId;

		private String names;
		
		
		/**
		 * @return the names
		 */
		public String getNames() {
			return names;
		}

		/**
		 * @param names the names to set
		 */
		public void setNames(String names) {
			this.names = names;
		}

		private Date borrowedDate;

		private Date returnedDate;

		public long getBorrowId() {
			return borrowId;
		}

		public long getBorrowerId() {
			return borrowerId;
		}

		public long getBookId() {
			return bookId;
		}

		public Date getBorrowedDate() {
			return borrowedDate;
		}

		public Date getReturnedDate() {
			return returnedDate;
		}

		public void setReturnedDate(Date returnedDate) {
			this.returnedDate = returnedDate;
		}

}
