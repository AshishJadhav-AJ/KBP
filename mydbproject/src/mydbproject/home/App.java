package mydbproject.home;

import java.util.Scanner;

import mydbproject.home.book.Operations;
import mydbproject.home.borrower.BorrowerOp;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for books\nPress 2 for borrower");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			Operations.setBooks();
			break;
		case 2:
			BorrowerOp.checkBorrower();
			break;
			
		}
		
	}
}
