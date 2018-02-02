package prac;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class EnglishMessageServiceTest {
	private EnglishMessage svc;
	@Before
	public void setUp() {
		svc=new EnglishMessage();
	}
	@Test
	public void canGreetInEnglish() {
		assertThat(svc.greet(),equalTo("salutations"));
	}

}
