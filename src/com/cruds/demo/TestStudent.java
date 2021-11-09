package com.cruds.demo;

import com.cruds.exception.StudentException;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s2 = new Student(123, "abc");
		/* try
		 {
			//Student s1 = new Student(101, "abhi");
			//s1.printinfo(); innond try block li baribeku
			Student s2 = new Student(102, " ");
			s2.printinfo();
			
		 } catch(StudentException e)
		 {
			// e.printStackTrace();
			 System.out.println(e.getInfo());
			
		 }
		/*System.out.println(Student.getObjCount());
		
		Student s2 = new Student(102, "Ravi");
		//s2.printinfo();
		System.out.println(Student.getObjCount());
		
		//s1.rollNo = 101;
		//s1.setRollNo(101);
		//s1.setName("Anil");
		
		//System.out.println(s1.getRollNo());
		//System.out.println(s1.getName());
*/
	}

}
