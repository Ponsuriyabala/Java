package deliveryServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/admin")
public class admin extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id=(req.getParameter("admin"));
		String pass=req.getParameter("password");
		try {
			if(database.verifyadmin(id,pass)){
				HttpSession userinfo=req.getSession();
				userinfo.setAttribute("id",id);
				res.sendRedirect("adminindex.jsp");
			}
			else {
				RequestDispatcher rd=req.getRequestDispatcher("adminLog.jsp");
				req.setAttribute("message", "Incorrect password");
				rd.include(req, res);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
