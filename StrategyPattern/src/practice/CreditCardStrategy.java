package practice;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String expiryState;

	public CreditCardStrategy(String name, String cardNumber, String cvv, String expiryState) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryState = expiryState;
	}

	@Override
	public String pay(int amount) {
		return "Payment deducted from Debitcard/Credit card " + amount;
	}

}
