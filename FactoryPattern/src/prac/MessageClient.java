package prac;

public class MessageClient {
	private MessageService svc;

	public MessageClient(MessageService svc) {
		this.svc = svc;
	}

	public String sayhello() {
		
		return svc.greet() ;
	}
	

}
