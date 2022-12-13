package com.suriya;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		int pass=0;
		HttpSession sess=req.getSession();
		sess.setAttribute("k", k);
		sess.setAttribute("1234",pass);
//		res.sendRedirect("sq?k="+k);////sendredirect
//		req.setAttribute("k", k);
//		RequestDispatcher rd=req.getRequestDispatcher("sq"); ////dispatcher
//		rd.forward(req, res);
	}
}
