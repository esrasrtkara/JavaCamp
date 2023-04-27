package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;
	
	
    @Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public void setAdd(Language language) {
		languageRepository.setAdd(language);
		
	}


	@Override
	public void setUpdate(Language language) {
		languageRepository.setUpdate(language);
		
	}

	@Override
	public Language getid(int id) {
		
		return languageRepository.getid(id);
	}

	@Override
	public void setDelete(int id) {
		
		languageRepository.setDelete(id);
	}

}
