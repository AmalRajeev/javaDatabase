package com.ilp04.entity;

public class Customer {
	private int customerCode;
	private String  customerFirstName;
	private String customerLastName;
	private String adress;
	private long phNumber;
	private long aadharNo;
	public int getCustomerCode() {
		return customerCode;
	}
	public Customer(int customerCode, String customerFirstName, String customerLastName, String adress, long phNumber,
			long aadharNo) {
		super();
		this.customerCode = customerCode;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.adress = adress;
		this.phNumber = phNumber;
		this.aadharNo = aadharNo;
	}
	public Customer(String fname, String lname, String address, long phno, long aadhar) {
		// TODO Auto-generated constructor stub
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.adress = adress;
		this.phNumber = phNumber;
		this.aadharNo = aadharNo;
	}
	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	

}
