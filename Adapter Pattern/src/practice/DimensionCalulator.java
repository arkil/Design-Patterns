package practice;

public class DimensionCalulator implements IDimensionCalculator {

	@Override
	public double calculateDimesions(Packet packet) {
		return packet.getDepth() * packet.getHeight() * packet.getWidth();
	}

}