package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.FrameworkService;
import Kodlama.io.Devs.business.requests.CreteFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/framework")
@AllArgsConstructor
public class FrameworkController {
	
	private FrameworkService frameworkService;

	
	
	@GetMapping()
	List<GetAllFrameworkResponse> getAll(){
		return frameworkService.getAll();
	
	}
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@Valid CreteFrameworkRequest creteFrameworkRequest) {
		
		frameworkService.add(creteFrameworkRequest);
	}

	
	

}
