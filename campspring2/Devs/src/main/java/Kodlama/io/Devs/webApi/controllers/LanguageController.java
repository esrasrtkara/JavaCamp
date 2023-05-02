package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.CreteLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	
	
	private LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll(){
		
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreteLanguageRequest creteLanguageRequest) {
		
		languageService.add(creteLanguageRequest);
	}
	@DeleteMapping("/delete")
	public void delete(CreteLanguageRequest creteLanguageRequest) {
		
		languageService.delete(creteLanguageRequest);
	}
	@PostMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		
		languageService.update(updateLanguageRequest);
	}
	
	
	


}
