package delivery;
import java.util.Scanner;
public class Delivery {
	private String name,email,contact,flatNo,area,city,pincode,password,address;
	Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		Delivery entry=new Delivery();
		entry.entryOption();
	}

	private void userLogin() {
		Database db=new Database();
		System.out.println("Enter Registered Email Id ");
		email=in.next();
		System.out.println("Enter Password");
		password=in.next();
		if(db.verify(email,password)) {
			User objUser=db.userDetail(email);
			Client user=new Client(objUser.getId(),objUser.getName(),objUser.getContact());
			user.clientOption();
		}
		else {
			System.out.println("Invalid or Wrong password");
			userOption();
		}
	}

	private void adminLogin() {
		System.out.println("Enter Admin Email Id ");
		email=in.next();
		System.out.println("Enter Admin Entry Password");
		password=in.next();
		Admin obj=new Admin();
		obj.adminOption();
	}

	private void userRegister() {
		Database db=new Database();
		System.out.println("Enter User Name ");
		name=in.next();
		System.out.println("Enter Contact Number");
		contact=in.next();
		System.out.println("Enter Registered Email Id ");
		email=in.next();
		System.out.println("Enter FlatNo..");
		flatNo=in.next();
		System.out.println("Enter Street/Area..");
		in.nextLine();
		area=in.nextLine();
		System.out.println("Enter City..");
		city=in.next();
		System.out.println("Enter Pincode..");
		pincode=in.next();
		System.out.println("Enter Password");
		password=in.next();
		address=flatNo+","+area+","+city+"-"+pincode;
		User obj=new User(name,contact,address,email,password);
			db.reqister(obj);
	}

	private void userOption() {
		int choice;
		Loopbreaker:
			while(true) {
				System.out.println("1.Register\n2.Login\n0.Exit");
				choice=in.nextInt();
				switch(choice) {
				case 1:
						userRegister();
					break;
				case 2:
					userLogin();
					break;
				case 0:
					break Loopbreaker;
				default:
					System.out.println("Enter listed values");
				}
			}
	}
	private void entryOption() {
		int choice;
		Loopbreaker:
			while(true) {
				System.out.println("1.User\n2.Admin\n0.Exit");
				choice=in.nextInt();
				switch(choice) {
				case 1:
					userOption();
					break;
				case 2:
					adminLogin();
					break;
				case 0:
					break Loopbreaker;
				default:
					System.out.println("Enter listed values");
				}
			}
	}
}
