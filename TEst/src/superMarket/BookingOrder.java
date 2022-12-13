package superMarket;
import java.util.ArrayList;
import java.util.Scanner;
public class BookingOrder {
	Scanner in=new Scanner(System.in);
	private double netQuantity;
	private double Price;
	void choice() {
		ArrayList<Product> list=new ArrayList();
		int choice=1;
		while(choice!=0) {
			System.out.println("1.Rice\n2.Wheat\n3.Grains&Pulses\n4.Oats\n5.EdibleOils\n0.Exit");
			choice=in.nextInt();
			System.out.println(choice);
			if(choice==0)
				break;
			String product="";
			System.out.println("Enter quantity in kg");
			netQuantity=in.nextDouble();
			switch(choice) {
			case 1:	
				product="Rice";
				Price=40;
				Price=netQuantity*Price;
				break;
			case 2:
				product="Wheat";
				Price=15;
				Price=netQuantity*Price;
				break;
			case 3:
				product="Grains&pulse";
				Price=30;
				Price=netQuantity*Price;
				break;
			case 4:
				product="Oats";
				Price=80;
				Price=netQuantity*Price;
				break;
			case 5:
				product="Edible Oil";
				Price=120;
				Price=netQuantity*Price;
				break;
			}
			Product orderList=new Product(product,netQuantity,Price);
			list.add(orderList);
		}
		display(list);
	}
	protected double display(ArrayList<Product> obj) {
		double price=0.0;
		System.out.println("      Product       |Quantity|Price   ");
		for(Product o:obj) {
		System.out.println("  "+o.getItemName()+"      "+o.getNetQuantity()+"   "+o.getPrice());
		price+=o.getPrice();
		}
		System.out.println(price);
		return price;
	}
}
