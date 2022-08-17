package com.airplane.seat.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.airplane.seat.Seat;

public class SeatTypeComparator implements Comparator<Seat>{

	static Map<String, Integer> ranking = new HashMap<String, Integer>();
	
	static
	{
		ranking.put("A", 0);
		ranking.put("W", 1);
		ranking.put("C", 2);
		
	}
	
	@Override
	public int compare(Seat o1, Seat o2) {
		return (ranking.get(o1.getSeatType())).compareTo(ranking.get(o2.getSeatType()));
	}

}
