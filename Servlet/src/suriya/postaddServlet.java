package suriya;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class postaddServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int i=Integer.parseInt(req.getParameter("number_one"));
		int j=Integer.parseInt(req.getParameter("number_two"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println("result"+k);
	}
}
