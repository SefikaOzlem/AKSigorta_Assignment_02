package org.egitim;

import java.util.ArrayList;
import java.util.List;

public class Car { // Outer class
	
	public Engine engine;  // Arabanýn sahip olduðu motor nesnesi 
	public List<Passengers> passengersList; // arabadaki yolcularýn listesi
    private String carName;
 
	public Car(String name) {
    	
    	this.engine=new Engine("Dizel");  // Car nesnesi oluþturulurken bir tane Engine nesnesi oluþturuluyor.
        passengersList=new ArrayList<Passengers>(); 
       
        this.carName = name;
       
    }

    public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public List<Passengers> getPassengersList() {
		return passengersList;
	}


	public void setPassengersList(List<Passengers> passengersList) {
		this.passengersList = passengersList;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}

	void display(){  // Print to Car object attributes
		 System.out.println("Car Name: " +carName);
		 System.out.println("Engine Type :"+engine.engType+" - Engine Power: "+engine.engPower);
		
		 if(passengersList.size()!=0) {
			 for(int i=0;i<passengersList.size();i++) {
				 System.out.println("Passenger Id: "+passengersList.get(i).getPassengerId()+
						 " - Passenger Name: "+passengersList.get(i).getPassengerName()+
						 " - Passenger PhoneNum.: "+passengersList.get(i).getPhoneNumber());
			 }
		  }
		}  


    class Engine { // inner class
    	
       private  String engType;
       private int engPower;
       
       Engine(String engType){
           this.engType=engType;
       }
       
		public void setEngPower(int engPower) {
			this.engPower = engPower;
		}

		public String getEngType() {
			return engType;
		}

		public void setEngType(String engType) {
			this.engType = engType;
		}

		public int getEngPower() {
			return engPower;
		}
       
       
    }
}