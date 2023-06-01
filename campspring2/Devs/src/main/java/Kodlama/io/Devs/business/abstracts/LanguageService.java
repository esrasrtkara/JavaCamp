package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.Devs.business.responses.GetByIdLanguageResponse;

public interface LanguageService {
	
	List<GetAllLanguageResponse> getAll();
	GetByIdLanguageResponse getById(int id);
	void add(CreteLanguageRequest creteLanguageRequest);
	void delete(int id);
	void update(UpdateLanguageRequest updateLanguageRequest);
	


}
