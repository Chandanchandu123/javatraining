package com.cruds.test;

import java.util.List;

import com.cruds.db.StudentDAO;
import com.cruds.demo.Address;
import com.cruds.demo.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
	
		/*Address addr = new Address("1A Cross", "Tumkur", "572102");
		Student s = new Student(113, "Praveen");
		s.setAddress(addr);
		System.out.println(s);
		StudentDAO dao = new StudentDAO();
		dao.create(s);
		/*Address addr2 = new Address("Chickpete", "Tumkur", "572101");
		Student s2 = new Student(333, "Chethan",addr2);
		System.out.println(s2);
		/*StudentDAO dao = new StudentDAO();
		if(dao.delete(777)){
			System.out.println("delete successfull");
		}
		else{
			System.out.println("Record not found");
		}
		/*Student s1 = new Student(777, "Kumar");
		dao.update(s1);
		/*Student s = dao.getStudent(777);
		System.out.println(s);*/
		StudentDAO dao = new StudentDAO();
		
		Student s1 = new Student(106, "Kumar");
		dao.update(s1);
		List<Student> list = dao.getAllStudents();
		for(Student s : list)
		{
			System.out.println(s);
		}
		/*
		Student s1 = new Student(888, "Chandan");
		
		if(dao.create(s1))
		{
			System.out.println("Student create successfully");
		}*/
		}
}
