package prac;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FrenchMessageServiceTest {
	private FrenchMessage svc;
	@Before
	public void setUp() {
		svc=new FrenchMessage();
	}
	@Test
	public void canGreetInFrench() {
		assertThat(svc.greet(),equalTo("hola"));
	}

}
