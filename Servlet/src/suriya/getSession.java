package suriya;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class getSession extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		HttpSession sess=req.getSession();
		int k=(int)sess.getAttribute("k");
		int i=(int)sess.getAttribute("i");
		int j=(int)sess.getAttribute("j");
//		sess.removeAttribute("i");     to remove variable in httpsession
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result of "+i+"and "+j+"= "+k);
}
}
