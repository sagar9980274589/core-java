import java.util.ArrayList;

class Library  {
	
 private ArrayList<Book> books;
 private ArrayList<User> users;
 
	 public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
	
	public void addBook(int bookId,String authorName,String title){
		Book newbook = new Book(bookId,authorName,title);
		books.add(newbook);
		System.out.println("Book added Sucessfully");
	}
	public void addStudent(int userId,String userName){
		User newUser = new Student(userName,userId);
		users.add(newUser);
		System.out.println("Student added Sucessfully");
	}
	public void displayBooks(){
		for(Book book : books){
			book.getTitle();
		}
	}
	public void displayUsers(){
		for(User user : users){
			user.getName();
		}
	}
	
}