package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreatModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;

public interface ModelService {
	
	List<GetAllModelsResponse> getAll();
	void add(CreatModelRequest creteModelRequest);

}
