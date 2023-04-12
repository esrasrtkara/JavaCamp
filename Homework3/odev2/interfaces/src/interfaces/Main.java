package interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		ICustomerDal customerDal = new MySqlCustomerDal();
		
		CustomerManager customerManager = new CustomerManager(customerDal);
		
		customerManager.add();
		
	}

}
