package deliveryServlet;

import java.sql.SQLException;
import java.util.ArrayList;

public class view {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		ArrayList<objectHotel> res=database.hotellist();
		for(objectHotel o:res) {
			System.out.println(o.getId()+" "+o.getName());
		}
	}
}
