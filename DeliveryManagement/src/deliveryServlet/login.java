package deliveryServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id=(req.getParameter("userid"));
		String pass=req.getParameter("password");
		try {
			if(database.verify(id)) {
				if(database.passverify(id, pass)) {
					HttpSession userinfo=req.getSession();
					userinfo.setAttribute("id",id);
					RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
				    req.removeAttribute("message");
				    rd.forward(req, res);
				}
				else {
					req.removeAttribute("message");
					req.setAttribute("message", "incorrect password");
					res.setContentType("text/html");
					RequestDispatcher rd=req.getRequestDispatcher("mainpage.jsp");
					rd.include(req, res);
				}
			}
			else {
				req.setAttribute("message", "invalid user Create new account");
				res.setContentType("text/html");
				RequestDispatcher rd=req.getRequestDispatcher("mainpage.jsp");
				rd.include(req, res);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
