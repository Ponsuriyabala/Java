package deliveryServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class orderlist
 */
@WebServlet("/orderlist")
public class orderlist extends HttpServlet implements DeliveryProcess {
	private static final String HashMap = null;
    
	public int Process(HashMap<String,Integer> res,ArrayList<objectHotel> hotel) {
//		DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm");
//		LocalTime lt=LocalTime.parse();
//		String outTime=df.format(lt.plusMinutes());
//		return outTime;
//		int 
//		Set s=res.KeySet();
//		for(int i=0;i<res.size();i++) {
//		
//		}
		for(Map.Entry<String, Integer> items : res.entrySet()) {
			String itemName=items.getKey();
			for(objectHotel o : hotel) {
				if(o.getMenuname()== itemName) {
					//
				}	
			}
		}
//		Iterator i= res.iterator();
//		while(i.hasNext()) {
//			Map.Entry me=(Map.Entry)i.next();
//		}
		return 4;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession sess=request.getSession();
			ArrayList<objectHotel> res=(ArrayList)sess.getAttribute("arraylist");
			HashMap<String,Integer> orderItem=new HashMap<String, Integer>();
			String location=request.getParameter("location");
			System.out.println(location);
			for(objectHotel o:res){
				if(Integer.parseInt(request.getParameter(o.getMenuname()))>0)
				orderItem.put(o.getMenuname(),Integer.parseInt(request.getParameter(o.getMenuname())));
			}
			int value = this.Process(orderItem,res);
			sess.removeAttribute("arraylist");
			sess.setAttribute("orderlist", orderItem);
			response.sendRedirect("userfood.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
			}
	}
	public String orderTime() {
		
		return "s";
	}
}