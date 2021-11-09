package com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cruds.demo.Book;

public class BookDAO {

	public List<Book> getAllBooks()
	{
		String sql = "select title,price,id from book";
		List<Book>list = new ArrayList<>();
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs !=null && rs.next())
			{
				Book b = new Book(rs.getString(1), rs.getDouble(2), rs.getInt(3));
				list.add(b);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}


	public boolean create(Book book)
	{
		String sql = "insert into book(title,price,id) values(?,?,?)";
		int rows = 0;
		
		try(Connection conn = DBConnectionManager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, book.getTitle());
			ps.setDouble(2, book.getPrice());
			ps.setInt(3, book.getId());
			
			rows = ps.executeUpdate();
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rows > 0;
	}
}
