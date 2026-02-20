
class Book implements Borrowable {
private int bookId;
private String authorName;
private String title;
boolean isAvailable;

public Book(int bookId,String authorName,String title){
	this.bookId=bookId;
	this.authorName=authorName;
	this.title=title;
	this.isAvailable=true;
	
}

    @Override
    public void borrowBook(int userId, int bookId) {
        System.out.println("Borrowed Book");
    }

    @Override
    public void returnItem(int userId, int bookId) {
        System.out.println("Borrowed Book");
    }
	public void getTitle(){
		System.out.println(this.title);
	}
	public int getId() {
        return bookId;
    }
}
	
	
