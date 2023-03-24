package com.Vehicle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Vehicleimpl implements IVehicle {
	public LinkedList<Vehicle> vehicleLinkedList = new LinkedList<Vehicle>();
	//ArrayList<Vehicle> al = new ArrayList<Vehicle>(li);
	
	/*al.add(new Vehicle("Toyota",2019,10000.99));
	al.add(new Vehicle("Suziki",2020,8000.99));
	al.add(new Vehicle("Benz",2018,9000.99));
	al.add(new Vehicle("Kia",2022,12000.99));*/
	
	 
	
	
	

	@Override
	public void addVehicle(Vehicle vehicle) {
		Vehicle vl = new Vehicle(vehicle.getVname(),vehicle.getYear(),vehicle.getPrice());
		vehicleLinkedList.add(vl);
		
	}

	@Override
	public LinkedList<Vehicle> displayMyVehicle() {
		
		return vehicleLinkedList;
	}

}
