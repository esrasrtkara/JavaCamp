package Kodlama.io.Devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.FrameworkService;
import Kodlama.io.Devs.business.requests.CreteFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;
import Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import Kodlama.io.Devs.dataAccess.abstracts.FrameworkResponsitory;
import Kodlama.io.Devs.entities.concretes.Framework;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FrameworkManager implements FrameworkService {

	private FrameworkResponsitory frameworkResponsitory;
	private ModelMapperService modelMapperService;


	@Override
	public List<GetAllFrameworkResponse> getAll() {

		List<Framework> frameworks = frameworkResponsitory.findAll();
		List<GetAllFrameworkResponse> frameworkResponses = frameworks.stream()
				.map(framework -> modelMapperService.forResponse()
						.map(framework, GetAllFrameworkResponse.class)).collect(Collectors.toList());

		return frameworkResponses;
	}

	@Override
	public void add(CreteFrameworkRequest creteFrameworkRequest) {

		Framework framework =this.modelMapperService.forRequest().map(creteFrameworkRequest, Framework.class);

		this.frameworkResponsitory.save(framework);

	}

	

}
