package com.suriya;
import java.io.*;

import javax.servlet.http.*;

public class sqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
//		int k=(int)req.getAttribute("k"); ////forrequestDispatcher
//		int k=Integer.parseInt(req.getParameter("k"));//sendredirect
		HttpSession sess=req.getSession();
		int k=(int)sess.getAttribute("k");
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println(k);
	}
}