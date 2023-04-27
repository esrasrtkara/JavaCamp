package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();

		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "Python"));

	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public void setAdd(Language language) {
		
		int i =0;
		
	  for (Language language1 : languages) {
		  
		  if(language.getName().equalsIgnoreCase(language1.getName()) ) {
			 
			 i++;
		  }
	  }
	  if(i == 0) {
		  languages.add(language);
	  }
	  
		
		

		

	}

	@Override
	public void setUpdate(Language language) {

		for (Language language1 : languages) {
			if (language1.getId() == language.getId()) {
				languages.set((language.getId() - 1), language);
			}
		}

	}

	@Override
	public Language getid(int id) {

		return languages.get(id);
	}

	@Override
	public void setDelete(int id) {

		for (Language language : languages) {

			if (language.getId() == id) {
				languages.remove(language);
			}

		}
	}

}
