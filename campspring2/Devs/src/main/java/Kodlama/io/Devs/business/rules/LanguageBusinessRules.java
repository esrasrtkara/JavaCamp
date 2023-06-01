package Kodlama.io.Devs.business.rules;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.core.utilities.exceptions.BusinessException;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageResponsitory;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageBusinessRules {
	
	private LanguageResponsitory languageResponsitory;
	
	public void checkIfLanguageNameExists(String name) {
		
		if(this.languageResponsitory.existsByName(name)) {
			throw new BusinessException("Language already exists");
		}
		
		
	}

}
