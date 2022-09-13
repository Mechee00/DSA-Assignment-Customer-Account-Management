package entity;

public class Address {
	String addrLine1;
	String addrLine2;
	String city;
	String state;
	int zipCode;

	public Address() {}

	public Address(String addrLine1, String addrLine2, String city, String state, int zipCode) {
		this.addrLine1 = addrLine1;
		this.addrLine2 = addrLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	// Getter Setter
	public String getAddrLine1() {
		return this.addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return this.addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address Line 1: '" + getAddrLine1() + "'\n" + "Address Line 2= '" + getAddrLine2() + "'\n" + "City= '" + getCity() + "'\n" + "State: '" + getState() + "'\n" + "Zip Code= '" + getZipCode();
	}

}
