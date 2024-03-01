package mydbproject.home.borrower;


public class Borrower {
	private int id;
	private String name;
	private String bookName;
	private int bookid;
	private int fine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public Borrower(int id, String name, String bookName, int bookid, int fine) {
		super();
		this.id = id;
		this.name = name;
		this.bookName = bookName;
		this.bookid = bookid;
		this.fine = fine;
	}
	@Override
	public String toString() {
		return "Borrower [id=" + id + ", name=" + name + ", bookName=" + bookName + ", bookid=" + bookid + ", fine="
				+ fine + "]";
	}
	public Borrower() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	
}
