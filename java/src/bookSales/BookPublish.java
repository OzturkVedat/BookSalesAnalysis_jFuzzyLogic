package bookSales;

public class BookPublish {
	private String bookTitle;
    private int authorAge;
    private int bookPageCount;
    private float adExpenses;

    public String getBookTitle() { return bookTitle; }
    public int getAuthorAge() { return authorAge; }
    public int getBookPageCount() {return bookPageCount;}
    public float getAdExpenses() { return adExpenses; }
    
    public void setBookTitle(String title) { this.bookTitle= title; }    
    public void setAuthorAge(int authorAge) { this.authorAge = authorAge; }
    public void setBookPageCount(int bookPageCount) { this.bookPageCount = bookPageCount; }
    public void setAdExpenses(float adExpenses) { this.adExpenses = adExpenses; }
}
