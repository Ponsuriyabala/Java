package railWayTicket;
import java.util.*;
public class railWay {
	public static int up=2;
	public static int lp=2;
	public static int mp=2;
	public static int rac=2;
	public static int wtList=2;
	public static int k=0;
	public static int price;
	public static int pnr = 0;
	public static int PnrNo=1;
	public static Passenger Tickets[] = new Passenger[15];
	public static int num;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("! ! !W E L C O M E! ! !");
		System.out.println("   Login_Page   ");
		System.out.print("Enter your Name : ");
		String user=in.nextLine();
		System.out.print("Enter password : ");
		String passWord=in.nextLine();
		System.out.println("Login Successfully");
		System.out.println("------------------");
		choiceSel();
		in.close();
	}	
	static void choiceSel(){
		Scanner in=new Scanner(System.in);
		System.out.println("1.Booking ticket \n 2.Available tickets \n 3.Cancel tickts \n 4.Booked Tickets \n5.exit");
		int num=in.nextInt();
		switch(num) {
		case 1:
			boOKing(in);
			choiceSel();
			break;
		case 2:
			aVailable();
			choiceSel();
			break;
		case 3:
			canCellation();
			view();
			choiceSel();
			break;
		case 4:
			view();
			choiceSel();
			System.out.println("--------------------");
			break;
		case 5:
			break;
		}
	}
	public static void boOKing(Scanner in) {
		System.out.println("Welcome Booking");
		System.out.println("Enter number person make a journey");
		num=in.nextInt();
		railWay obj=new railWay();
		int i=1,age,price;
		String berthPer = "",name,gender;
		while(i<=num){
			System.out.print("Enter your name : ");
			name=in.next();
			System.out.println("Enter age : ");
			age=in.nextInt();
			System.out.println("Enter gender M || F || O: ");
			gender = in.next();
			if(age<=5){
				berthPer="noSeat";
				System.out.println("No seat alloted");
			}else {
				if(age>=65) {
					if(lp>0) {
						berthPer="lp"; 
						System.out.println("Lower booked...");
						lp--;
					}
					else {
						if(up>0 && mp>0) {
							System.out.println("1.Upper berth\n 2.Middle berth");
							int num2=in.nextInt();
							switch(num2) {
							case 1:
								berthPer="up";
								up--;
								break;
							case 2:
								berthPer="mp";
								mp--;
								break;
							}
						}
						else if(up>0) {
							System.out.println("Upper berth Booked");
							berthPer="up";
							up--;
						}
						else if(mp>0) {
							System.out.println("Middle berth Booked");
							berthPer="mp";
							mp--;
						}
						else if(rac>0) {
							System.out.println("RAC");
							berthPer="rac";
							rac--;
						}
						else if(wtList>0) {
							System.out.println("Waiting list");
							berthPer="wtList";
							wtList--;
						}
					}
				}
				else{
					if(up>0 && mp>0) {
						System.out.println("1.Upper berth\n 2.Middle berth");
						int num2=in.nextInt();
						switch(num2) {
						case 1:
							berthPer="up";
							System.out.println("Upper berth Booked");
							up--;
							break;
						case 2:
							berthPer="mp";
							System.out.println("Middle berth Booked");
							mp--;
							break;
						}
					}
					else if(up>0) {
						System.out.println("Upper berth Booked");
						berthPer="up";
						up--;
					}
					else if(mp>0) {
						System.out.println("Middle berth Booked");
						berthPer="mp";
						mp--;
					}
					else if(lp>0) {
						System.out.println("Lower berth Booked");
						berthPer="lp";
						lp--;
					}
					else if(rac>0) {
						System.out.println("RAC");
						berthPer="rac";
						rac--;
					}
					else if(wtList>0) {
						System.out.println("Waiting list");
						berthPer="wtList";
						wtList--;
					}
					else {
						System.out.println("No tickets available");
					}
					if(i<num) {
						System.out.println("Enter next person name");
					}
				}
			}
			if(age<=5)
				price=200;
			else
				price=400;
			
			pnr++;
			Passenger p = new Passenger(name,age,gender,berthPer,pnr,price,PnrNo);
			Tickets[k++] = p;
			i++;
		}
	    PnrNo++;
		System.out.println("Booked Successfully....");
	}
	public static void view() {
		for(int i=0;i<k;i++) {
			if(Tickets[i].name!="cancel")
				display(Tickets[i]);
			else
				pnr--;
		}
	}
	static void display(Passenger p) {
		System.out.println("Pnr no TicketNo Age Gender Berth Fare      Name");
		System.out.println(" "+p.PnrNo+"        "+p.pnr+"     "+p.age+"      "+p.gender+"  "+p.bp+"    "+p.price+"       "+p.name);
	}
	public static void aVailable() {
		int upper=up;
		System.out.println("Available Upper berth : "+upper);
		int middle=mp;
		System.out.println("Available Middle berth : "+middle);
		int lower=lp;
		System.out.println("Available Lower berth : "+lower);
		int rAc=rac;
		System.out.println("Available RAC : "+rAc);
		int waiting=wtList;
		System.out.println("Available Waiting list : "+wtList);
		//			choiceSel obj1=new choiceSel();
	}
	public static void canCellation(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Ticket no");
		int can = in.nextInt();
		railWay p=new railWay();
		String temp ="";
		temp=Tickets[can-1].bp;
		if(Tickets[can-1].age<=5) {
			if(rac==2) {
				for(int j=can-1;j<k-1;j++) {
					Tickets[can-1].PnrNo=Tickets[j].PnrNo;
				Tickets[j].name=Tickets[j+1].name;
				Tickets[j].age=Tickets[j+1].age;
				Tickets[j].gender=Tickets[j+1].gender;
				Tickets[j].price=Tickets[j+1].price;
				Tickets[j].bp=Tickets[j+1].bp;
			}
				Tickets[k-1].name="cancel";
			}
			else {
			for(int j=can-1;j<k-1;j++) {
				Tickets[can-1].PnrNo=Tickets[j].PnrNo;
				Tickets[j].name=Tickets[j+1].name;
				Tickets[j].age=Tickets[j+1].age;
				Tickets[j].gender=Tickets[j+1].gender;
				Tickets[j].price=Tickets[j+1].price;
				if(rac>0) {
					Tickets[j].bp="rac";
					rac--;

				}else {
					Tickets[j].bp="wtList";
				}
			}
			Tickets[k-1].name="cancel";
		}
		}
		else {
			if(rac==2) {
				Tickets[can-1].name="cancelled";
				if(temp=="mp") {
					mp++;
					System.out.println(mp);
				}
				else if(temp=="lp") {
					lp++;
					System.out.println(lp);
				}
				else if(temp=="up") {
					up++;
					System.out.println(up);
				}
				else {
					System.out.println("no seat alloted to this tickets");
				}
				for(int j=can-1;j<k-1;j++) {
					Tickets[can-1].PnrNo=Tickets[j].PnrNo;
					Tickets[j].name=Tickets[j+1].name;
					Tickets[j].age=Tickets[j+1].age;
					Tickets[j].gender=Tickets[j+1].gender;
					Tickets[j].price=Tickets[j+1].price;
					Tickets[j].bp=Tickets[j+1].bp;
				}
				Tickets[k-1].name="cancel";
			}
			else {
				for(int i=0;i<k;i++) {
					if(Tickets[i].bp=="rac") {
						Tickets[can-1].PnrNo=Tickets[i].PnrNo;
						Tickets[can-1].name=Tickets[i].name;
						Tickets[can-1].age=Tickets[i].age;
						for(int j=i;j<k-1;j++) {
							Tickets[j].PnrNo=Tickets[j].PnrNo;
							Tickets[j].name=Tickets[j+1].name;
							Tickets[j].age=Tickets[j+1].age;
							Tickets[j].gender=Tickets[j+1].gender;
							Tickets[j].price=Tickets[j+1].price;
							if(Tickets[j].bp!="rac") {
								if(rac>0) {
									Tickets[j].bp="rac";
									rac--;
								}
								else if(wtList>0){
									Tickets[j].bp="wtList";
								}
								else {
									
								}
								}
						}
						Tickets[k-1].name="cancel";
						i=k+1;
					}
				}
			}
		}
	}
}	