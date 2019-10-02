package billing.promotion;

import billing.model.Bill;

public interface Promotion {

	public Double applyPromotion(Bill bill);

}
