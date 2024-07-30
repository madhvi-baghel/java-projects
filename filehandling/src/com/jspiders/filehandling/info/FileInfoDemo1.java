package com.jspiders.filehandling.info;

import java.io.File;
import java.io.IOException;

public class FileInfoDemo1 {

	public static void main(String[] args) {
//		File file =new File("Hello.txt");
//		File file =new File("Hello.exe");
//		File file =new File("Hello.html");
//		File file =new File("Hello.doc");
//		File file =new File("Hello.jar");
//		File file =new File("Hello.jpg");
//		File file =new File("Hello.mp3");
//		File file =new File("Hello.png");
//		File file =new File("Hello.pdf");
//		File file =new File("Hello.zip");
		File file =new File("Hello.tmp");
		if(file.exists()) {
			System.out.println("File is already created");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("File created");
			} catch (IOException e) {
				System.out.println("File not created");
				e.printStackTrace();
			}
		}
	System.out.println("Name of file : "+file.getName());
	System.out.println("Path of file : "+file.getAbsolutePath());
    System.out.println("Length of file : "+file.length());
    
    if(file.canRead()) {
    	System.out.println("the file is readable");
    }else {
    	System.out.println("the file is not readable");
    }
    
    if(file.canWrite()) {
    	System.out.println("the file is writable");
    }else {
    	System.out.println("the file is not writable");
    }
    
    if(file.canExecute()) {
    	System.out.println("the file is executable");
    }else {
    	System.out.println("the file is not executable");
    }
}


	}

