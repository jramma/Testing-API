package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TesterConfig {
	
	@Bean("clientRest")
	public RestTemplate regitrarRestTempl(){
		return new RestTemplate();
		
	}

}
