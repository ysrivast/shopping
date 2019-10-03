package billing.promotion.impl;

import billing.promotion.Promotion;

public class OldCustomerPromotion implements Promotion {

	public Double applyPromotion(Double amount) {
		return (amount * 5 / 100);
	}

}
