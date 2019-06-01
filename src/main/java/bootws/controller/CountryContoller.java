package bootws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bootws.services.CountyService;

@RestController
public class CountryContoller {

	
	@Autowired
	private CountyService countyService;
	
	@GetMapping("/country")
	public String getCountry(@PathVariable String country) {
		return countyService.getCountry(country).toString();
	}
}
