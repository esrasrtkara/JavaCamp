package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageResponsitory;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageResponsitory languageResponsitory;
	
	
	@Autowired
	public LanguageManager(LanguageResponsitory languageResponsitory) {
		
		this.languageResponsitory = languageResponsitory;
	}

	@Override
	public List<GetAllLanguageResponse> getAll() {
		
		List<Language> languages = languageResponsitory.findAll();
		List<GetAllLanguageResponse> LanguageResponses = new ArrayList<GetAllLanguageResponse>();
		
		for (Language language : languages) {
			
			GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
			
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			
			LanguageResponses.add(responseItem);

		}
		
		
		
		return LanguageResponses;
	}

	@Override
	public void add(CreteLanguageRequest creteLanguageRequest) {
		
		Language language = new Language();
		language.setName(creteLanguageRequest.getName());
		this.languageResponsitory.save(language);
		
	}

	@Override
	public void delete(CreteLanguageRequest creteLanguageRequest) {
		List<Language> languages = languageResponsitory.findAll();
		for (Language language : languages) {

			if(language.getName().equals(creteLanguageRequest.getName())){
				
				languageResponsitory.delete(language);
				
			}
		}
		
	
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		List<Language> languages = languageResponsitory.findAll();
		
		for (Language language : languages) {

			if(language.getId() == updateLanguageRequest.getId()) {
				
			     language.setName(updateLanguageRequest.getName());
			     languageResponsitory.save(language);
			}
		}
		
		
	}

	
	



}
