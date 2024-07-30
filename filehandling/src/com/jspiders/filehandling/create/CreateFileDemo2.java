package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

class CreateFileDemo2 {

	public static void main(String[] args) {
		
		File file =new File("C:/WEJE3/Hello.txt");
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
