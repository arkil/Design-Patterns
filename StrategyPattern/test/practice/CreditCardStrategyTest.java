package practice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardStrategyTest {
	private CreditCardStrategy card;

	@Before
	public void setUp() {
		card = new CreditCardStrategy("abc", "123456789", "123", "10/10/2020");
	}

	@Test
	public void canMap() {
		String result = card.pay(50);
		assertEquals("Payment deducted from Debitcard/Credit card 50", result);

	}

}
