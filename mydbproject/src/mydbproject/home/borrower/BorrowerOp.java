package mydbproject.home.borrower;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import mydbproject.home.book.db.Connect;

public class BorrowerOp {
	public static void checkBorrower() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Borrower name");
		String name = sc.next();
		System.out.println("Enter id");
		int id = sc.nextInt();
		Connection co =Connect.getConnect();
		try {
			Statement st =co.createStatement();
			ResultSet rst = st.executeQuery("SELECT * FROM BORROWER");
			while(rst.next()) {
				int existingId= rst.getInt("userId");
				if(id==existingId) {
					System.out.println("Enter book Id");
					int bookId =sc.nextInt();
					PreparedStatement pst = co.prepareStatement("SELECT * FROM books WHERE bookId=?");
					pst.setInt(1, bookId);
					ResultSet resultset = pst.executeQuery();
					PreparedStatement borrower = co.prepareStatement("UPDATE borrower SET bookname=?, bookid=?, issuedate=? WHERE userid="+existingId+";");
					while(resultset.next()) {
						int ids = resultset.getInt("bookId");
						String bName= resultset.getString("bookname");
						LocalDate date= LocalDate.now();
						Date d = Date.valueOf(date);
						borrower.setString(1, bName);
						borrower.setInt(2, ids);
						borrower.setDate(3, d);
						borrower.executeUpdate();
						System.out.println("Book Issued");
					}
					
				}
				
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

	

	
}
