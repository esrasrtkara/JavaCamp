package kodlama.io.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void logging(String message) {
		System.out.println("DataBase Loglandı : " + message);
		
	}

}
