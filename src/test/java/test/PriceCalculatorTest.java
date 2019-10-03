package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import billing.core.PriceCalculator;
import billing.exception.EmptyCartException;
import billing.factory.PromotionFactory;
import billing.model.Bill;
import billing.model.Product;
import billing.model.User;
import billing.util.BillingConstants;

public class PriceCalculatorTest {
	private User user;
	private Bill bill;
	PriceCalculator calculator;
	List<Product> cart;

	@Before
	public void setUp() {
		user = new User(100098l, "testUser", (byte) 1, new Date());
		cart= new ArrayList<Product>();
		cart.add(new Product("1234","Apple", (byte)1, 10.0));
		cart.add(new Product("1233","Soap", (byte)2, 20.0));
		cart.add(new Product("12346","Jean", (byte)1, 100.0));
		cart.add(new Product("12346","Shirt", (byte)1, 70.0));
		bill = new Bill("BILL3213", 110.0, cart);
		calculator = new PriceCalculator(user, bill);
	}

	@Test
	public void test_calculatePrice() throws EmptyCartException {
		assertEquals(49.0, (double) calculator.calculatePrice(), 0.0);
	}
	@Test
	public void testCalculatePrice() throws EmptyCartException {
		PriceCalculator mockFactory = mock(PriceCalculator.class);
		when(mockFactory.calculatePrice( ) ).thenCallRealMethod();

		mockFactory.calculatePrice();
		verify(mockFactory).calculatePrice();
	}
}
