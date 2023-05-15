package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreatBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandresponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	
	private BrandService brandService;
	
	
	
	@GetMapping()
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();	
	}
	
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@Valid() CreatBrandRequest creatBrandRequest) {
		this.brandService.add(creatBrandRequest);
	}
	@GetMapping("/{id}")
	public GetByIdBrandresponse getById(@PathVariable int id) {
		return this.brandService.getById(id);
	}
	
	@PutMapping
	public void update(UpdateBrandRequest updateBrandRequest) {
		
		this.brandService.update(updateBrandRequest);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		
		this.brandService.delete(id);
	}
	
	
	

}
