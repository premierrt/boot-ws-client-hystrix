package bootws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class AppConfig {

	//https://stackoverflow.com/questions/15203919/advantages-of-webservicegatewaysupport-vs-webservicetemplate
	
	@Bean
	Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setContextPath("bootws.generated");
		return jaxb2Marshaller;
	}
	
	//https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s02.html
	@Bean
	WebServiceTemplate webServiceTemplate() {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setMarshaller(jaxb2Marshaller());
		webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
		
		return webServiceTemplate;
	}
	
}
