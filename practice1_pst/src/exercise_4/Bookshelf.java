package exercise_4;

import java.util.GregorianCalendar;
import java.util.Locale;

public class Bookshelf {

	public static void main(String[] args) {		
		GregorianCalendar dateBook1 = new GregorianCalendar(2015,4,28);
		GregorianCalendar dateBook2 = new GregorianCalendar(2006,12,10);

		Book book1 = new Book("Leaving Time","Jodi Picoult","BALLANTINE BOOKS", dateBook1);
		Book book2 = new Book("Three", "Ted Dekker","Thomas Nelson",dateBook2);

		System.out.println(book1.toString());
		System.out.println(book2.toString());

	}

}
