package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoryDao.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Category[] categories;
	private Logger[] loggers;
	
	

	public CategoryManager(CategoryDao category,Category[] categories ,Logger[] loggers) {
		super();
		this.categoryDao = category;
		this.categories = categories;
		this.loggers = loggers;
	}
	
	
	public void add(Category category) throws Exception {
		
		for (Category category1 : categories) {
			if(category.getName().equals(category1.getName())) {
				throw new Exception("Aynı isim eklenemez");
			}
			else {
				categoryDao.add(category);
			}
		}
		for (Logger logger : loggers) {
			
			logger.logging("Category log mesajı");
			
		}
		
	}

}
