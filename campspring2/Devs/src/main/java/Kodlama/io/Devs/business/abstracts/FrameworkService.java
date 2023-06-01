package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreteFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;



public interface FrameworkService {
	
	List<GetAllFrameworkResponse> getAll();
	void add(CreteFrameworkRequest creteFrameworkRequest);
	//void delete(CreteFrameworkRequest creteFrameworkRequest);
	//void update(CreteFrameworkRequest creteFrameworkRequest);

}
