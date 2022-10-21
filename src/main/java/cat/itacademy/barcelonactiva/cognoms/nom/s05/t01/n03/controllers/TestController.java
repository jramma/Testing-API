package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<FlorTester> getAll() {
		return service.listarTesters();

	}

//	http://localhost:9002/flor/clientFlorsGetOne/{id}
	@GetMapping("/clientFlorsGetOne/{id}")
	public FlorTester getOne(@PathVariable Integer id) {

		return service.testerById(id);

	}

//	http://localhost:9002/flor/clientFlorsAdd

	@PostMapping({ "/clientFlorsAdd" })
	public FlorTester addFlor(@RequestBody FlorTester flor) {
		return service.addTest(flor);
	}

//	http://localhost:9002/flor/clientFlorsUpdate
	@PutMapping("/clientFlorsUpdate")
	public FlorTester updateFlor(@RequestBody Integer id) {

		return service.updateTest(id);

	}

	// http://localhost:9002/flor/clientFlorsDelete/{id}
	@DeleteMapping(value = "/clientFlorsDelete/{id}")
	public void deleteFlor(@PathVariable("id") Integer id) {
		service.deleteTest(id);

	}

}
