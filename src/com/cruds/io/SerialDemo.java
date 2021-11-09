package com.cruds.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cruds.demo.Student;

public class SerialDemo {

	public static void main(String[] args) {
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.ser")))
		{
			Student s = new Student(100, "Anil",10000.00,"secret");
			
			os.writeObject(s);
			
			System.out.println("Object Written Successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
