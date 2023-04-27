package Kodlama.io.Devs.webApi.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	
	private LanguageService languageService;
	
	
	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		
		return languageService.getAll();
	}
	@GetMapping("/setadd")
	void setAdd() {
		
		languageService.setAdd(new Language(3, "C"));
		languageService.setAdd(new Language(4, "Java"));
	
		
	}
	@GetMapping("/setdelete")
	void setDelete() {
		
		languageService.setDelete(3);
		
	}
	@GetMapping("/setupdate")
	void setUpdate() {
		
		languageService.setUpdate(new Language(2,"Java"));
		
	}
	@GetMapping("/getid")
	void getId() {
		
		languageService.getid(2);
		
	}
	
	

}
