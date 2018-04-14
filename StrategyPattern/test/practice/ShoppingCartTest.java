package practice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {
	private ShoppingCart cart;
	private Item item1;
	private Item item2;
	
	@Before
	public void setUp() {
		cart = new ShoppingCart();
		item1 = new Item("25", 420);
		item2 = new Item("54", 256);
		cart.addItem(item1);
		cart.addItem(item2);
	}

	@Test
	public void canUseCreditCardStratergy() {
		String result = cart.pay(new CreditCardStrategy("abc", "12345789", "256", "10/05/2022"));
		assertEquals("Payment deducted from Debitcard/Credit card 676", result);

	}
	@Test
	public void canUsePayPalStratergy() {
		String result = cart.pay(new PaypalStrategy("abc@gmail.com", "12345"));
		assertEquals("Deducted from Pay pal account 676", result);

	}

}
