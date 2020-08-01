package vamshi.countries;

import java.util.List;

public class Countries {
	
	private String countryName;
	
	private List<States> state;

	public String getCountry() {
		return countryName;
	}

	public void setCountry(String country) {
		this.countryName = country;
	}

	public List<States> getState() {
		return state;
	}

	public void setState(List<States> state) {
		this.state = state;
	}

}
