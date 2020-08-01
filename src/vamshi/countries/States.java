package vamshi.countries;

import java.util.List;

public class States {

	private String stateName;
	private int stateCode;
	private String stateAttraction;
	private List<Cities> cities;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateAttraction() {
		return stateAttraction;
	}
	public void setStateAttraction(String stateAttraction) {
		this.stateAttraction = stateAttraction;
	}
	public List<Cities> getCities() {
		return cities;
	}
	public void setCities(List<Cities> cities) {
		this.cities = cities;
	}
	
	
}
