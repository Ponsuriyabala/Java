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
		Loopbreaker:
			while(true) {
				System.out.println("1.Make a New Order\n2.Account Detail\n0.Exit");
				choice=in.nextInt();
				switch(choice) {
				case 1:
					SelectHotel();
					HashMap<String,MenuList> obj=makeOrder(selectHotel);
					orderPayment(obj);
					System.out.println("1.COD/n2.OnlinePayment");
					int paymentMode=in.nextInt();
					switch(paymentMode) {
					case 1:
						Admin admin=new Admin();
						Database db=new Database();
						deliveryBoy=admin.deliveryAllocate();
						db.changeAvailabletime(deliveryBoy);
						System.out.println("Complete");
						
						break;
					case 2:
						
						break;
					}
					break;
				case 2:

					break;
				case 3:

					break;
				case 0:
					break Loopbreaker;
				default:
					System.out.println("Enter listed values");
				}
			}
	}
	private void orderPayment(HashMap<String, MenuList> obj) {
		System.out.println("Bill Amount");
		System.out.println("Dish\t\tQuantity\t\tPrice\t\tDishtotal");
		
		for(Map.Entry<String,MenuList> o:obj.entrySet()) {
			MenuList user=o.getValue();
			total=user.getMenuPrice()*user.getMenuCount();
			billAmount+=total;
			System.out.println(o.getKey()+"\t"+user.getMenuCount()+"\t\t"+user.getMenuPrice()+"\t\t\t"+total);
		}
	}
	
	private void SelectHotel() {
		Admin data=new Admin();
		Database db=new Database();
		hotelLocation=data.viewLocation();
		loopBreaker:
			while(true) {
				data.viewResturant(hotelLocation);
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