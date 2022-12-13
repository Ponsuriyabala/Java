package deliveryServlet;

public class objectHotel {
	private int id;
	private int uid;
	private int d_id;
	private int amt;
	private int price;
	private String menuname;
	private String amt_type;
	private String uname;
	private String name;
	private String d_number;
	private String phoneno;
	private String address;
	private String location;
	objectHotel(int id,String name,String phoneno,String address,String location){
		this.id=id;
		this.name=name;
		this.phoneno=phoneno;
		this.address=address;
		this.location=location;
	}
	objectHotel(int id,String name,String phoneno,String address){
		this.id=id;
		this.name=name;
		this.phoneno=phoneno;
		this.address=address;
	}
	public objectHotel(int id, String amt_type, int amt, int uid, String uname, int d_id, String d_number) {
		this.id=id;
		this.amt_type=amt_type;
		this.amt=amt;
		this.uid=uid;
		this.uname=uname;
		this.d_id=d_id;
		this.d_number=d_number;
	}
	public objectHotel(String menuname,int price){
		this.menuname=menuname;
		this.price=price;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getAmt_type() {
		return amt_type;
	}
	public void setAmt_type(String amt_type) {
		this.amt_type = amt_type;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getD_number() {
		return d_number;
	}
	public void setD_number(String d_number) {
		this.d_number = d_number;
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
}
