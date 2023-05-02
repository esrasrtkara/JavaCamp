package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.FrameworkService;
import Kodlama.io.Devs.business.requests.CreteFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;

@RestController
@RequestMapping("/api/framework")
public class FrameworkController {
	
	private FrameworkService frameworkService;

	public FrameworkController(FrameworkService frameworkService) {
	
		this.frameworkService = frameworkService;
	}
	
	@GetMapping("/getall")
	List<GetAllFrameworkResponse> getAll(){
		return frameworkService.getAll();
	
	}
	@PostMapping("/add")
	public void add(CreteFrameworkRequest creteFrameworkRequest) {
		
		frameworkService.add(creteFrameworkRequest);
	}
	@DeleteMapping("/delete")
	public void delete(CreteFrameworkRequest creteFrameworkRequest) {
		
		frameworkService.delete(creteFrameworkRequest);
	}
	@PostMapping("/update")
	public void update(CreteFrameworkRequest creteFrameworkRequest) {
		
		frameworkService.update(creteFrameworkRequest);
	}
	
	

}
