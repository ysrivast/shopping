package billing.promotion;

import billing.model.Bill;

public class AffiliatePromotion implements Promotion {
	
	public Double applyPromotion(Bill bill) {
		return (bill.getAmount()- bill.getAmount()*20/100);
	}
}
