package polymorphismDemo;

public class CustomerManager {
	private BaseLogger[] loggers;
	
	
	public CustomerManager(BaseLogger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	public void add() {
		
		System.out.println("Müşteri eklendi...");
		
		for (BaseLogger baseLogger : loggers) {
			
			baseLogger.log("Log mesajı");
			
		}
	}


	
}
