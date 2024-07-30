public interface Mobile
 {
  void start();
 }

 public class SamsungA51 implements Mobile
 {
	 public void start(){
		 System.out.println("Samsung Mobile is started.");
	 }
 }
public class OnePlus implements Mobile
 {
	 public void start(){
		 System.out.println("OnePlus Mobile is started.");
	 }
 }
 public class Iphone14 implements Mobile
 {
	 public void start(){
		 System.out.println("Iphone Mobile is started.");
	 }
 }
 public class Redmi implements Mobile
 {
	 public void start(){
		 System.out.println("Redmi Mobile is started.");
	 }
 }
 public class Poco implements Mobile
 {
	 public void start(){
		 System.out.println("Poco Mobile is started.");
	 }
 }

 class MobileMain{
	private static boolean loop=true;
	private static Scanner scan;
	private static Mobile mob;

    public static void main(String[] args){
		while(loop){
			try{
				factory().start();
			}catch(NullPointerException e){
				System.out.println("No mobile selected");
		}
	}
	scan.close();
 }
 private static Mobile factory(){
	System.out.println("select Mobile"
		+"\n1. SamsungA51"
		+"\n2. Oneplus"
		+"\n3. Iphone14"
		+"\n4. Redmi"
		+"\n5. Poco");

		scan=new Scanner(System.in);
		int choice=scan.nextInt();
		switch (choice)
		{
		case 1:
		      mob=new SamsungA51();
		      return mob;
		
		case 2:
		      mob=new OnePlus();
		      return mob;
		
		case 3:
		      mob=new Iphone14();
		      return mob;
		
		case 4:
		      mob=new Redmi();
		      return mob;
        case 5:
		      mob=new Poco();
		      return mob;
		
        default:
			loop=false;
		    System.out.println("Invalid Input");
			return null;
		}
 }
 }