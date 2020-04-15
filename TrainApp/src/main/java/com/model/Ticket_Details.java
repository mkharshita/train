package com.model;

public class Ticket_Details 
{
	private int tNo;
	private String name;
	private String source;
	private String destination;
	private int fare;
	public Ticket_Details(int tNo, String name, String source, String destination, int fare) {
		super();
		this.tNo = tNo;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
	}
	public int gettNo() {
		return tNo;
	}
	public void settNo(int tNo) {
		this.tNo = tNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	
	
}
