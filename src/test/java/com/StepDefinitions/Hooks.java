package com.StepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("DeletePlace")
	public void beforeScenario() throws IOException {
		//execute this code only when place id is null
		
		//write a code that will give you place id
		
		StepDefinition step = new StepDefinition();
		if(StepDefinition.place_id==null) {
		step.add_place_payload_with("Vijay", "Telugu", "Misa Lane");
		step.user_calls_with_http_request("AddPlaceAPI", "POST");
		step.verify_place_id_created_maps_to_using("Vijay", "getPlaceAPI");
		}
	}

}
