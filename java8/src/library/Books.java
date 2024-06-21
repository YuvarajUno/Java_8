package library;

public class Books 
{
	private String bookName;
	private String author;
	private int copies;
	
	public Books(String bookName,String author,int copies)
	{
		this.bookName = bookName;
		this.author   = author;
		this.copies   = copies;
	}
	
	Books()
	{
		
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;
	}

	public int getCopies() {
		return copies;
	}
	
	@Override
	public String toString() {
		return bookName + " " + author + "  " + copies;
	}
	

	
}
