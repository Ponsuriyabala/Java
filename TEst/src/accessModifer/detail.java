package accessModifer;
public class detail extends SqlDB{
    String name;
	private String mobileNo;
	private String password;
	detail(String name,String mobileNo,String password){
		this.name=name;
		this.mobileNo=mobileNo;
		this.password=password;
		try {
		update(name,mobileNo,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	detail(String mobileNo,String password){
		this.mobileNo=mobileNo;
		this.password=password;
		try {
		name=loginverify(mobileNo,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public boolean verifyRegister(){
			if(name!=null) 
				return true;		
		return false;
	}
	public String getName() {
		return name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		String mobile=this.mobileNo;
		this.mobileNo = mobileNo;
		try {
			phoneNo(mobileNo,mobile);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	public String encryptMobileno() {
		int len=mobileNo.length();
		String pass="********"+(mobileNo.charAt(len-2))+(mobileNo.charAt(len-1));
		return pass;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		String pass=this.password;
		this.password=password;
		try {
			password(password,pass,mobileNo);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
