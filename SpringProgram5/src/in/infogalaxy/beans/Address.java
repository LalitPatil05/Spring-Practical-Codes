package in.infogalaxy.beans;

public class Address {
	
	int plot;
	String street;
	String city;
	int pincode;
	
	public void setPlot(int plot) {
		this.plot = plot;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
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
