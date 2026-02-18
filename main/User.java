import java.util.ArrayList;
public abstract class User {

    protected int userId;
    protected String name;
    protected String role;
    protected ArrayList<Book> borrowedBooks;
    public User(String name, int userId, String role) {
        this.name = name;
        this.userId = userId;
        this.role = role;
		this.borrowedBooks= new ArrayList<>();
		System.out.println("user created sucessfully");
    }
	public void getName(){
		
		System.out.println(this.name);
	}
	public void borrowBook(Book book){
		
		borrowedBooks.add(book);
		
		System.out.println("Book borrowed"+book.getId());
		
	}
	public void returnBook(Book book){
			borrowedBooks.remove(book);
		System.out.println("Book Returned"+book.getId());
	}
	public int getId() {
        return userId;
    }
}
