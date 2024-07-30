 package SONG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SONG {
	private  ArrayList a=new ArrayList();
	 
	public void setA(List n) {
		a.add(n);
	}

	public void Remove(int b) {
		a.remove(b);
	}
	public  Object getA(int b) {
		return this.a.get(b);
	}
	public boolean empty() {
		boolean b=a.isEmpty();
	return b;
	}
	public int size() {
		return a.size();
	}
	public ArrayList AllSong() {
		HashSet z=new HashSet();
		z.addAll(this.a);
		ArrayList c=new ArrayList();
		c.addAll(z);
		return c;
	}
	public void Removesong(int REM) {
		a.remove(REM);
	}
	public void edit(int f,String x) {
		a.set(f, x);
	}
}
