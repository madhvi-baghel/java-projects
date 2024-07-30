//package com.jspiders.multithreadingwaitandnotify.resource;
//
//public class Car {
//private int noOfCar;
//	
//	public synchronized void bookCar(int bookingTicket )
//	{
//		System.out.println("booking:"+bookingTicket+"tickets");
//		if(bookingTicket>noOfCar)
//		{
//		System.out.println(bookingTicket +"tickets not conform");
//		System.out.println("please wait!!");
//		
//		try {
//			this.wait();
//		}
//		catch(InterruptedException f){
//			f.printStackTrace();
//		}
//		}
//		 noOfCar=bookingTicket;
//		 System.out.println("booking:"+bookingTicket+"tickets successfully");
//	}  
//	public synchronized void orderCar(int bookingConform)
//     {
//		 System.out.println("booking"+bookingConform+"tickets");
//		 noOfCar+=bookingConform;
//		 System.out.println( noOfCar+"tickets available");
//		 this.notify();
//		 
//	 }
//		 
//	
//	
//	}
//
//}
