package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.service;

import java.util.List;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain.FlorTester;

public interface FlorTesterService {

	public List<FlorTester> listarTesters();
	public FlorTester testerById(Integer id);
	public FlorTester updateTest(Integer id);
	public void deleteTest(Integer id);
	public FlorTester addTest(FlorTester florTest);
	
//	http://localhost:9002/flor/clientFlorsAdd
//	http://localhost:9002/flor/clientFlorsUpdate
//	http://localhost:9002/flor/clientFlorsDelete/{id}	
}
