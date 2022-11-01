package suriya;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class addCookies extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		int i=Integer.parseInt(req.getParameter("number_one"));
		int j=Integer.parseInt(req.getParameter("number_two"));
		int k=i+j;
		Cookie cook=new Cookie("k",k+"");
		res.addCookie(cook);
		Cookie cooki=new Cookie("i",i+"");
		res.addCookie(cooki);
		Cookie cookie=new Cookie("j",j+"");
		res.addCookie(cookie);
		res.sendRedirect("cookies");
}
}