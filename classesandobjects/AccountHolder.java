package classesandobjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean EligibilityforCreditCard;
	
	public void testEligibilityforCreditCard() {
		
		if (age>25 && accountBalance>=20) 
		{
			EligibilityforCreditCard=true;
		}
		
	}

}
