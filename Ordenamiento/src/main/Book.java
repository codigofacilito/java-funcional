package main;

public class Book {

	private String title;
	private int copies;
	
	public Book(String title, int copies) {
		this.title = title;
		this.copies = copies;
	}

	public String getTitle() {
		return title;
	}

	public int getCopies() {
		return copies;
	}
	
}
