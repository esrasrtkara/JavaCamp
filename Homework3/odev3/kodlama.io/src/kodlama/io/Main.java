package kodlama.io;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InstructorManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.CategoryDao.JdbcCategoryDao;
import kodlama.io.dataAccess.CourseDao.HibernateCourseDao;
import kodlama.io.dataAccess.Instructor.HibenateInstructorDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;
import kodlama.io.core.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
	
	Instructor  instructor = new Instructor("Esra Akbulut");
	Instructor  instructor1 = new Instructor("Halil Akbulut");
	Instructor  instructor2 = new Instructor("Ebru Sırtıkara");
	
	Instructor[] instructors = {instructor,instructor1,instructor2};
	
	Category category = new Category("Programlama");
	Category category1 = new Category("Programlama2");
	
	Category[] categories = {category1};
	Course course = new Course("Java Kursu",12);
	Course course1 = new Course("Python Kursu",20);
	
	Course[] courses = {course1};
	
	Logger[] loggers = {new DatabaseLogger(),new MailLogger()};
		
	InstructorManager instructorManager = new InstructorManager(new HibenateInstructorDao(),loggers);
	
	instructorManager.add(instructors);
	
	CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),categories,loggers);
	
	categoryManager.add(category);
	
	CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses , loggers);
	
	courseManager.add(course);
	
	

	}

}
