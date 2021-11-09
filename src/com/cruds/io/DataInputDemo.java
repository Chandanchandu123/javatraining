package com.cruds.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputDemo {

	public static void main(String[] args) {
		
		try(DataInputStream is = new DataInputStream(new FileInputStream("student.dat")))
		{
			System.out.println(is.readInt());
			System.out.println(is.readDouble());
			System.out.println(is.readUTF());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}

	}

}
