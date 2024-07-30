package SONG;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class OPERATIONS {
	private static SONG s = new SONG();
	private static Scanner scan=new Scanner(System.in);

	
	public void playallsong() {
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.getA(i));
		}
	}
	public void choosesong() {
		if (s.empty()==false) {
			System.out.println("CHOOSE TO PLAY SONG");
			for (int i = 0; i < s.size(); i++) {
				System.out.println(s.getA(i));
			}
			
			System.out.println("CHOOSE SONG AND ENTER ID");
			int a=scan.nextInt();
			System.out.println(s.getA(1-a));	
		}
		else {
			System.out.println("NO SONGS PRESENT");
		}
	}
	public void randomsong() {
		ArrayList a=s.AllSong();
		if (a.isEmpty()==false) {
			for (int i = 0; i < a.size(); i++) {
				System.out.println(a.get(i));
			}
		}	
	}
	public void addsong() {
		
		System.out.println("HOW MANY SONGS TOO ADD");
		int z=scan.nextInt();
		
		for (int i = 0; i <z ; i++) {
			ArrayList arr=new ArrayList();
	
			System.out.println("ENTER THE SONG ID");
			int a= scan.nextInt();
			System.out.println("ENTER THE SONG NAME");
			String b=scan.next();
			System.out.println("ENTER THE SINGER NAME");
			String c=scan.next();
			System.out.println("ENTER THE ALBUM NAME");
			String d=scan.next();
			System.out.println("ENTER THE DURATION");
			double e=scan.nextDouble();
			
			arr.add(a);
			arr.add(b);
			arr.add(c);
			arr.add(d);
			arr.add(e);
			arr.add("");	
			try {
				FileOutputStream o=new FileOutputStream("C://use/file.txt"); 
				OutputStreamWriter q=new OutputStreamWriter(o);
				q.write("this is system logs \n");
				q.write(a+"\n");
				q.write(b+"\n");
				q.write(c+"\n");
				q.write(d+"\n" );
				q.write((float)e+"\n");
				q.close();
				o.close();
			} catch (Exception op) {	
			}
			s.setA(arr);	
		}
	}
	public void removesong() {
		if (s.empty()==false) {
			for (int i = 0; i < s.size(); i++) {
				System.out.println(s.getA(i));
			}
			System.out.println("ENTER THE ID OF SONG TO REMOVE");
			int d=scan.nextInt();
			s.Remove(1-d);
			System.out.println("REMOVE SUCCESSFUL");
		}
	}
	public void editsong() {
		ArrayList o=new ArrayList();
		
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.getA(i));
		}
		System.out.println("CHOOSE SONG TO EDIT");
		int m=1-scan.nextInt();
		
		o.addAll( (Collection) s.getA(m));

		
		boolean a=true;
		while(a==true) {
			s.Remove(m);
		System.out.println("1 TO EDIT SINGER");
		System.out.println("2 TO EDIT ALBUM");
		System.out.println("3 TO EDIT DURATION");					
		int x=1+scan.nextInt();
		if (x==2 || x==3) {
			System.out.println("ENTER NEW NAME");
			String z=scan.next();
			o.set(x, z);
			a=false;
		}
		else {
			System.out.println("INVALID INPUT ");
		}
		}
		s.setA(o);					
	}
	

}
