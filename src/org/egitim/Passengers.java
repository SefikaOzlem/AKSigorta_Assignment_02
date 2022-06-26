package org.egitim;

public class Passengers {
	
	private int passengerId;
	private String passengerName;
	private long phoneNumber;
	
	public Passengers(int passengerId, String pssngrName,long phoneNumber) {
		this.passengerId=passengerId;
		this.passengerName=pssngrName;
		this.phoneNumber=phoneNumber;
	}

	int getPassengerId() {
		return passengerId;
	}

	String getPassengerName() {
		return passengerName;
	}

	long getPhoneNumber() {
		return phoneNumber;
	}

	
	

}
