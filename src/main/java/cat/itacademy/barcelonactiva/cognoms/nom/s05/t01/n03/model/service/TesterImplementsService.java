package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain.Flor;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain.FlorTester;


@Service
public class TesterImplementsService implements FlorTesterService{

	@Autowired
	private RestTemplate clientRest;
	
	@Override
	public List<FlorTester> listarTesters() {
		List<Flor> flor = Arrays.asList( clientRest.getForObject("http://localhost:9001/flor/getAll", Flor[].class));		
		return flor.stream().map(f -> new FlorTester(f)).collect(Collectors.toList());
	}

	@Override
	public FlorTester testerById(Integer id) {
		Map <String, Integer> pathVariables = new HashMap<String, Integer>();
		pathVariables.put("id", id);
		Flor flor = clientRest.getForObject("http://localhost:9001/flor/getOne/{id}", Flor.class, pathVariables);
		return new FlorTester(flor);
	}

}
