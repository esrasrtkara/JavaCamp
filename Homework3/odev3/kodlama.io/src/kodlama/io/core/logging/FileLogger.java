package kodlama.io.core.logging;

public class FileLogger implements Logger {

	@Override
	public void logging(String message) {
		System.out.println("Dosya loglandı : " + message);
		
	}

}
