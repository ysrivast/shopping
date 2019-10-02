package test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import billing.factory.PromotionFactory;
import billing.model.User;
import billing.promotion.EmployeePromotion;

public class TestPromotionFactory {
	private User user;

	@Before
	public void setUp() {
		user = new User(100098l, "testUser", (byte) 1, new Date());
	}

	@Test
	public void test_getPromotion() {
		assertEquals(EmployeePromotion.class,
				PromotionFactory.getPromotion(user).getClass());
	}
}
