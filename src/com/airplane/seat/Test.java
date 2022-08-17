package com.airplane.seat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.airplane.passenger.Passenger;
import com.airplane.passenger.PassengerService;
import com.airplane.seat.comparator.ChainComparator;
import com.airplane.seat.comparator.SeatNumberComparator;
import com.airplane.seat.comparator.SeatTypeComparator;

public class Test {

	public static void main(String[] args) {
		SeatLayout obj = new SeatLayout();
		int[][] arr = {{3,2},
				       {4,3}, 
				       {2,3}, 
				       {3,4}};

		List<Seat[][]> layout = obj.FillSeatsInTheLayout(arr, obj);
		System.out.println("Seat Layout with default seat numbers");
		System.out.println("-------------------------------------");
		for(Seat[][] seatArr : layout)
		{
			obj.printSeatArray(seatArr);
			System.out.println("--------------------");
			
		}
		
		List<Seat> seatList = obj.getSeatList();
		
		List<Comparator<Seat>> comparatorsList = new ArrayList<>();
		comparatorsList.add(new SeatTypeComparator());
		comparatorsList.add(new SeatNumberComparator());
		
		seatList.sort(new ChainComparator(comparatorsList));
		
		System.out.println("Sorted Seat List");
		System.out.println("-----------------------");
		for(Seat s : seatList)
		{
			System.out.print(s.getSeatNo() + " ");
		}
		System.out.println();
		
		PassengerService service = new PassengerService();
		List<Passenger> passengers = service.createPassengers(5);
		SeatAllocationService.allotSeatsToPassengers(seatList, passengers);
		
		System.out.println();
		System.out.println("Available Seat List after allocation");
		System.out.println("------------------------------------");
		if(seatList.isEmpty())
		{
			System.out.println("All seats are allotted");
		}
		else
		{
			for(Seat s : seatList)
			{
				System.out.print(s.getSeatNo() + " ");
			}			
		}	
		System.out.println();
		
		System.out.println();
		System.out.println("List of Passengers with their allotted seats");
		System.out.println("--------------------------------------------");
		for(Passenger p: passengers)
		{
			if(p.getSeat()!= null)
			{
				System.out.print(p.getName() + "->" + p.getSeat().getSeatNo()+ " ");
			}			
		}
		
	}

}
