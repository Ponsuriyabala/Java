package delivery;
public class User {
	private int id;
	private String name;
	private String address;
	private String email;
	private String contact;
	private String password;
	public User(String name, String contact,String address, String email, String password) {
		this.name=name;
		this.contact=contact;
		this.address=address;
		this.email=email;
		this.password=password;
	}
	public User(int id, String name, String contact) {
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public int  getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
