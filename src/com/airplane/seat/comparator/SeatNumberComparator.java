package com.airplane.seat.comparator;

import java.util.Comparator;

import com.airplane.seat.Seat;

public class SeatNumberComparator implements Comparator<Seat>{

	@Override
	public int compare(Seat o1, Seat o2) {
		if(o1.getRow()<o2.getRow()) return -1;
		else if(o1.getRow()>o2.getRow()) return 1;
		return 0;
	}

}
