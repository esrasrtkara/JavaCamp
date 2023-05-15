package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreatBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandresponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	private BrandBusinessRules brandBusinessRules;


	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
	//	List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		
	/*	for (Brand brand : brands) {
			
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
			
		}*/
		
		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand->this.modelMapperService.forResponse()
						.map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
	
		return brandsResponse;
	}

	@Override
	public void add(CreatBrandRequest creatBrandRequest) {
	//	Brand brand = new Brand();
	//	brand.setName(creatBrandRequest.getName());
		this.brandBusinessRules.checkIfBrandNameExists(creatBrandRequest.getName());
		Brand brand = this.modelMapperService.forRequest().map(creatBrandRequest, Brand.class);
		this.brandRepository.save(brand);
		
		
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		
		this.brandRepository.save(brand);
		
	}

	@Override
	public GetByIdBrandresponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		
		GetByIdBrandresponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandresponse.class);
		return response;
	}

	@Override
	public void delete(int id) {
		brandRepository.deleteById(id);
		
	}

}
