package kodlama.io.dataAccess.CategoryDao;

import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri atabanına eklendi");
		
	}

}
