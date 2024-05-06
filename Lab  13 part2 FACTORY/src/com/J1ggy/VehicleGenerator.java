package com.J1ggy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleGenerator {
	
	public  static List <Vehicle> Vehicles = new ArrayList<Vehicle>();
	
	//--Constructor----------------------------------------------------------------
		public VehicleGenerator() {
		super();
		}

//--Methods -------------------------------------------------------------------------

public void addVehicles(RegListGenerator RegList){//Generates Vehicles takes a RegListGenerator passed as parameter from Motorway
	for (int i = 0 ; i < RegList.getListSize(); i++) { 
		Random rand = new Random();// Object to create a Random number
		int lane; // variable to hold the current integer of a lane
		lane = rand.nextInt(3)+1;// Add vehicles to a Random lane between 1 & 3
		switch(i) {
		case 0 :
			Vehicles.add( new Car(RegList.RegNos.get(0),lane ));
			break;
		case 1 :
			Vehicles.add(new Van(RegList.RegNos.get(1),lane));
			break;
		case 2 :
			Vehicles.add(new Lorry(RegList.RegNos.get(2),lane));
			break;
		case 3 :
			Vehicles.add(new Motorbike(RegList.RegNos.get(3),lane));
			break;
		case 4 :
			Vehicles.add(new Racing_Car(RegList.RegNos.get(4),lane));
			break;
		case 5 :
			Vehicles.add(new Car(RegList.RegNos.get(5),lane));
			break;
		case 6 :
			Vehicles.add(new Van(RegList.RegNos.get(6),lane));
			break;
		case 7 :
			Vehicles.add(new Lorry(RegList.RegNos.get(7),lane));
			break;
		case 8 :
			Vehicles.add(new Motorbike(RegList.RegNos.get(8),lane));
			break;
		case 9 :
			Vehicles.add(new Racing_Car(RegList.RegNos.get(9),lane));
			break;
		default :
			System.out.println("No vehicle created");
		}
		 System.out.print("We have captured: " + Vehicles.size() + " vehicles\n");
	}
}
}

