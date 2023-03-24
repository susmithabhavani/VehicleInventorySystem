package com.VehicleInventorySystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.User.User;
import com.User.UserImpl;
import com.Vehicle.SortWithVehiclePrice;
import com.Vehicle.SortWithVehicleYear;
import com.Vehicle.Vehicle;
import com.Vehicle.Vehicleimpl;



public class VehicleInventorySystem {

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		System.out.println("please signup with your details");
		System.out.println("please enter your firstName");
		String firstName = sc.next();
		System.out.println("please enter your secondName");
		String secondName = sc.next();
		System.out.println("please enter your userName");
		String userName = sc.next();
		System.out.println("please enter your password");
		String password = sc.next();
		System.out.println("Thankyou ...Your Registration is Success");
		User user = new User(firstName,secondName,userName,password);
		UserImpl uimpl = new UserImpl();
		uimpl.newUser(user);
		ArrayList<User> userArrayList = new ArrayList<User>(uimpl.userLinkedList);
		
		LinkedList<Vehicle> vehicleLinkedList = new LinkedList<Vehicle>();
		
		Vehicleimpl vimpl = new Vehicleimpl();
		Vehicle vehicle1 = new Vehicle("Toyota",2019,10000.99);
		Vehicle vehicle2 = new Vehicle("Suziki",2020,8000.99);
		Vehicle vehicle3 = new Vehicle("Benz",2018,9000.99);
		Vehicle vehicle4 = new Vehicle("Kia",2022,12000.99);
		vimpl.addVehicle(vehicle1);
		vimpl.addVehicle(vehicle2);
		vimpl.addVehicle(vehicle3);
		vimpl.addVehicle(vehicle4);
		ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>(vimpl.vehicleLinkedList);
		Iterator<Vehicle> it = vehicleArrayList.iterator();
        while(it.hasNext())
        {
       	 Vehicle v = it.next();
       	 System.out.println(v.getVname()+" "+v.getYear()+" "+v.getPrice());
        }
        System.out.println("please enter your login details");
        System.out.println("please enter your userName");
        String userName1 = sc.next();
        System.out.println("please enter your password");
        String password1 = sc.next();
        if(uimpl.userLogin(userName1,password1))
        {
            System.out.println("Welcome to Autoshop World");
        }
        else
        {
            System.out.println("Sorry... please Login with Login Credentials");
        }
        
        System.out.println("after sorting based on price");
           Collections.sort(vehicleArrayList, new SortWithVehiclePrice());
           for(Vehicle v:vehicleArrayList)
           {
               System.out.println(v.getVname()+" "+v.getYear()+" "+v.getPrice());
           }
           System.out.println("after sorting based on manufracturing year");
           Collections.sort(vehicleArrayList, new SortWithVehicleYear());
           for(Vehicle v:vehicleArrayList)
           {
               System.out.println(v.getVname()+" "+v.getYear()+" "+v.getPrice());
       }

   }
   
	}


