package zCoin;

import java.util.Scanner;

import Banking.Customer;

public class Index {
	static Scanner in=new Scanner(System.in);
	void entry() {
		int choice=1;
		while(choice!=0) {
			System.out.println("1.Register\n2.Login\n");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				Register();
				break;
			case 2:
				login();
				break;
			}
		}
	}
	private void Register() {
		System.out.println("Enter Full Name");
		String name=in.next();
		System.out.println("Enter Email ID");
		String emailid=in.next();
		System.out.println("Enter User Mobile Number");
		String phoneNo=in.next();
		System.out.println("Enter PanCard Number");
		String hid=in.next();
		System.out.println("Enter Strong password");
		String password=in.next();
		System.out.println("Enter Initail Deopsit");
		double deposit=in.nextDouble();
		AccountCreation newEntry=new AccountCreation(name,emailid,phoneNo,hid,password,deposit);
		try {
			newEntry.register();
		}
		catch(Exception e) {
			e.printStackTrace();
			Register();
		}
	}
	private void login() {
		int choice=1;
		while(choice!=0) {
			System.out.println("1.Admin\n2.User\n");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				adminlog();
				break;
			case 2:
				userlog();
				break;
			}
		}
	}
	private void userlog() {
		System.out.println("Enter Email ID");
		String emailid=in.next();
		System.out.println("Enter Strong password");
		String password=in.next();
		DB obj=new DB();
		try {
			if(obj.userLogVerify(emailid, password)) {
				AccountCreation o=obj.display(emailid);
				AccountCreation entity=new AccountCreation(o.getId(),o.getName(),o.getEmailId(),o.getNumber(),o.getHid(),o.getPassword(),o.getInitialDeposit());
				entity.userOption();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			userlog();
		}
	}
	private void adminlog() {
		System.out.println("Enter Email ID");
		String emailid=in.next();
		System.out.println("Enter Strong password");
		String password=in.next();
		DB obj=new DB();
		try {
		if(obj.userLogVerify(emailid, password)) {
			AccountCreation o=obj.display(emailid);
			AccountCreation entity=new AccountCreation(o.getName(),o.getEmailId(),o.getNumber(),o.getHid(),o.getPassword());
			entity.adminOption();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			adminlog();
		}
	}
}
