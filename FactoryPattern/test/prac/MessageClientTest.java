package prac;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class MessageClientTest {
	private MessageClient client;
	private MessageService svc;
	@Before
	public void setUp() {
		svc = EasyMock.createMock(MessageService.class);
		client = new MessageClient(svc);
	}
	@Test
	public void CanGreet() {
		EasyMock.expect(svc.greet()).andReturn("kemcho");
		EasyMock.replay(svc);
		assertThat(client.sayhello(),equalTo("kemcho"));
		
	}

}
