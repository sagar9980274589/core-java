
public abstract class User {

    protected int userId;
    protected String name;
    protected String role;

    public User(String name, int userId, String role) {
        this.name = name;
        this.userId = userId;
        this.role = role;
		System.out.println("user created sucessfully");
    }
	public void getName(){
		
		System.out.println(this.name);
	}
}
