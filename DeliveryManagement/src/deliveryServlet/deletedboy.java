package deliveryServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deletedboy
 */
@WebServlet("/deletedboy")
public class deletedboy extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			try {
				database.deletedboy(id,name);
				RequestDispatcher rd=request.getRequestDispatcher("merchant.jsp");
				request.setAttribute("message","Delete Sucessfully");
				rd.include(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}
