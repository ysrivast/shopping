package billing.core;

import billing.factory.PromotionFactory;
import billing.model.Bill;
import billing.model.User;
import billing.promotion.Promotion;
import billing.util.AdditionalDiscount;
import billing.util.BillingConstants;

public class PriceCalculator {
	private User user;
	private Bill bill;

	public PriceCalculator(User user, Bill bill) {
		super();
		this.user = user;
		this.bill = bill;
	}

	public Double calculatePrice() {
		Promotion promotion = null;
		if (bill.getItemType() != null
				&& bill.getItemType().equals(BillingConstants.GROCERY)) {
			promotion = PromotionFactory.getPromotion(user);
		}
		Double amount = bill.getAmount();
		if (promotion != null) {
			amount = promotion.applyPromotion(bill);
		}
		return AdditionalDiscount.bonusDiscount(amount);

	}

}
