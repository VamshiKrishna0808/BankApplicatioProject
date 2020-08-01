package vamshi.countries;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Countries> countries = new ArrayList<>();
		countries.add(country("India"));
		
		
		for (Countries countries2 : countries) {
				
			System.out.println("country Name"+ " " + countries2.getCountry());
			
			for( States state: countries2.getState()) {
				
				System.out.println("state Information");
				System.out.println("State Name"+ " " +state.getStateName());
				System.out.println("State code "+ " "+state.getStateCode());
				System.out.println("state Attraction"+ " " +state.getStateAttraction());
				
				for( Cities city : state.getCities()) {
					
					System.out.println("--------------");
					System.out.println("City Information");
					System.out.println("City Address" + " "+ city.getCityAddress());
					System.out.println("City Attraction" + " "+ city.getCityAttraction());
					System.out.println("City Code" + " "+ city.getCityCode());
					System.out.println("City Name" + " "+ city.getCityName());
					
				}
				
			}
			
		}
		
	  
		
		
	}
	
	
	public static Countries country(String countryName) {
		
		Countries country = new Countries();
		country.setCountry(countryName);
		List<States> state = new ArrayList<>();
		state.add(GenericCollectionMain.state("Telangana", 502001, "Charminar"));
		
		country.setState(state);
		
		return country;
		
		
	}
	
	public static States state(String stateName, int stateCode, String stateAttraction) {
		
		States state = new States();
		
		state.setStateName(stateName);
		state.setStateCode(stateCode);
		state.setStateAttraction(stateAttraction);
		
		List<Cities> city = new ArrayList<>();
		city.add(GenericCollectionMain.city("Hyderabad", 50001, "Telangana", "golkonda"));
		city.add(GenericCollectionMain.city("Sangareddy", 502001, "Telangana", "Dam"));
		city.add(GenericCollectionMain.city("Siddipet", 500202, "Telangana", "Market"));
		city.add(GenericCollectionMain.city("Vijayavada", 502003, "Telangana", "temple"));
		
		state.setCities(city);
		
		
		return state;
		
	}
	

	public static Cities city(String cityName, int cityCode, String cityAddress, String cityAttraction) {
		
		Cities city = new Cities();
		
		city.setCityName(cityName);
		city.setCityCode(cityCode);
		city.setCityAddress(cityAddress);
		city.setCityAttraction(cityAttraction);
		
		return city;
	}
	
}
