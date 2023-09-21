package com.pack.books.models;

public class Publisher {

	String publisher_name;
	String address;
	String phone_number;

	@Override
	public String toString() {
		return "Publisher [publisher_name=" + publisher_name + ", address=" + address + ", phone_number=" + phone_number
				+ "]";
	}

	public String getPublisher_name() {
		return publisher_name;
	}

	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

}
