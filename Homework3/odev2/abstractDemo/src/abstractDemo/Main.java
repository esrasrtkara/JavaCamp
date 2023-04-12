package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseDatabaseManager databaseManager = new SqlServerDatabaseManager();
		
		CustomerManager customerManager = new CustomerManager(databaseManager);
		
		customerManager.getData();

	}

}
