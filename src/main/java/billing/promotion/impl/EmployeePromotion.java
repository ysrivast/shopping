package billing.promotion.impl;

import billing.promotion.Promotion;

public class EmployeePromotion implements Promotion {

	public Double applyPromotion(Double amount) {
		return (amount * 30 / 100);
	}

}
