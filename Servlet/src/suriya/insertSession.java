package suriya;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class insertSession extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		int i=Integer.parseInt(req.getParameter("number_one"));
		int j=Integer.parseInt(req.getParameter("number_two"));
		int k=i+j;
		HttpSession sess=req.getSession();
		sess.setAttribute("k", k);
		sess.setAttribute("i", i);
		sess.setAttribute("j", j);
		res.sendRedirect("sessions");
}
}