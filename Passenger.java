package com.waitandnotify.thread;
import com.waitandnotify.resource.Train;

public class Passenger extends Thread{
	private Train train;
	
	public Passenger (Train train)
	{
		this.train=train;
	}
	public void run()
	{
		train.bookingTicket(7);
	}

}
