package practice;

public class DimensionCalculatorAdapter implements IDimensionCalculatorAdapter {
	private Packet packet;
	private IDimensionCalculator calculate;

	public DimensionCalculatorAdapter(Packet packet) {
		this.packet = packet;
		calculate = new DimensionCalulator();
	}

	@Override
	public double calculateDimensions() {
		return calculate.calculateDimesions(packet);
	}

}
