package Banking;
public class AccountStatement {
	private String transType;
	private int amount;
	private int balance;
	public AccountStatement(String transType, int amount, int balance) {
		this.transType = transType;
		this.amount = amount;
		this.balance = balance;
	}

	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
