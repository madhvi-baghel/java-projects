package SONG;

import java.util.Scanner;

 public class music_player {
	private static boolean loop=true;
	private static int choose;
	private static Scanner scan=new Scanner(System.in);
	private static OPERATIONS operate = new OPERATIONS();
	
	
	public static void main(String[] args) {
	MusicPlayer();	
	System.out.print("Thank you!!!");
	}
	public static void MusicPlayer() {
		while (loop) {
			System.out.println("~~~~~~~~~~MENU~~~~~~~~~~");			
			System.out.println("1:PLAY SONG"); 			
			System.out.println("2:ADD/REMOVE SONG");			
			System.out.println("3:EDIT SONGS");			
			System.out.println("4:EXIT");
			choose = scan.nextInt();
			
			switch (choose) {
			case 1: {
				while (loop) {
				System.out.println("1:PLAY ALL SONG"); 			
				System.out.println("2:CHOOSE SONG TO PLAY");			
				System.out.println("3:PLAY RANDOM SONG");			
				System.out.println("4:GO BACK");
				choose = scan.nextInt();
				switch (choose) {
				case 1: {
					operate.playallsong();
					break;
				}
				case 2: {
					operate.choosesong();
					break;
				}
				case 3: {
					operate.randomsong();
					break;
				}
				case 4: {
					MusicPlayer();
					break;
				}
				default:{
					System.out.println("3invalid input");
				}
			  }//INNER SWITCH
			}//INNER CASE 1 LOOP
		}//MAIN CASE 1
		
			case 2:{
				while (loop) {
				System.out.println("1:REMOVE SONG"); 			
				System.out.println("2:ADD SONG");			
				System.out.println("3:GO BACK");
				choose = scan.nextInt();
				
				switch (choose) {
				case 1: {
					
					operate.removesong();
					break;
				}
				case 2: {
					operate.addsong();
					break;
				}
				case 3: {
					MusicPlayer();
					break;
				}
				default:{
					System.out.println("invaid input");
				}
				}//case 2 inner switch 
			  }//case 2
			}//inner case2 loop
			case 3: {
				while (loop) {				
				System.out.println("1:SINGER"); 			
				System.out.println("2:ALBUM");			
				System.out.println("3:DURATION");			
				System.out.println("4:GO BACK");
				choose = scan.nextInt();
				switch (choose) {
				case 1: {
					
					operate.editsong();
					break;
				}
				case 2: {
					operate.editsong();
					break;
				}
				case 3: {
					
					operate.editsong();
					break;
				}
				case 4: {
					
					MusicPlayer();
					break;
				}
				default:{
					System.out.println("invalid input");
				}
			  }//INNER SWITCH
			}//INNER CASE 3 LOOP
		}//MAIN CASE 3
			case 4:{
				loop=false;
				return;
			}
			
		  }//OUTER SWITCH CASE
		}//WHILE LOOP	
	}//MUSIC PLAYER METHOD
}
