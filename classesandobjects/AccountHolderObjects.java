package classesandobjects;

public class AccountHolderObjects {
	public static void main(String[] args) {
		AccountHolder tom=new AccountHolder();
		AccountHolder sarah=new AccountHolder();
		AccountHolder henry=new AccountHolder();
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=40000; 	
		tom.testEligibilityforCreditCard();
		System.out.println("Is Tom eligible for Credir Card: "+tom.EligibilityforCreditCard);
		
		sarah.firstName="sarah";
		sarah.lastName="doe";
		sarah.age=31;
		sarah.accountBalance=30000; 	
		sarah.testEligibilityforCreditCard();
		System.out.println("Is Sarah eligible for Credir Card: "+sarah.EligibilityforCreditCard);
		
		henry.firstName="henry";
		henry.lastName="bowden";
		henry.age=31;
		henry.accountBalance=19000; 	
		henry.testEligibilityforCreditCard();
		System.out.println("Is Sarah eligible for Credir Card: "+sarah.EligibilityforCreditCard);
	}

}
