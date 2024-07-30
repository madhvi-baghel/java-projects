package com.jspiders.train.main;

import java.util.Scanner;

import com.jspiders.train.main.resources.Passanger;
import com.jspiders.train.main.resources.Ticket;
import com.jspiders.train.main.resources.Train;

public class TrainDriver {
	
	static Train t1 = new Train(54321);
	Passanger p1=new Passanger();
	static Ticket ti1=new Ticket();
	
//	System.out.println("Train number :"+t1.journeyDetails());
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean a =true;
		
		while (a==true) {
			System.out.println("Welcome to Indian Railways \n"
					 +"1. Add Passanger  \n"
					   +"2. Book Ticket \n"
					   +"3. Cancel Ticket \n"
					   +"4. Change Destination \n"
					   +"5. Change Boarding \n"
					   +"6. exit");
			int choose=sc.nextInt();
			
			switch (choose) {
			case 1:
				System.out.println("Train number :"+t1.journeyDetails());
				break;
            case 2:
				
				break;
            case 3:
				
				break;
            case 4:
            	break;
            case 5:
            	ti1.setDestination("abc");
            	System.out.println(ti1.getBoarding());
            	break;
            case 6:
            	System.out.println("Thankyou");
            	a=false;
            	break;
			default:
				System.out.println("Invalid input");
				break;
			}
			
		}
	}
	

}
