package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] logger = { new EmailLogger(),new DatabaseLogger()};
		
		 CustomerManager customerManeger = new CustomerManager(logger);
		 
		 customerManeger.add();
		
		

	}

}
