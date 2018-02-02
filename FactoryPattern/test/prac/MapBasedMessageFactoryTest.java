package prac;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MapBasedMessageFactoryTest {
	private MapBasedMessageFactory factory;

	@Before
	public void setUp() {
		factory = new MapBasedMessageFactory();
	}

	@Test
	public void canRegister() {
		assertThat(factory.register("STR","java.lang.String"),equalTo(true));
	}

	@Test
	public void canNewInstance() {
		Object obj;
		factory.register("STR", "java.lang.String");
		obj=factory.newInstance("STR");
		assertThat(obj,instanceOf(String.class));
	}

}
