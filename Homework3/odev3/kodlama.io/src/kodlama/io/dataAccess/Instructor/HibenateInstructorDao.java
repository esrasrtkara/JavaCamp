package kodlama.io.dataAccess.Instructor;

import kodlama.io.entities.Instructor;

public class HibenateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor[] instructor) {
		
		for (Instructor instructor2 : instructor) {
			System.out.println(instructor2.getName() + " Hibernate ile veritabanına eklendi");
			
		}
		
	}

}
