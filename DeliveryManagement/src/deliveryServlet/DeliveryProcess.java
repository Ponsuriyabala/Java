package deliveryServlet;

import java.util.ArrayList;
import java.util.HashMap;

public interface DeliveryProcess {
     	abstract int  Process(HashMap<String,Integer> a,ArrayList<objectHotel> items);
     	
}
