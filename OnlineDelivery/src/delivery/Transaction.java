package delivery;
public class Transaction {
	private int paymentid,userid,deliveryboyid,paymentAmount;
	private String username,deliveryboyname,paymentType;
	public Transaction( int userid, int deliveryboyid, String deliveryboyname, int paymentAmount,
			 String paymentType) {
		this.userid = userid;
		this.deliveryboyid = deliveryboyid;
		this.paymentAmount = paymentAmount;
		this.username = username;
		this.deliveryboyname = deliveryboyname;
		this.paymentType = paymentType;
	}
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getDeliveryboyid() {
		return deliveryboyid;
	}
	public void setDeliveryboyid(int deliveryboyid) {
		this.deliveryboyid = deliveryboyid;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDeliveryboyname() {
		return deliveryboyname;
	}
	public void setDeliveryboyname(String deliveryboyname) {
		this.deliveryboyname = deliveryboyname;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
}
