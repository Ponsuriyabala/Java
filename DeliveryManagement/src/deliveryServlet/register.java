package deliveryServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		try {
			if(!database.verify(mobile)){
				database.register(firstname, lastname, address, password, mobile);
				HttpSession userinfo=request.getSession();
				userinfo.setAttribute("id",mobile);
				 request.removeAttribute("message");
				response.sendRedirect("index.jsp");
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("mainpage.jsp");
				request.setAttribute("message","Account already exist");
				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
