package billing.core;

import billing.exception.EmptyCartException;
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
		this.user = user;
		this.bill = bill;
	}

	public Double calculatePrice() throws EmptyCartException {
		Promotion promotion = null;
		if (bill.getCart() == null && bill.getCart().isEmpty()) {
			throw new EmptyCartException("Cart is empty!!!");
		}
		promotion = PromotionFactory.getPromotion(user);
		Double amountExceptGrocery = bill
				.getTotalExceptProduct(BillingConstants.GROCERY);
		Double totalAmount = bill.getTotalAmount()
				- promotion.applyPromotion(amountExceptGrocery);
		return AdditionalDiscount.bonusDiscount(totalAmount);

	}

}
