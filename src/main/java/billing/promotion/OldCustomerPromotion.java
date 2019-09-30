package billing.promotion;

import billing.model.Bill;

public class OldCustomerPromotion implements Promotion{
	
	public Double applyPromotion(Bill bill) {
		return (bill.getAmount()- bill.getAmount()*5/100);
	}
	
}
