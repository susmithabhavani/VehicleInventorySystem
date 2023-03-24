package com.Vehicle;

import java.util.Comparator;

public class SortWithVehicleYear implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		if(v1.getYear() == v2.getYear())
			return 0;
		else if(v1.getYear()>v2.getYear())
			return 1;
		else
			return -1;

	
		
	}

}
