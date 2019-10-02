package test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import billing.core.PriceCalculator;
import billing.model.Bill;
import billing.model.User;

public class TestPriceCalculator {
	private User user;
	private Bill bill;
	PriceCalculator calculator;

	@Before
	public void setUp() {
		user = new User(100098l, "testUser", (byte) 1, new Date());
		bill = new Bill("BILL3213", 110.0, (byte) 5);
		calculator = new PriceCalculator(user, bill);
	}

	@Test
	public void test_calculatePrice() {
		assertEquals(77.0, (double) calculator.calculatePrice(), 0.0);
	}
}
