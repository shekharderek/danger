package com.npst;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "input")
public class Input {

	SessionContext SessionContextObject;
	private String MobileNo;
	private String CustomerID;
	private String AccountNumber;
	private String Operation;
	private String Service;

	public SessionContext getSessionContextObject() {
		return SessionContextObject;
	}

	public void setSessionContextObject(SessionContext sessionContextObject) {
		SessionContextObject = sessionContextObject;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getOperation() {
		return Operation;
	}

	public void setOperation(String operation) {
		Operation = operation;
	}

	public String getService() {
		return Service;
	}

	public void setService(String service) {
		Service = service;
	}
}
