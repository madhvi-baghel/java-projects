//package player;
//import java.util.*;
//public class MusicPlayer {
//     Scanner sc =new Scanner(System.in);
//    static boolean loop=true;
//    Operations operation= new Operations();
//	static int choice;
//
//	public static void main(String[] args) {
//		MyPlayer();
//	}
//	
//	public static void MyPlayer(){
//		while(loop) {
//	    System.out.println("---------MENU--------");
//	    System.out.println("1 Play songs");
//	    System.out.println("2 Add/Remove");
//	    System.out.println("3 Edit");
//	    System.out.println("4 Exit");
//	    choice =sc.nextInt();
//	    
//	    	
//        switch (choice) {
//             case 1: {
//				 while(loop) {
//                    System.out.println("1 Play all songs");
//                    System.out.println("2 Choose song to play");
//                    System.out.println("3 Play random song");
//                    System.out.println("4 Go back");
//                    choice =sc.nextInt();
//                    switch (choice) {
//                    case 1:{
//                        	operation.playAllSongs();
//                            break;
//                        }
//                        case 2: {
//                        	operation.chooseSongToPlay();
//                            break;
//                        }
//                        case 3: {
//                        	operation.playRandomSong();
//                            break;
//                        }
//                        case 4: {
//							MyPlayer();
//                            break;
//                        }
//                        default: {
//                            System.out.println("Invalid choice");
//                        }
//                    }
//                }
//			 }
//			case 2: {
//				while(loop){
//					 System.out.println("1 Add song");
//                     System.out.println("2 Remove song");
//                     System.out.println("4 Go back");
//					 choice = sc.nextInt();
//                     switch (choice) {
// 					case 1: {
//						operation.addsong();
//						break;
// 					}
// 					case 2: {
//						operation.removesong();
//						break;
// 					}
// 					case 3: {
//						MyPlayer();
//						break;
// 					}
//					default: {
//                            System.out.println("Invalid choice");
//                        }
//                    }
//				}    
//			}
//			case 3: {
//				while(loop){
//					 System.out.println("1 Singer");
//                     System.out.println("2 Movies/Album");
//                     System.out.println("3 Duration");
//                     System.out.println("4 Go back");
//					 choice=sc.nextInt();
//                     switch (choice) {
// 					case 1: {
//						operation.editsong();
// 					}
// 					case 2: {
//						
// 					}
// 					case 3: {
// 					}
// 					case 4: {
//						MyPlayer();
//						break;
// 					}
//					default: {
//                            System.out.println("Invalid choice");
//                        }
//                    }
//                }   
//			}
//			case 4: {
//				loop=false;
//				break;
//			}
//			default:
//				System.out.println("Not a valid input");
//			}
//		}
//			
//		}
//	}
//    }
//}