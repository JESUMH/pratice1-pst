package exercise_4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Book {
	
	private String title;
	private String author;
	private String editorial;
	private GregorianCalendar publishDate;
	
	public Book (String title, String author, String editorial, GregorianCalendar publishDate) {
		this.title = title;
		this.author = author;
		this.editorial = editorial;
		this.publishDate = publishDate;
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public GregorianCalendar getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(GregorianCalendar publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		String year = publishDate.getDisplayName(Calendar.YEAR, Calendar.SHORT, Locale.getDefault());
		String month = publishDate.getDisplayName(Calendar.MONTH, Calendar.SHORT,Locale.getDefault());
		String day = publishDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault());
		
		return "Book [title=" + title + ", author=" + author + ", editorial=" + editorial + ", publishDate="
				+ year + "-" + month + "-" + day + "]";
	}
	
	

}
