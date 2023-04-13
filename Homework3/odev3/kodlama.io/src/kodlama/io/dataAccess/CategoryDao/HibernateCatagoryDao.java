package kodlama.io.dataAccess.CategoryDao;

import kodlama.io.entities.Category;

public class HibernateCatagoryDao implements  CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
