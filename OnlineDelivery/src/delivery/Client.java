package delivery;
import java.util.*;
public class Client{
	private String menuName,userName,userContact,hotelLocation,deliveryBoy;
	Scanner in=new Scanner(System.in);
	private int choice,count,menuId,selectHotel,userId,total,billAmount=0;
	boolean flag=true;
	Client(int userId,String userName,String userContact){
		this.userId=userId;
		this.userName=userName;
		this.userContact=userContact;
	}
	void clientOption() {
			while(true) {
				System.out.println("Make a New Order");
				SelectHotel();
				HashMap<String,MenuList> obj=makeOrder(selectHotel);
				orderPayment(obj);
				System.out.println("1.COD/n2.OnlinePayment");
				int paymentMode=in.nextInt();
				loopBreaker:
					while(true) {
						if(paymentMode==1) {
							Admin admin=new Admin();
							Database db=new Database();
							deliveryBoy=admin.deliveryAllocate();
							db.changeAvailabletime(deliveryBoy);
							System.out.println("Delivery Boy's "+deliveryBoy+" "+billAmount+"to be Handover...");
							System.out.println("Order to be delivered");
							break loopBreaker;
						}
						else if(paymentMode==2) {
							Admin admin=new Admin();
							Database db=new Database();
							deliveryBoy=admin.deliveryAllocate();
							db.changeAvailabletime(deliveryBoy);
							System.out.println("Delivery Boy's "+deliveryBoy+" "+billAmount+"to be Handover...");
							System.out.println("Order to be delivered");
							break loopBreaker;
						}
					}
			}
	}
	private void orderPayment(HashMap<String, MenuList> obj) {
		System.out.println("                   Bill Amount");
		System.out.println("Dish\t\tQuantity\t\tPrice\t\tDishtotal");
		System.out.println();
		for(Map.Entry<String,MenuList> o:obj.entrySet()) {
			MenuList user=o.getValue();
			total=user.getMenuPrice()*user.getMenuCount();
			billAmount+=total;
			System.out.println(o.getKey()+"\t"+user.getMenuCount()+"\t\t"+user.getMenuPrice()+"\t\t\t"+total);
		}
		System.out.println("Total Amount : "+billAmount);
		System.out.println();
	}

	private void SelectHotel() {
		Admin data=new Admin();
		Database db=new Database();
		hotelLocation=data.viewLocation();
		loopBreaker:
			while(true) {
				System.out.println();
				data.viewResturant(hotelLocation);
				System.out.println();
				System.out.println("Enter Resturant Id");
				selectHotel=in.nextInt();
				ArrayList<Resturant> checkHotelId=db.viewResturants(hotelLocation);
				for(Resturant o:checkHotelId) {
					if(selectHotel==o.getId()) {
						break loopBreaker;
					}
				}
				System.out.println("Enter Correct HotelId");
			}
	}
	private HashMap<String,MenuList> makeOrder(int selectHotel) {
		Admin data=new Admin();
		ArrayList<MenuList> list=data.listMenu(selectHotel);
		HashMap<String,MenuList> obj=new HashMap<String,MenuList>();

		loopBreaker:
			while(true) {
				data.viewMenu(list);
				System.out.println("Enter Dish ID to Continue Or 0.Finished");
				menuId=in.nextInt();
				if(menuId==0) {
					break loopBreaker;
				}
				for(MenuList o:list) {
					if(o.getMenuID()==menuId) {
						System.out.println("Enter the Quantity");
						count=in.nextInt();
						MenuList priceCount=new MenuList(o.getMenuPrice(),count);
						obj.put(o.getMenuName(),priceCount);
						break;
					}
				}
			}
		return obj;
	}
}