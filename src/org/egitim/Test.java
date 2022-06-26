package org.egitim;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Passengers passenger_1=new Passengers(1,"Özlem",507693258);
		Passengers passenger_2=new Passengers(2,"Büþra",505123224);
		Passengers passenger_3=new Passengers(3,"Mert",542758361);
		
	    
	    Car car1=new Car("Toyota");
	    car1.engine.setEngPower(200);
	    System.out.println(car1.getPassengersList());
	    car1.passengersList.add(passenger_1);
	    car1.passengersList.add(passenger_2);
	    car1.display();
	    
	    System.out.println();
	    Car car2=new Car("Opel");
	    car2.engine.setEngPower(250);
	  //  System.out.println("Eng Type (Test Classta çaðrýlma): " +car2.engine.getEngType());
	    car2.passengersList.add(passenger_3);
	    car2.display();
	  
	}
	


}
