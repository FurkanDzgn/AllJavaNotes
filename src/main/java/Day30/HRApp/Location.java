package Day30.HRApp;

public class Location {
	
	//  locationCountry
    //  locationState
    //  locationCity
	
	private String locationCountry;
	private String locationState;
	private String locationCity;
	private int locationId;
	
	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}
	
	public String getLocationCountry() {
		return locationCountry;
	}
	
	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	
	public String getLocationState() {
		return locationState;
	}
	
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	
	public String getLocationCity() {
		return locationCity;
	}
	
	public String toString() {
		return "{LocationCountry : "+ locationCountry+"\nLocationState : "+ locationState+"\nLocationCity : "+locationCity+" }";
				
	}

	public Location(String locationCountry, String locationState, String locationCity,int locationId) {
		super();
		this.locationCountry = locationCountry;
		this.locationState = locationState;
		this.locationCity = locationCity;
		this.locationId = locationId;
	}
	
	

}
