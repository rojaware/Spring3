/**
 * 
 */
package com.mkyong.common;

/**
 * @author LEES4
 *
 */
public class Address {
	String street;
	String postalCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String postalCode) {
		super();
		this.street = street;
		this.postalCode = postalCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}
	
}
