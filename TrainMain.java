package com.waitandnotify.main;
import com.waitandnotify.resource.Train;
import com.waitandnotify.thread.Passenger;
import com.waitandnotify.thread.Platform;

public class TrainMain {
	public static void main(String[]args)
	{
		Train train = new Train();
		
		Passenger passenger =new Passenger(train);
		Platform platform =new Platform(train);
		
		passenger.start();
		platform.start();
	}

}
