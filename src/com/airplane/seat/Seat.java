package com.airplane.seat;

import com.airplane.passenger.Passenger;

public class Seat {
  
	private String seatType;
	private String seatNo;
	private Passenger passenger;
	private boolean isSeatVacant;
	private int row;
	private int column;

	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public boolean isSeatVacant() {
		return isSeatVacant;
	}
	public void setSeatVacant(boolean isSeatVacant) {
		this.isSeatVacant = isSeatVacant;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	
	
	
}
