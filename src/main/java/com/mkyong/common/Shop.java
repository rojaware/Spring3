package com.mkyong.common;

import java.util.Arrays;

public class Shop {

	String name;
	String staffName[];
	Address address;
	
	public Shop(String name, String[] staffName) {
		super();
		this.name = name;
		this.staffName = staffName;
	}
	public Shop(String name) {
		super();
		this.name = name;
	}
	public Shop() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStaffName() {
		return staffName;
	}
	public void setStaffName(String[] staffName) {
		this.staffName = staffName;
	}
	
	
	
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shop [name=" + name + ", staffName=" + Arrays.toString(staffName) + ", address=" + address + "]";
	}
	public void speak() {
		System.out.println("hello "+name+" is here");
	}
}