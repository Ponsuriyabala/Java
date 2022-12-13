package deliveryServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addhotel
 */
@WebServlet("/addhotel")
public class addhotel extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String phoneno=request.getParameter("phoneno");
		String address=request.getParameter("address");
		String location=request.getParameter("location");
		try {
			database.addhotel(name, phoneno,address,location);
			RequestDispatcher rd=request.getRequestDispatcher("merchant.jsp");
			request.setAttribute("message","Add Sucessfully");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
