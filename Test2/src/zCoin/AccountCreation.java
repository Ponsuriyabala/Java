package zCoin;

import java.util.Scanner;

public class AccountCreation {
	private int id;
	private String name;
	private String emailId;
	private String phNumber;
	private String hid;
	private String password;
	private double initialDeposit;

	public AccountCreation(int id,String name, String emailId, String phNumber, String hid, String password,
			double initialDeposit) {
		this.id=id;
		this.name = name;
		this.emailId = emailId;
		this.phNumber=phNumber;
		this.hid=hid;
		this.password=password;
		this.initialDeposit=initialDeposit;
	}
	public AccountCreation(String name, String emailId, String phNumber, String hid, String password,
			double initialDeposit) {
		this.name = name;
		this.emailId = emailId;
		this.phNumber=phNumber;
		this.hid=hid;
		this.password=password;
		this.initialDeposit=initialDeposit;
	}

	public AccountCreation(String name, String emailId, String phNumber, String hid, String password) {
		this.name = name;
		this.emailId = emailId;
		this.phNumber=phNumber;
		this.hid=hid;
		this.password=password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getNumber() {
		return phNumber;
	}

	public void setNumber(String number) {
		this.phNumber = number;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	protected void register() {
		DB entry=new DB();
		try{
			System.out.println(name);
			entry.register(name, emailId, phNumber, hid, password,initialDeposit);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void userOption() {
		Scanner in=new Scanner(System.in);
		Options user=new Options();
		int choice=1;
		while(choice!=0) {
			System.out.println("1.Transaction Histroy\n2.Deposit\n3.Withdrawal");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				user.personTrans(id);
				break;
			case 2:
				
				break;
			}
		}
	}

	public void adminOption() {
		Scanner in=new Scanner(System.in);
		Options user=new Options();
		int choice=1;
		while(choice!=0) {
			System.out.println("1.ViewTransaction\n2.\n");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				user.viewTransaction();
				break;
			case 2:
				
				break;
			}
		}
	}
}

