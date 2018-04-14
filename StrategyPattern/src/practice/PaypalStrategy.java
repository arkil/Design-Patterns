package practice;

public class PaypalStrategy implements PaymentStrategy {

	private String emailID;
	private String password;

	public PaypalStrategy(String emailID, String password) {
		this.emailID = emailID;
		this.password = password;
	}

	@Override
	public String pay(int amount) {
		return "Deducted from Pay pal account " + amount;
	}

}
