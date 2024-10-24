package com.resources;

import java.util.ArrayList;
import java.util.List;

import com.pojo.AddPlace;
import com.pojo.Location;

public class TestDataBuild {

	public AddPlace addPlacePayLoad(String name, String language, String address) {
		// TODO Auto-generated method stub
		 AddPlace ap = new AddPlace();
		    ap.setAccuracy(50);
		    ap.setAddress(address);
		    ap.setLanguage(language);
		    ap.setName(name);
		    ap.setPhone_number("(+91) 983 893 3937");
		    ap.setWebsite("https://rahulshettyacademy.com");
		    List<String> list = new ArrayList<String>();
		    list.add("shoe park");
		    list.add("shop");
		    ap.setTypes(list);
		    
		    Location l = new Location();
		    l.setLat(-38.383494);
		    l.setLng(33.427362);
		    ap.setLocation(l);
		    System.out.println("Test data is updated");
		    return ap;
	}
	
	public String deletePlacePayload(String placeId) {
		return "{\r\n   \"place_id\":\""+placeId+"\"\r\n}";
	}

}
