package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.cruds.demo.Student;
import com.cruds.exception.StudentException;

public class StudentDAO {
	
	
	public Vector<Vector<String>> getTableData()
	{
		String sql = "select Rollno,name from student";
		Vector<Vector<String>>data = new Vector<>();
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			Vector<String> row = null; //efficiency sake
			while(rs !=null && rs.next())
			{
				row = new Vector<>();
				row.add(String.valueOf(rs.getInt(1)));
				row.add(rs.getString(2));
				data.add(row);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return data;
	}


	public Student getStudent(int Rollno)
	{
		String sql = "select Rollno,name from student where Rollno = ?";
		Student s = null;

		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Rollno);

			ResultSet rs = ps.executeQuery();
			if(rs !=null && rs.next())
			{
				s = new Student(rs.getInt(1), rs.getString(2));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return s;
	}

	public List<Student> getAllStudents()
	{
		String sql = "select Rollno,name from student";
		List<Student>list = new ArrayList<>();

		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs !=null && rs.next())
			{
				Student s = new Student(rs.getInt(1), rs.getString(2));
				list.add(s);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}

	public boolean create(Student student)
	{
		String sql = "insert into student(Rollno,name) values (?,?)";
		String sql2 = "insert into address(street,city,pincode,Rollno) values (?,?,?,?)";
		int rows = 0;

		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getRollNo());
			ps.setString(2, student.getName());

			rows = ps.executeUpdate();
			if(student.getAddress() != null)
			{
				PreparedStatement ps2 = conn.prepareStatement(sql2);
				ps2.setString(1, student.getAddress().getStreet());
				ps2.setString(2, student.getAddress().getCity());
				ps2.setString(3, student.getAddress().getPincode());
				ps2.setInt(4, student.getRollNo());

				rows = ps2.executeUpdate();
			}
			} catch (SQLException e) {
				//e.printStackTrace();
				if(e.getMessage().contains("Duplicate"))
				{
					throw new StudentException(student.getRollNo() + "already exists" );
				}
				else{
					throw new StudentException("DB Error during create, contact Admin");
				}
			}
			return rows > 0;
		}

		public boolean delete(int Rollno)
		{
			String sql = "delete from student where Rollno = ?";
			int rows = 0;

			try(Connection conn = DBConnectionManager.getConnection())
			{
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, Rollno);
				rows = ps.executeUpdate();
			}catch (SQLException e){
				e.printStackTrace();
			}
			return rows > 0;
		}
		public boolean update(Student s)
		{
			String sql = "update student set name = ? where Rollno = ?";
			int rows = 0;

			try(Connection conn = DBConnectionManager.getConnection())
			{
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, s.getName());
				ps.setInt(2, s.getRollNo());

				rows = ps.executeUpdate();
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return rows > 0;
		}
	}