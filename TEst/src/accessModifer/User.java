package accessModifer;
import java.util.*;
public class User {
	public static void main(String args[]) {
		System.out.println("Welcome!!!!");
		logReg();
	}
	private static void logReg() {
		Scanner in=new Scanner(System.in);
		int choice=1;
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
				choice(name,mobileNo,password);
				break;
			case 2:
				System.out.println("Login");
				System.out.println("Enter your Phone number");
				String mobile=in.next();
				System.out.println("Enter your Password");
				String pass=in.next();
				choiceRegister(mobile,pass);
				break;
			}
		}
	}
	private static void choice(String name,String mobileNo,String password) {
		detail obj=new detail(name,mobileNo,password);
		option(obj);
	}
	private static void choiceRegister(String mobileNo,String password) {
		detail obj=new detail(mobileNo,password);
		System.out.println(obj.verifyRegister());
		if(obj.verifyRegister()) {
			option(obj);
		}
		else {
			logReg();
		}
	}
	private static void option(detail obj) {
		Scanner in=new Scanner(System.in);
		int choice=1;
		while(choice!=0) {
			System.out.println("1.reset password\n2.Change mobile number\n0.Exit");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the New Password");
				String newPassword=in.next();
				obj.setPassword(newPassword);
				break;
			case 2:
				System.out.println("Mobile Number is"+obj.encryptMobileno());
				System.out.println("Enter the New MobileNumber");
				String newMobileNumber=in.next();
				obj.setMobileNo(newMobileNumber);
				break;
			}
		}
	}
}
