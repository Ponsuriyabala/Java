package Banking;
import java.util.ArrayList;
import java.util.Scanner;
public class Customer extends OnlineBank{
	private int cusId=0;
	private long accountNo=10000;
	private String name;
	private int balance;
	private String phoneNo;
	private String password="";
	private ArrayList<AccountStatement> stat=new ArrayList<AccountStatement>();
	Customer(String name, String phoneNo, String password,int number) {
		this.name=name;
		this.phoneNo=phoneNo;
		for(int i=0;i<password.length();i++) {
			int f=(int)password.charAt(i)+1;
			this.password+=(char)f;
		}
		cusId+=number;
		accountNo+=number;
		balance =10000;
	}
	public Customer(int cusId, long accountNo, String name, int balance, String phoneNo, String password) {
		this.cusId = cusId;
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.phoneNo = phoneNo;
		this.password = password;
		}
	public Customer(int cusId, long accountNo, String name, int balance, String phoneNo, String password,ArrayList<AccountStatement> stat) {
		this.cusId = cusId;
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.phoneNo = phoneNo;
		this.password = password;
		this.stat=stat;
	}

	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getpassword() {
		String pass="";
		for(int i=0;i<password.length();i++) {
			int f=(int)password.charAt(i)-1;
			pass+=(char)f;
		}
		return pass;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	protected void banking() {
		Scanner in=new Scanner(System.in);
		int choice=1;
		while(choice!=0) {
			System.out.println("1.ATM WithDrawal\n2.CashDeposit\n3.AccountTransfer\n4.Statement");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter withDrawal Amount");
				int withdrawal=in.nextInt();
				if(withdrawal<balance) {
					balance=withDrawal(withdrawal,balance);
					setBalance(balance);
					AccountStatement withdrawStat=new AccountStatement("Withdrawal",withdrawal,balance);
					stat.add(withdrawStat);
				}
				break;
			case 2:
				System.out.println("Enter deposit Amount");
				int deposit=in.nextInt();
				
				balance=Deposit(deposit,balance);
				setBalance(balance);
				AccountStatement depositStat=new AccountStatement("Deposit",deposit,balance);
				stat.add(depositStat);
				break;
			case 3:
				System.out.println("Enter the transfer account no");
				int transferAccount=in.nextInt();
				System.out.println("Enter the amount");
				int amount=in.nextInt();
				Choice choose=new Choice();
				if(amount<balance) {
					balance-=amount;
					setBalance(balance);
					AccountStatement transferToStat=new AccountStatement("TransferTo'"+transferAccount+"'",amount,balance);
					stat.add(transferToStat);
					choose.AccountTransfer(transferAccount, amount,accountNo);
				}
				else {
					System.out.println("Check bankbalance");
				}
				break;
			case 4:
				System.out.println("Account Number "+ accountNo);
				System.out.println("Account Holder Name "+ name);
				System.out.println("  TransactionType   TransferAmount      Current");
				for(AccountStatement o:stat) {
					System.out.println("  "+o.getTransType()+"              "+o.getAmount()+"             "+o.getBalance());
				}
				}
			
		}
	}
	public ArrayList<AccountStatement> getStat() {
		return stat;
	}
	public void setStat(ArrayList<AccountStatement> stat) {
		this.stat = stat;
	}
}
