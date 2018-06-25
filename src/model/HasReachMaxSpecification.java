package model;

import java.time.LocalDateTime;

public class HasReachMaxSpecification implements ISpecification<Member>{

	@Override
	public boolean IsSatisfiedBy(Member entity) {
		// TODO Auto-generated method stub
		
	        int max = 3;
	        boolean b = entity.getLoans().stream().filter(Loan::HasNotBeenReturned).count() < max;
	        if (!b) {
	            System.out.println(LocalDateTime.now()+":"+entity.getName()+"借书已达上限"+max+"本");
	        }
	        return b;
	    }
	}
	