package kodlama.io.business;



import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.Instructor.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;
	


	public InstructorManager(InstructorDao instructorDao ,Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		
	}




	public void add(Instructor[] instructors ) {
		
		instructorDao.add(instructors);	
		
		for (Logger logger : loggers) {
			
			logger.logging("Instructer log mesajı");
			
		}
	}
	

}
