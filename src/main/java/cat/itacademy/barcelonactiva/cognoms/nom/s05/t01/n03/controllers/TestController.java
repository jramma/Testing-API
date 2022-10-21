package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain.FlorTester;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.service.FlorTesterService;

@RestController
@RequestMapping("/flor")
public class TestController {
	@Autowired
	private FlorTesterService service;
	
	
//	http://localhost:9002/flor/clientFlorsAll
	@GetMapping("/clientFlorsAll")
	public List <FlorTester> getAll(){
			return service.listarTesters();
		
	}
	
//	http://localhost:9002/flor/clientFlorsGetOne/{id}
	@GetMapping("/clientFlorsGetOne/{id}")
	public FlorTester getOne( @PathVariable Integer id ) {	
		
		return service.testerById(id);
		
	}
	
//	http://localhost:9002/flor/clientFlorsAdd
//
//		http://localhost:9002/flor/clientFlorsUpdate
//
//		http://localhost:9002/flor/clientFlorsDelete/{id}
//
//
	
	
}
