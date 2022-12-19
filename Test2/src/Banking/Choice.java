package Banking;
import java.util.*;
public class Choice {
	private static int roll=4;
	static ArrayList<Customer> list=new ArrayList<Customer>();
	public void choice() {
		Scanner in=new Scanner(System.in);
		int choice=1;
		Customer reg1=new Customer("Imman","9876543210","Uma",1);
		Customer reg2=new Customer("Snehan","9876543218","Revi",2);
		Customer reg3=new Customer("Vicky","9876543217","Abu",3);
		list.add(reg1);
		list.add(reg2);
		list.add(reg3);
		while(choice!=0) {
			System.out.println("1.Login\n2.Register\n");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Accountno");
				long accountNo=in.nextLong();
				System.out.println("Enter the password");
				String password=in.next();
				for(Customer o:list) {
					if(accountNo ==o.getAccountNo()) {
						String pass=o.getpassword();
						if(pass.equals(password)) {
							Customer obj=new Customer(o.getCusId(),o.getAccountNo(),o.getName(),o.getBalance(),o.getPhoneNo(),o.getpassword(),o.getStat());
							obj.banking();
							o.setBalance(obj.getBalance());
							o.setStat(obj.getStat());
							break;
						}
						else {
							System.out.println("Invalid password");
							break;
						}
					}
				}
				break;
			case 2:
				System.out.println("Enter the name");
				String name=in.next();
				System.out.println("Enter the PhoneNumber");
				String phoneNo=in.next();
				System.out.println("Enter the password");
				String regPassword=in.next();
				System.out.println("re-Enter the password");
				String rePassword=in.next();
				if(regPassword.equals(rePassword)) {
						Customer log=new Customer(name,phoneNo,regPassword,roll);
						list.add(log);
						System.out.println("Account Created urs account no : "+log.getAccountNo());
						roll++;
					
				}
				else {
					System.out.println("Password Mismatch");
				}

				break;
			}
		}
		display();
	}
	protected void AccountTransfer(int number,int amount,long fromAccno) {
		for(Customer o:list) {
			if(number==o.getAccountNo()) {
				int curBalance=amount+o.getBalance();
				AccountStatement transferFrom=new AccountStatement("TransferFrom '"+fromAccno+"'",amount, curBalance);
				o.setBalance(curBalance);
			}
		}
	}
	private void display() {
		for(Customer o:list) {
			System.out.println(o.getName()+" "+o.getAccountNo()+" "+o.getCusId()+" "+o.getpassword()+" "+o.getBalance());
		}
	}
}
