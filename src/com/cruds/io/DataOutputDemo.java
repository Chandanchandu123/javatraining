package com.cruds.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {

	public static void main(String[] args) {
		
		try(DataOutputStream os = new DataOutputStream(new FileOutputStream("student.dat")))
		{
			os.writeInt(101);
			os.writeDouble(3.1415);
			os.writeUTF("Anil");
			System.out.println("File written successfully");
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
