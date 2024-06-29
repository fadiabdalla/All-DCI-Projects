package library_catalog_system_hashset_exercise;

import java.util.Objects;

public class Book {

	private String title;
	private String author;
	boolean isBorrowed;
	
	public Book(String title, String author, boolean isBorrowed) {
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}

	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		
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

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	
	
	
	
}
