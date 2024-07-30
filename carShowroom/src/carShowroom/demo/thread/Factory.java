package carShowroom.demo.thread;

import carShowroom.demo.resource.Stockyard;

public class Factory extends Thread{
	Stockyard stockyard;

	public Factory(Stockyard stockyard) {

		this.stockyard = stockyard;
	}
	
	@Override
	public void run() {
	
	}
	

}
