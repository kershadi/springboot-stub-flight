package com.epoolex.flightservices.integration;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class FlightRestController {


	@RequestMapping("/flights")
	public String findFlights() {
		return "{flightNo: 1453}";
	}
	
}
