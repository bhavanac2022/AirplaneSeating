package com.airplane.passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {
	
	public List<Passenger> createPassengers(int number)
	{
		List<Passenger> passengers = new ArrayList<>();
		int counter = 1;
		for(int i =0; i<number; i++)
		{
			Passenger p = new Passenger();
			p.setName("P" + counter++);
			passengers.add(p);
		}
		return passengers;
		
	}

}
