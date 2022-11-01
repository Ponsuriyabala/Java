package suriya;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class setSendDirect extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		int i=Integer.parseInt(req.getParameter("number_one"));
		int j=Integer.parseInt(req.getParameter("number_two"));
		int k=i+j;
		res.sendRedirect("sendRes?k="+k);
}
}