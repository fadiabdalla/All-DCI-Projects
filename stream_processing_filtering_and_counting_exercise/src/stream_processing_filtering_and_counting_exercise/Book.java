package stream_processing_filtering_and_counting_exercise;

public class Book {
	
	private String name;
	private int publishDate;
	public Book(String name, int publishDate) {
		super();
		this.name = name;
		this.publishDate = publishDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}
	@Override
	public String toString() {
		return "Book name: " + name + ", publishDate : " + publishDate;
	}
	
	
	

}
