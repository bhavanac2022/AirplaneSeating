package com.airplane.seat;

import java.util.List;

import com.airplane.passenger.Passenger;


public class SeatAllocationService {
	
	public static void allotSeatsToPassengers(List<Seat> seatList, List<Passenger> passengerList)
	{
		int noOfPassengers = passengerList.size();
		if(noOfPassengers > seatList.size())
		{
			int no = noOfPassengers - seatList.size();
			for(int i=0; i<no; i++)
			{
				passengerList.remove(passengerList.size()-1);
			}
			noOfPassengers = seatList.size();
		}
		
		while(noOfPassengers > 0 && noOfPassengers <= seatList.size())
		{
			for(Passenger p : passengerList)
			{
				p.setSeat(seatList.get(0));
				seatList.get(0).setSeatVacant(false);
				seatList.get(0).setPassenger(p);
				seatList.remove(0);
				noOfPassengers--;
			}		
		}		
	}

}
