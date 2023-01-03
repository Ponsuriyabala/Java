package delivery;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	Scanner in=new Scanner(System.in);
	private String name,contact,address,email,flatNo,area, location, pincode,dishType,hotelLocation;
	private int price,dishCount,selectHotel,dBoyCount;
	private int choice;
	void adminOption() {
		Loopbreaker:
			while(true) {
				System.out.println("1.Resturant\n2.DeliveryBoy\n3.Payment\n4.Order Detail\n0.Exit");
				choice=in.nextInt();
				switch(choice) {
				case 1:
					editResturant();
					break;
				case 2:
					editDeliveryBoy();
					break;
				case 3:

					break;
				case 4:

					break;
				case 0:

					break Loopbreaker;
				default:
					System.out.println("Enter listed values");
				}
			}
	} 
	private void editResturant() {
		Loopbreaker:
			while(true) {
				System.out.println("1.Add Resturant\n2.Update Resturant Detail\n3.Delete Resturant\n4.View Resturant List\n5.viewMenu\n6.EditMenu\n0.Exit");
				choice=in.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter Name of Resturant");
					name=in.next();
					System.out.println("Enter Resturant Contact Number");
					contact=in.next();
					System.out.println("Enter Resturant Email Address");
					email=in.next();
					System.out.println("Enter FlatNo..");
					flatNo = in.next();
					System.out.println("Enter Street/Area..");
					area=in.nextLine();
					area=in.nextLine();
					System.out.println("Enter City..");
					location=in.next();
					System.out.println("Enter Pincode..");
					pincode=in.next();
					address=flatNo+","+area;
					Resturant add=new Resturant(name,contact,email,address,location);
					Database db=new Database();
					db.addResturant(add);
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:
					hotelLocation=viewLocation();
					viewResturant(hotelLocation);
					break;
				case 5:
					hotelLocation=viewLocation();
					viewResturant(hotelLocation);
					System.out.println("Enter Resturant Id");
					selectHotel=in.nextInt();
					ArrayList<MenuList> obj=listMenu(selectHotel);
					viewMenu(obj);
					break;
				case 6:
					hotelLocation=viewLocation();
					viewResturant(hotelLocation);
					System.out.println("Enter Resturant Id");
					selectHotel=in.nextInt();
					editMenu(selectHotel);
				case 0:

					break Loopbreaker;
				default:
					System.out.println("Enter listed values");
				}
			}
	}
	private void editMenu(int selectHotel) {
		Loopbreaker:
			while(true) {
				System.out.println("1.Add Menu\n2.Update Menu Price\n3.Delete Menu\n4.Menu Count\n0.Exit");
				choice=in.nextInt();
				switch(choice) {
				case 1:
					viewItem();
					System.out.println("Enter Item id");
					dishType=in.next();
					System.out.println("Price of Dish");
					price=in.nextInt();
					System.out.println("Enter Count of Dish");
					dishCount = in.nextInt();
					MenuList list=new MenuList(price,dishCount,dishType,selectHotel);
					Database db=new Database();
					db.addMenu(list,selectHotel);
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 0:

					break Loopbreaker;
				default:
					System.out.println("Enter listed values");
				}
			}
	}
	private void editDeliveryBoy() {
		Loopbreaker:
			while(true) {
				System.out.println("1.Add DeliveryBoy\n2.Update DeliveryBoy\n3.Delete DeliveryBoy\n4.View DeliveryBoy List\n0.Exit");
				choice=in.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter Name of DeliveryBoy");
					name=in.next();
					System.out.println("Enter DeliveryBoy Contact Number");
					contact=in.next();
					System.out.println("Enter FlatNo..");
					flatNo = in.next();
					System.out.println("Enter Street/Area..");
					in.nextLine();
					area=in.nextLine();
					System.out.println("Enter City..");
					location=in.next();
					System.out.println("Enter Pincode..");
					pincode=in.next();
					address=flatNo+","+area+","+location+"-"+pincode;
					DeliveryBoy addDB=new DeliveryBoy(name,contact,address);
					Database db=new Database();
					db.addDeliveryBoy(addDB);
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:
					viewDeliveryBoy();
					break;
				case 0:

					break Loopbreaker;
				default:
					System.out.println("Enter listed values");
				}
			}
	}
	ArrayList<String> listDeliveryBoy(int restaurantId) {
		Database db=new Database();
		ArrayList<String> obj=db.DeliveryBoy();
		return obj;
	}
	void viewDeliveryBoy() {
		Database db=new Database();
		ArrayList<DeliveryBoy> obj=db.listDeliveryBoy();
		System.out.println("DeliveryBoy ID "+ "DeliveryBoy name       "+" DeliveryBoy Number");
		for(DeliveryBoy o:obj) {
			System.out.println(o.getId()+"                "+o.getName()+"         "+o.getContact());

		}
	}
	ArrayList<Resturant> listResturant(String location) {
		Database db=new Database();
		ArrayList<Resturant> obj=db.viewResturants(location);
		return obj;
	}
	void viewResturant(String location) {
		System.out.println(location);
		Database db=new Database();
		ArrayList<Resturant> obj=db.viewResturants(location);
		System.out.println(obj);
		System.out.println("Resturant ID "+"Resturant name       "+" Resturant Number");
		for(Resturant o:obj) {
			System.out.println(o.getId()+"            "+o.getName()+"         "+o.getContact());
		}
	}
	ArrayList<MenuList> listMenu(int restaurantId) {
		Database db=new Database();
		ArrayList<MenuList> obj=db.viewMenu(restaurantId);
		return obj;
	}
	void viewMenu(ArrayList<MenuList> obj) {
		System.out.println("menu ID "+"Menu name       "+"Menu Price");
		for(MenuList o:obj) {
			System.out.println(o.getMenuID()+"            "+o.getMenuName()+"         "+o.getMenuPrice());
		}
	}
	private void viewItem() {
		Database db=new Database();
		ArrayList<DishItem> obj=db.viewDish();
		System.out.println("Dish ID "+"Dish name       "+"Dish Type");
		for(DishItem o:obj) {
			System.out.println(o.getId()+"      "+o.getName()+"         "+o.getType());
		}
	}
	private ArrayList<String> listLocation() {
		Database db=new Database();
		ArrayList<String> obj=db.viewLocation();
		return obj;
	} 
	String viewLocation(){
		ArrayList<String> obj=listLocation();
		System.out.println("Location ID "+"Location");
		for(int i=0;i<obj.size();i++) {
			System.out.println((i+1)+"            "+obj.get(i));
		}
		int locationId;
		loopBreaker:
			while(true) {
				System.out.println("Enter the location id");
				locationId=in.nextInt();
				locationId-=1;
				hotelLocation=obj.get(locationId);
				if(hotelLocation != null) {
					break loopBreaker;
				}
			}

		return hotelLocation;
	}
	int deliveryBoyCount() {
		Database db=new Database();
		ArrayList<DeliveryBoy> dBoyCount=db.listDeliveryBoy();
		int count=dBoyCount.size();
		return count;
	}
	String deliveryAllocate() {
		String deliveryBoy;
		Database db=new Database();
		dBoyCount=deliveryBoyCount();
		System.out.println(dBoyCount);
		int min=1;
		int max=dBoyCount;
		int range=max-min+1;
		loopBreaker:
			while(true) {
				int allocatedDBoy = (int)(Math.random()*range) + min;
				allocatedDBoy-=1;
				ArrayList<String> obj=db.DeliveryBoy();
				String dBoyContact=obj.get(allocatedDBoy);
				ArrayList<DeliveryBoy> boy=db.listDeliveryBoy();
				for(DeliveryBoy o:boy) {
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");  
					LocalDateTime now = LocalDateTime.now();  
					String currentTime=dtf.format(now);
					if(dBoyContact.equals(o.getContact())) {
						String boyAvailableTime=o.getTime();
						SimpleDateFormat simple=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
						try {
							Date d1=simple.parse(currentTime);
							Date d2=simple.parse(boyAvailableTime);
							long inTime=d2.getTime()-d1.getTime();
							long inSeconds= (inTime/ 1000)% 60;
							long inMinutes= (inTime/ (1000 * 60))% 60;
							if(inMinutes<=0) {
								if(inSeconds<=0) {
									System.out.println(o.getContact());
									deliveryBoy= o.getContact();
									break loopBreaker;
								}
							}
						} catch (ParseException e) {
							e.printStackTrace();
						}

					}
				}
			}
		return deliveryBoy;
	}
}
