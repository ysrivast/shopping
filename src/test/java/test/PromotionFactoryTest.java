package test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import billing.factory.PromotionFactory;
import billing.model.User;
import billing.promotion.impl.EmployeePromotion;

public class PromotionFactoryTest {
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

	@Test
	public void testEmployeePromotion() {
		User user = new User(100098l, "testUser", (byte) 1, new Date());
		PromotionFactory mockFactory = mock(PromotionFactory.class);
		when(mockFactory.getPromotion((User) anyObject())).thenCallRealMethod();

		mockFactory.getPromotion(user);
		verify(mockFactory).getPromotion(user);
	}
}
