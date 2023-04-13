
package kodlama.io.dataAccess.Instructor;

import kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor[] instructor) {
		for (Instructor instructor2 : instructor) {
			System.out.println(instructor2 + " Jdbc ile veri tabanına eklendi");
		}
		
		
	}

}
