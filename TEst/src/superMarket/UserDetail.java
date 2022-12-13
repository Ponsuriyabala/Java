package superMarket;
public class UserDetail {
	private String userName;
	private String phoneNo;
	private String password;
	public UserDetail(String userName, String phoneNo, String password) {
		super();
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.password = password;
	}
	public UserDetail(String phoneNo, String password) {
		super();
		this.phoneNo = phoneNo;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
