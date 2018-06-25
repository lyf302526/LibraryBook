package model;

import java.time.LocalDateTime;

public class Loan {
	private String Id;
	private java.time.LocalDateTime LoanDate;
	private java.time.LocalDateTime DateForReturn;
	private java.time.LocalDateTime ReturnDate;
	public final String getId() {
		return Id;
	}
	public final void setId(String id) {
		Id = id;
	}
	public final java.time.LocalDateTime getLoanDate() {
		return LoanDate;
	}
	public final void setLoanDate(java.time.LocalDateTime loanDate) {
		LoanDate = loanDate;
	}
	public final java.time.LocalDateTime getDateForReturn() {
		return DateForReturn;
	}
	public final void setDateForReturn(java.time.LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public final java.time.LocalDateTime getReturnDate() {
		return ReturnDate;
	}
	public final void setReturnDate(java.time.LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}
	public final Book getBook() {
		return Book;
	}
	public final void setBook(Book book) {
		Book = book;
	}
	public final Member getMember() {
		return Member;
	}
	public final void setMember(Member member) {
		Member = member;
	}
	private Book Book;
	private Member Member;
	
	public boolean HasNotBeenReturned(){
		return ReturnDate==null;
	}
	public void MarkAsReturned() {
		ReturnDate=LocalDateTime.now();
	}
}
