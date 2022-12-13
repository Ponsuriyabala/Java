package superMarket;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		userEntry();
	}
	private static void userEntry() {
		Scanner in=new Scanner(System.in);
		int choice=1;
		UserDetail obj;
		while(choice!=0) {
			System.out.println("1.Register\n2.Login\n0.Exit");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Registration");
				System.out.println("Enter the Username");
				String name=in.next();
				System.out.println("Enter the Mobile Number");
				String mobileNo=in.next();
				System.out.println("Enter the Password");
				String password=in.next();
				obj=new UserDetail(name,mobileNo,password);
				BookingOrder order=new BookingOrder();
				order.choice();
				break;
			case 2:
				System.out.println("Login");
				System.out.println("Enter your Phone number");
				String mobile=in.next();
				System.out.println("Enter your Password");
				String pass=in.next();
				obj=new UserDetail(mobile,pass);
				break;
			}
		}
	}
}
