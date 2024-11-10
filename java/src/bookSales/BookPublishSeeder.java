package bookSales;

import java.util.ArrayList;
import java.util.List;

public class BookPublishSeeder {
	
    public static List<BookPublish> seedPublishes() {
        List<BookPublish> publishes = new ArrayList<>();
        
        BookPublish book1 = new BookPublish();
        book1.setBookTitle("YoungAuthorShortBookLittleAd");
        book1.setAuthorAge(25);
        book1.setBookPageCount(213);
        book1.setAdExpenses(2000.0f);
        publishes.add(book1);

        BookPublish book2 = new BookPublish();
        book2.setBookTitle("MidAgedAuthorLongBookMidAd");
        book2.setAuthorAge(43);
        book2.setBookPageCount(990);
        book2.setAdExpenses(8000.0f);
        publishes.add(book2);

        BookPublish book3 = new BookPublish();
        book3.setBookTitle("OldAuthorLongBookBigAd");
        book3.setAuthorAge(68);
        book3.setBookPageCount(600);
        book3.setAdExpenses(15000.0f);
        publishes.add(book3);
        
        BookPublish book4 = new BookPublish();
        book4.setBookTitle("VeryOldAuthorShortBookLittleAd");
        book4.setAuthorAge(90);
        book4.setBookPageCount(100);
        book4.setAdExpenses(500.0f);
        publishes.add(book4);

        BookPublish book5 = new BookPublish();
        book5.setBookTitle("MidAgedAuthorMediumBookLittleAd");
        book5.setAuthorAge(52);
        book5.setBookPageCount(370);
        book5.setAdExpenses(200.0f);
        publishes.add(book5);
        
        BookPublish book6 = new BookPublish();
        book6.setBookTitle("Harry Potter and the Philosopher's Stone");
        book6.setAuthorAge(33);
        book6.setBookPageCount(309);
        book6.setAdExpenses(75000.0f);
        publishes.add(book6);
        
        return publishes;
    }
}
