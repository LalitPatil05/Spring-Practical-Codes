package in.infogalaxy.beans;

public class Address {
	
	int plot;
	String street;
	String city;
	int pincode;
	
	public Address(int plot, String street, String city, int pincode) {
		this.plot = plot;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+plot+", "+street+", "+city+" - "+pincode;
	}
	

}
