package com.airplane.passenger;

import com.airplane.seat.Seat;

public class Passenger {
	
	private String name;
	private Seat seat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}

}
