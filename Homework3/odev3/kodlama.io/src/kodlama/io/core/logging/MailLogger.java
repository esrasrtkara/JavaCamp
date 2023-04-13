package kodlama.io.core.logging;

public class MailLogger implements Logger {

	@Override
	public void logging(String message) {
		System.out.println("Mail Loglandı : " + message);
		
	}

	

}
