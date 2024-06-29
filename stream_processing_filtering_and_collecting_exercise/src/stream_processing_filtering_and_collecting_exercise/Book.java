package stream_processing_filtering_and_collecting_exercise;

public class Book {

	private String title;
	private int publishDate;

	public Book(String title, int publishDate) {
		super();
		this.title = title;
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book title: " + title + ", publishDate : " + publishDate;
	}

}
