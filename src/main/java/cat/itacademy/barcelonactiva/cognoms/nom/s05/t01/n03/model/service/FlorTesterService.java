package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.service;

import java.util.List;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain.FlorTester;

public interface FlorTesterService {

	public List<FlorTester> listarTesters();
	public FlorTester testerById(Integer Id);
	
	
}
