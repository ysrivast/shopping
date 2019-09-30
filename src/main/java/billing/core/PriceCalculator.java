package billing.core;

import billing.factory.PromotionFactory;
import billing.model.Bill;
import billing.model.User;
import billing.promotion.Promotion;
import billing.util.AdditionalDiscount;

public class PriceCalculator {
	private User user;
	private Bill bill;
	public PriceCalculator(User user, Bill bill) {
		super();
		this.user = user;
		this.bill = bill;
	}
	
	public Double calculatePrice(){
		Promotion promotion=null;
		if(bill.getItemType()!=null){
			promotion=PromotionFactory.getPromotion(user);
		}
		Double amount =bill.getAmount();
		if(promotion!=null){
			amount =promotion.applyPromotion(bill);
		}
		Double finalAmount=AdditionalDiscount.bonusDiscount(amount);
		return finalAmount;
	}
	

}
