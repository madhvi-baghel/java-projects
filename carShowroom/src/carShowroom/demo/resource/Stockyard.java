package carShowroom.demo.resource;

public class Stockyard {
private static int noOfCarsavailable =10;
private static int a;

public static int getNoOfCarsavailable() {
	return noOfCarsavailable;
}

public static void setNoOfCarsavailable(int noOfCarsavailable) {
	Stockyard.noOfCarsavailable = noOfCarsavailable;
}
public void makecars(int a) {
	
	System.out.println("Preparing "+a+"cars");
	this.noOfCarsavailable+=a;
	System.out.println("Available Cars :"+a);
}

public void order(int a) {
	if(a>this.noOfCarsavailable) {
		System.out.println("Manufacturing is in process.");
		this.makecars(a);
	}
	this.noOfCarsavailable-=a;
}

}
