package abstractDemo;

public class CustomerManager {
	
	private BaseDatabaseManager dataBaseManager;

	public CustomerManager(BaseDatabaseManager dataBaseManager) {
		super();
		this.dataBaseManager = dataBaseManager;
	}
	
	
	public void getData() {
		
		dataBaseManager.getData();
	}
	
	

}
