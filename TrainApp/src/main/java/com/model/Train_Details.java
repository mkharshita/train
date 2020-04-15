package com.model;

public class Train_Details
{
	private int ticketid;
	private String _Class;
	private String source;
	private String destination;
	private int noOfPsg ;
	private int totalAmt;
	private int tno;
	public Train_Details(int ticketid, String class1, String source, String destination, int noOfPsg, int totalAmt,
			int tno) {
		super();
		this.ticketid = ticketid;
		_Class = class1;
		this.source = source;
		this.destination = destination;
		this.noOfPsg = noOfPsg;
		this.totalAmt = totalAmt;
		this.tno = tno;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String get_Class() {
		return _Class;
	}
	public void set_Class(String class1) {
		_Class = class1;
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
	public int getNoOfPsg() {
		return noOfPsg;
	}
	public void setNoOfPsg(int noOfPsg) {
		this.noOfPsg = noOfPsg;
	}
	public int getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	
	
}
