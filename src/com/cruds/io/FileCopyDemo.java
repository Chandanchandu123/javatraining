package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
		String sourceFile = "C:/Program Files/Java/jdk1.8.0_65/README.html";
		String destFile = "info.txt";
		//tye with resources
		try (FileInputStream is = new FileInputStream(sourceFile);
				FileOutputStream os = new FileOutputStream(destFile); 	)
		{
			//int size = is.available();
			byte[] data = new byte[is.available()];
			is.read(data);
			os.write(data);
			//os.close();
			System.out.println("File Written Successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
