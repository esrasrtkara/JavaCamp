package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.FrameworkService;
import Kodlama.io.Devs.business.requests.CreteFrameworkRequest;
import Kodlama.io.Devs.business.responses.GetAllFrameworkResponse;
import Kodlama.io.Devs.dataAccess.abstracts.FrameworkResponsitory;
import Kodlama.io.Devs.entities.concretes.Framework;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class FrameworkManager implements FrameworkService {

	private FrameworkResponsitory frameworkResponsitory;

	public FrameworkManager(FrameworkResponsitory frameworkResponsitory) {

		this.frameworkResponsitory = frameworkResponsitory;
	}

	@Override
	public List<GetAllFrameworkResponse> getAll() {

		List<Framework> frameworks = frameworkResponsitory.findAll();
		List<GetAllFrameworkResponse> frameworkResponses = new ArrayList<GetAllFrameworkResponse>();

		for (Framework framework : frameworks) {
			GetAllFrameworkResponse getAllFrameworkResponse = new GetAllFrameworkResponse();

			getAllFrameworkResponse.setName(framework.getName());
			getAllFrameworkResponse.setId(framework.getId());

			frameworkResponses.add(getAllFrameworkResponse);
		}
		return frameworkResponses;
	}

	@Override
	public void add(CreteFrameworkRequest creteFrameworkRequest) {

		Language language = new Language();
		Framework framework = new Framework();

		language.setId(creteFrameworkRequest.getLanguageId());

		framework.setLanguage(language);

		framework.setName(creteFrameworkRequest.getName());

		frameworkResponsitory.save(framework);

	}

	@Override
	public void delete(CreteFrameworkRequest creteFrameworkRequest) {

		List<Framework> frameworks = frameworkResponsitory.findAll();

		for (Framework framework : frameworks) {

			if (framework.getLanguage().getId() == creteFrameworkRequest.getLanguageId()) {

				frameworkResponsitory.delete(framework);
			}

		}

	}

	@Override
	public void update(CreteFrameworkRequest creteFrameworkRequest) {

		List<Framework> frameworks = frameworkResponsitory.findAll();
		for (Framework framework : frameworks) {

			if (framework.getLanguage().getId() == creteFrameworkRequest.getLanguageId()) {

				framework.setName(creteFrameworkRequest.getName());
				
				frameworkResponsitory.save(framework);
			}

		}

	}

}
