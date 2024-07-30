package com.waitandnotify.thread;

import com.waitandnotify.resource.Train;

public class Platform extends Thread{
	private Train train;
	public Platform(Train train)
	{
		this.train=train;
	}
	public void run()
	{
		train.bookingConform(7);
	}
}
