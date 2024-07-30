package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo3 {

	public static void main(String[] args) {
		File file =new File("Hello.txt");
//		File file =new File("Hello.exe");
//		File file =new File("Hello.html");
//		File file =new File("Hello.doc");
//		File file =new File("Hello.jar");
//		File file =new File("Hello.jpg");
//		File file =new File("Hello.mp3");
//		File file =new File("Hello.png");
//		File file =new File("Hello.pdf");
//		File file =new File("Hello.zip");
//		File file =new File("Hello.tmp");
		if(file.exists()) {
          System.out.println("File already exists");
	}else {
		try {
			file.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			System.out.println("File not created");
			e.printStackTrace();
		}
	}

	}

}
