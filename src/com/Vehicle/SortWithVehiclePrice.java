package com.Vehicle;

import java.util.Comparator;

public class SortWithVehiclePrice implements Comparator<Vehicle> {
	 

		@Override
		public int compare(Vehicle v1, Vehicle v2) {
			
			if(v1.getPrice() == v2.getPrice())
			return 0;
			else if(v1.getPrice()>v2.getPrice())
				return 1;
			else
				return -1;
		}

	}

