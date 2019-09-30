package billing.promotion;

import billing.model.Bill;

public class EmployeePromotion implements Promotion{


	public Double applyPromotion(Bill bill) {
		return (bill.getAmount()- bill.getAmount()*30/100);
	}

}
