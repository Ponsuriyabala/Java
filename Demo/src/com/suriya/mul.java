package com.suriya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class mul {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
//		int k=(int)req.getAttribute("k"); ////forrequestDispatcher
//		int k=Integer.parseInt(req.getParameter("k"));//sendredirect
		HttpSession sess=req.getSession();
		int k=(int)sess.getAttribute("k");
		int l=k+2;
		PrintWriter out=res.getWriter();
		out.println(l); 
//		
	}
}
