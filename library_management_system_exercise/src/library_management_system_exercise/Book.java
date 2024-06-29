package library_management_system_exercise;

public class Book {
	
	private String title;
	private String author;
	private long iSBN;
	private boolean availabilityStatus = true;
	private LibraryMember borrowedBy;
	
	
	public Book(String title, String author, long iSBN) {
		super();
		this.title = title;
		this.author = author;
		this.iSBN = iSBN;
		this.availabilityStatus = true;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getISBN() {
		return iSBN;
	}

	public void setISBN(long ISBN) {
		this.iSBN = iSBN;
	}
	
	public boolean isAvailable() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(boolean availabilityStatus) {
		
		this.availabilityStatus = availabilityStatus;
		
		
	}
	public LibraryMember getBorrowedBy() {
		return borrowedBy;
	}
	public void setBorrowedBy(LibraryMember borrowedBy) {
		this.borrowedBy = borrowedBy;
	}
}
