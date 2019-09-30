package billing.factory;

import billing.model.User;
import billing.promotion.AffiliatePromotion;
import billing.promotion.EmployeePromotion;
import billing.promotion.OldCustomerPromotion;
import billing.promotion.Promotion;
import billing.util.BillingConstants;
import billing.util.DateUtility;

public class PromotionFactory {
	
	public static Promotion getPromotion(User user){
		
		if(user.getUserType()!=null && user.getUserType()==BillingConstants.EMPLOYEE){
			return new EmployeePromotion();
		}
		else if(user.getUserType()!=null && user.getUserType()==BillingConstants.AFFILIATE){
			return new AffiliatePromotion();
		}
		else if(user.getCreationDate()!=null && DateUtility.getDiffYears(user.getCreationDate())>=2){
			return new OldCustomerPromotion();
		}
		return null;
	}
}
