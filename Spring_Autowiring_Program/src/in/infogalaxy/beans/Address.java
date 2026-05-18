 package in.infogalaxy.beans;

public class Address {
	
	private int plot;
	private String street;
	private String city;
	private int pincode;
	
	
	public int getPlot() {
		return plot;
	}
	public void setPlot(int plot) {
		this.plot = plot;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+plot+", "+street+", "+city+" - "+pincode; 
	}

}
