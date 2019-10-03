package billing.promotion.impl;

import billing.promotion.Promotion;

public class AffiliatePromotion implements Promotion {

	public Double applyPromotion(Double amount) {
		return (amount * 20 / 100);
	}
}
