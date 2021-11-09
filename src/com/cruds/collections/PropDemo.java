package com.cruds.collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("KAR","BLR");
		prop.put("MH", "MUM");
		prop.put("TN", "CHN");
		
		System.out.println(prop.get("KAR"));
		System.out.println(prop.getProperty("AP", "Not Found"));
		
		try {
			prop.store(new FileOutputStream("capitals.properties"), "State Caps");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
