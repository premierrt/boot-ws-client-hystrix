package bootws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import bootws.generated.GetCountryRequest;
import bootws.generated.GetCountryResponse;

@Service
public class CountyService  {

	@Value ("${uri}")
	private String uri;
	
	@Autowired
	private WebServiceTemplate webServiceTemplate;
	
	
	public GetCountryResponse getCountry(String country) {
		GetCountryRequest request = new GetCountryRequest();
		request.setName(country);
		// na chama ustawić marshaller
		
		GetCountryResponse respone = (GetCountryResponse) webServiceTemplate.marshalSendAndReceive(uri, request);
		return respone;
	}
}
