package deliveryServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addmenu")
public class addmenu extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String food=request.getParameter("food");
		int price=Integer.parseInt(request.getParameter("price"));
		try {
			database.addmenu(name, food, price);
			RequestDispatcher rd=request.getRequestDispatcher("merchant.jsp");
			request.setAttribute("message","Add Sucessfully");
			rd.include(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
