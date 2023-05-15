package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreatBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandresponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandresponse getById(int id);
	void add(CreatBrandRequest creatBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);

}
