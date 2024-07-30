package carShowroom.demo.Main;

import carShowroom.demo.resource.Stockyard;
import carShowroom.demo.thread.Factory;
import carShowroom.demo.thread.Showroom;

public class Carsmain {
public static void main(String[] args) {
	Stockyard stockyard=new Stockyard();
	Factory factory = new Factory(stockyard);
	Showroom showroom=new Showroom(stockyard);
	
}
}
