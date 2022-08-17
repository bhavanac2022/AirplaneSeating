package com.airplane.seat.comparator;

import java.util.Comparator;
import java.util.List;

import com.airplane.seat.Seat;

public class ChainComparator implements Comparator<Seat> 
{
	private List<Comparator<Seat>> comparatorList;
	

	public ChainComparator(List<Comparator<Seat>> comparatorList) {
		super();
		this.comparatorList = comparatorList;
	}


	@Override
	public int compare(Seat s1, Seat s2) 
	{
		int result;
		for (Comparator<Seat> comparator : comparatorList) 
		{
			if ((result = comparator.compare(s1, s2)) != 0) 
			{
				return result;
			}
		}
		return 0;
	}
}