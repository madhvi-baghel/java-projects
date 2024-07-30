package com.jspiders.filehandling.delete;

import java.io.File;

public class DeleteFileDemo1 {

	public static void main(String[] args) {
		
//      File file=new File("Hello.txt");
//		File file =new File("Hello.exe");
//		File file =new File("Hello.html");
//		File file =new File("Hello.doc");
//		File file =new File("Hello.jar");
//		File file =new File("Hello.jpg");
//		File file =new File("Hello.mp3");
//	File file =new File("Hello.png");
//		File file =new File("Hello.pdf");
//		File file =new File("Hello.zip");
		File file =new File("Hello.tmp");
		
		if(file.exists()) {
			file.delete();
			System.out.println("File is deleted");
		}else {
			System.out.println("File does not exists");
		}
	}

}
