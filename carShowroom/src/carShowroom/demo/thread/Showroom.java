package carShowroom.demo.thread;

import carShowroom.demo.resource.Stockyard;

public class Showroom extends Thread{
	
Stockyard stockyard;	

@Override
	public void run() {
	System.out.println("Ordering "+15+"cars.");
	stockyard.order(15);
	}

public Showroom(Stockyard stockyard) {
	super();
	this.stockyard = stockyard;
}
}
