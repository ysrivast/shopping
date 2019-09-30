package billing.util;

public class AdditionalDiscount {
	
	public static Double bonusDiscount(Double amount){
		return (amount -getCount(amount)*BillingConstants.DISCOUNT);
	}
	
	public static Integer getCount(Double amount){
		return (int) (amount/BillingConstants.MULTIPLE);
	}
}
