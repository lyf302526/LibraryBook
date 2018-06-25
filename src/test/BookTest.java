package test;

import java.time.LocalDateTime;

import org.junit.Test;

import model.Book;
import model.Loan;
import model.Member;

public class BookTest {
	
	@Test
		public void test(){
			Book book1 = new Book("01","0215487963","《大学英语1》");
			Book book2 = new Book("02","0215487965","《大学英语2》");
			Book book3 = new Book("03","0215487967","《大学英语3》");
			Book book4 = new Book("04","0215487969","《大学英语4》");
			Book book5 = new Book("05","2145698753","《高等数学》");

	    	 	
			Member member1 = new Member("01","李艳芳");
			Member member2 = new Member("02","李文智");

			 System.out.println(LocalDateTime.now()+"：李艳芳尝试借《大学英语1》");
		     if (member1.CanLoan(book1)) {
		         member1.Loan(book1);
		     }
		     System.out.println(LocalDateTime.now()+":李艳芳再尝试借《大学英语1》");
		     if (member1.CanLoan(book1)) {
		         member1.Loan(book1);
		     }
		     System.out.println(LocalDateTime.now()+":李艳芳还《大学英语1》");
		     member1.Return(book1);System.out.println(LocalDateTime.now()+":李文智借《大学英语2》");
		     if (member2.CanLoan(book2)) {
		         member2.Loan(book2);
		     }
		     System.out.println(LocalDateTime.now()+":李文智借《大学英语3》");
		     if (member2.CanLoan(book3)) {
		         member2.Loan(book3);
		     }
		     System.out.println(LocalDateTime.now()+":李文智借《大学英语4》");
		     if (member2.CanLoan(book4)) {
		         member2.Loan(book4);
		     }
		     System.out.println(LocalDateTime.now()+":李文智借《高等数学》");
		     if (member2.CanLoan(book5)) {
		         member2.Loan(book5);
		     }
		     System.out.println(LocalDateTime.now()+":李文智还《大学英语2》");
		     member2.Return(book2);

		     System.out.println(LocalDateTime.now()+":李文智再借《高等数学》");
		     if (member2.CanLoan(book5)) {
		         member2.Loan(book5);
		     }
	    	      System.out.println(member1.FindCurrentLoanFor(book1));
	    	      System.out.println(member2.FindCurrentLoanFor(book5));
	    	      
		}
}
