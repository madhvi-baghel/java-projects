package com.waitandnotify.resource;
public class Train {
	
	private int noOfTrain;
	
	public synchronized void bookingTicket(int bookingTicket )
	{
		System.out.println("booking:"+bookingTicket+"tickets");
		if(bookingTicket>noOfTrain)
		{
		System.out.println(bookingTicket +"tickets not conform");
		System.out.println("please wait!!");
		
		try {
			this.wait();
		}
		catch(InterruptedException f){
			f.printStackTrace();
		}
		}
		 noOfTrain=bookingTicket;
		 System.out.println("booking:"+bookingTicket+"tickets successfully");
	}  
	public synchronized void bookingConform(int bookingConform)
     {
		 System.out.println("booking"+bookingConform+"tickets");
		 noOfTrain+=bookingConform;
		 System.out.println( noOfTrain+"tickets available");
		 this.notify();
		 
	 }
		 
	
	
	}

