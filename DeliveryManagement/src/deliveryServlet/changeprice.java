package deliveryServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class changemenu
 */
@WebServlet("/changeprice")
public class changeprice extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int name=Integer.parseInt(request.getParameter("id"));
		int price=Integer.parseInt(request.getParameter("price"));
		try {
			if(database.vmenuname(name)) {
			database.changem(name,price);
			RequestDispatcher rd=request.getRequestDispatcher("merchant.jsp");
			request.setAttribute("message","Change Sucessfully");
			rd.include(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("merchant.jsp");
				request.setAttribute("message","Dish not found");
				rd.include(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}