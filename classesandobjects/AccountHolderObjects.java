package classesandobjects;

public class AccountHolderObjects {
	public static void main(String[] args) {
		AccountHolder tom=new AccountHolder();
		AccountHolder sarah=new AccountHolder();
		AccountHolder henry=new AccountHolder();
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=27;
		tom.accountBalance=40000; 	
		tom.testEligibilityforCreditCard();
		System.out.println("Is Tom eligible for Credir Card: "+tom.EligibilityforCreditCard);
		
		sarah.firstName="Tom";
		sarah.lastName="Smith";
		sarah.age=31;
		sarah.accountBalance=30000; 	
		sarah.testEligibilityforCreditCard();
		System.out.println("Is Sarah eligible for Credir Card: "+sarah.EligibilityforCreditCard);
	}

}
