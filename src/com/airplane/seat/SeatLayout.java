package com.airplane.seat;

import java.util.ArrayList;
import java.util.List;

public class SeatLayout {
	
	private List<Seat> seatList;
	
	public List<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}

	public List<Seat[][]> FillSeatsInTheLayout(int[][] arr, SeatLayout sl)
	{
		List<Seat[][]> seatLayout2DArrayList = new ArrayList<>();
		List<Seat> seatList = new ArrayList<>();
		int rows = 0;
		int columns = 0;
		int counter = 1;
		
		for(int i=0; i<arr.length; i++)
		{
			rows = arr[i][0];
			columns = arr[i][1];
			Seat[][] seatArray = new Seat[rows][columns];
			
			for(int j=0; j<rows; j++)
			{
				for(int k=0; k<columns; k++)
				{
					Seat seat = new Seat();
					seat.setSeatVacant(true);	
					seat.setPassenger(null);
					if((i==0 && k==0) || (i==arr.length-1 && k==columns-1))
					{
						seat.setSeatType("W");
					}
					else if(null==seat.getSeatType())
					{
						if(k==0 || k==columns-1)
						{
							seat.setSeatType("A");
						}
						else
						{
							seat.setSeatType("C");
						}
					}
					seat.setSeatNo(seat.getSeatType() + counter++);	
					seat.setRow(j);
					seat.setColumn(k);
					seatArray[j][k] = seat;
					seatList.add(seat);
				}				
			}
			seatLayout2DArrayList.add(seatArray);
		}
		sl.setSeatList(seatList);
		return seatLayout2DArrayList;
	}	
	
	public void printSeatArray(Seat[][] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{ 
			for (int j = 0; j < arr[i].length; j++) 
			{ 
				System.out.print(arr[i][j].getSeatNo() + " ");
			}
			System.out.println(); 
		}
	}

}
