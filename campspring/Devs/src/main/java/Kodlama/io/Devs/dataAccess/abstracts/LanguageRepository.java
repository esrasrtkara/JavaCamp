package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	void setAdd(Language language);
	void setDelete(int id);
	void setUpdate(Language language);
	Language getid(int id);
	
	
	

}
