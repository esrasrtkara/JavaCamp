package Kodlama.io.Devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import Kodlama.io.Devs.business.responses.GetByIdLanguageResponse;
import Kodlama.io.Devs.business.rules.LanguageBusinessRules;
import Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageResponsitory;
import Kodlama.io.Devs.entities.concretes.Language;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
	
	private LanguageResponsitory languageResponsitory;
	private ModelMapperService modelMapperService;
	private LanguageBusinessRules languageBusinessRules;
	

	@Override
	public List<GetAllLanguageResponse> getAll() {
		
		List<Language> languages = languageResponsitory.findAll();
		List<GetAllLanguageResponse> LanguageResponses = languages.stream()
				.map(language -> this.modelMapperService.forResponse()
						.map(language, GetAllLanguageResponse.class)).collect(Collectors.toList());
		
		return LanguageResponses;
	}

	@Override
	public void add(CreteLanguageRequest creteLanguageRequest) {
		
		this.languageBusinessRules.checkIfLanguageNameExists(creteLanguageRequest.getName());
		
		Language language = this.modelMapperService.forRequest().map(creteLanguageRequest, Language.class);
		
		this.languageResponsitory.save(language);
		
	}

	@Override
	public void delete(int id) {
	
		this.languageResponsitory.deleteById(id);
	
	
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		
		Language language = this.modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
		
		this.languageResponsitory.save(language);
	
	}

	@Override
	public GetByIdLanguageResponse getById(int id) {
		Language language = this.languageResponsitory.findById(id).orElse(null);
		
		GetByIdLanguageResponse response = this.modelMapperService.forResponse().map(language, GetByIdLanguageResponse.class);
		return response ;
	}

	
	



}
