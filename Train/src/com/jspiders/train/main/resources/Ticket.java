package com.jspiders.train.main.resources;

public class Ticket {
	
	public static int ticket_no;
	public static String boarding;
	public static String destination;
	public static String journey_date;
	public static int Seatno;
	
	
	public static int getTicket_no() {
		return ticket_no;
	}
	
	public static String getBoarding() {
		return boarding;
	}
	public static void setBoarding(String boarding) {
		Ticket.boarding = boarding;
	}
	public static String getDestination() {
		return destination;
	}
	public static void setDestination(String destination) {
		Ticket.destination = destination;
	}
	public static String getJourney_date() {
		return journey_date;
	}
	public static void setJourney_date(String journey_date) {
		Ticket.journey_date = journey_date;
	}
	public static int getSeatno() {
		return Seatno;
	}
	
	public void ticketDetails() {
		
	}

}
