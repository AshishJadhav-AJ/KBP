package mydbproject.home.book.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import mydbproject.home.book.Book;

public class Database {
	public static void save(ArrayList<Book> list) {
		Connection co = Connect.getConnect();
		
		try {
			PreparedStatement ps = co.prepareStatement("insert into books(bookid,bookname,bookauthor)values(?,?,?)");
			
			int ab=0;
			for(Book bk : list) {
				int bookId = bk.getBookId();
				String name= bk.getBookName();
				String author= bk.getAuthor();
				ps.setInt(1, bookId);
				ps.setString(2, name);
				ps.setString(3, author);
				int data =ps.executeUpdate();
				ab =ab + data;
			}
			System.out.println(ab+" inserted");
		
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
