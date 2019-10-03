package billing.factory;

import billing.model.User;
import billing.promotion.Promotion;
import billing.promotion.impl.AffiliatePromotion;
import billing.promotion.impl.DefaultPromotion;
import billing.promotion.impl.EmployeePromotion;
import billing.promotion.impl.OldCustomerPromotion;
import billing.util.BillingConstants;
import billing.util.DateUtility;

public class PromotionFactory {

	public static Promotion getPromotion(User user) {

		if (user.getUserType() != null
				&& user.getUserType().equals(BillingConstants.EMPLOYEE)) {
			return new EmployeePromotion();
		} else if (user.getUserType() != null
				&& user.getUserType().equals(BillingConstants.AFFILIATE)) {
			return new AffiliatePromotion();
		} else if (user.getCreationDate() != null
				&& DateUtility.getDiffYears(user.getCreationDate()) >= 2) {
			return new OldCustomerPromotion();
		}
		return new DefaultPromotion();
	}
}
