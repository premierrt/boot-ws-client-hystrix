package bootws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class AppConfig {

	//https://stackoverflow.com/questions/15203919/advantages-of-webservicegatewaysupport-vs-webservicetemplate
	
	@Bean
	Jaxb2Marshaller Jaxb2Marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
	//	jaxb2Marshaller.set
		return jaxb2Marshaller;
	}
	
	
	@Bean
	WebServiceTemplate webServiceTemplate() {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		//webServiceTemplate.setMarshaller(marshaller);
		
		return webServiceTemplate;
	}
	
}
