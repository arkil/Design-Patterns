package practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PaypalStrategyTest {
	
	
	private PaypalStrategy paypal;

	@Before
	public void setUp() {
		paypal = new PaypalStrategy("abc@gmail.com", "1234567");
	}

	@Test
	public void canUsePayPalStratergy() {
		String result = paypal.pay(50);
		assertEquals("Deducted from Pay pal account 50", result);

	}


}
