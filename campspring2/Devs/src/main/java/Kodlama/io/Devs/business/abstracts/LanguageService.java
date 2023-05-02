package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;

public interface LanguageService {
	
	List<GetAllLanguageResponse> getAll();
	void add(CreteLanguageRequest creteLanguageRequest);
	void delete(CreteLanguageRequest creteLanguageRequest);
	void update(UpdateLanguageRequest updateLanguageRequest);
	


}
