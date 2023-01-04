package model;
public class DeliveryBoy {
	private String name;
	private String address;
	private String contact;
	private  int id;
	private String time;
	public DeliveryBoy(String name, String contact, String address) {
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	public DeliveryBoy(int id,String name, String contact, String address,String time) {
		this.id=id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.setTime(time);
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
