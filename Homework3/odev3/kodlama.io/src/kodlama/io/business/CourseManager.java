package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Course[] courses;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao ,Course[] courses , Logger[] loggers ) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		for (Course course1 : courses) {
			
			if(course.getName().equals(course1.getName())) {
				
				throw new Exception("Aynı kurs ismi eklenemez");
				
			}
			else if(course.getPrice() < 0) {
				throw new Exception("Fiyat sıfırdan az olamaz");
			}
			
			else {
				courseDao.add(course);
			}
			
		}
		for (Logger logger : loggers) {
			
			logger.logging("Course Log mesajı");
			
		}
	}
	
	

}
