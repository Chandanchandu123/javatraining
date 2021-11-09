package com.cruds.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		String msg = "Hello world welcome to JAVA Input Output Class";
		byte[] data = msg.getBytes();
		
		try {
			FileOutputStream os = new FileOutputStream("file1.txt");
			os.write(data);
			os.close();
			System.out.println("File written Successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
