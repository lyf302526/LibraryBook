package model;

public class Book {
	private String Id;
	private String ISBN;
	private String Title;
	private Member LoanTo;
	
	
	public Book(String Id, String ISBN, String Title) {
		// TODO Auto-generated constructor stub
		this.Id=Id;
		this.ISBN=ISBN;
		this.Title=Title;
		
	}
	public final String getId() {
		return Id;
	}
	public final void setId(String id) {
		Id = id;
	}
	public final String getISBN() {
		return ISBN;
	}
	public final void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public final String getTitle() {
		return Title;
	}
	public final void setTitle(String title) {
		Title = title;
	}
	public final Member getLoanTo() {
		return LoanTo;
	}
	public final void setLoanTo(Member loanTo) {
		LoanTo = loanTo;
	}
	
}
