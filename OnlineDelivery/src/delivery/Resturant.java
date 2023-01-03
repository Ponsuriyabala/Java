package delivery;
public class Resturant {
	private int id;
	private String name;
	private String email;
	private String address;
	private String contact;
	private String location;
	public Resturant(String name,String contact, String email, String address,String location) {
		this.name = name;
		this.email=email;
		this.address = address;
		this.contact = contact;
		this.location=location;
	}
	public Resturant(int id,String name,String email, String address, String contact,String location) {
		this.name = name;
		this.id=id;
		this.email=email;
		this.address = address;
		this.contact = contact;
		this.location=location;
	}
	public Resturant(String location) {
		this.location=location;
	}
	public int getId() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
