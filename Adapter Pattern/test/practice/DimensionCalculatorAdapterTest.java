package practice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DimensionCalculatorAdapterTest {
	private Packet packet;
	private IDimensionCalculatorAdapter adapter;

	@Before
	public void setUp() {
		packet = new Packet(4.5, 12.5, 6.0);
		adapter = new DimensionCalculatorAdapter(packet);
	}

	@Test
	public void canCalculateDimension() {
		assertThat(adapter.calculateDimensions(), equalTo(337.5));
	}

}
