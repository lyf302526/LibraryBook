package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class LoanFactory {
	public static Loan CreateLoan(Book book,Member member) {
		book.setLoanTo(member);
		Loan loan=new Loan();
		loan.setId(UUID.randomUUID().toString());
		loan.setBook(book);
		loan.setLoanDate(LocalDateTime.now());
		loan.setMember(member);
		System.out.println(member.getName()+"成功借阅"+book.getTitle());
		return loan;
	}
}
