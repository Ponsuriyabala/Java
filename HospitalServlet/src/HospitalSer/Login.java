package HospitalSer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("pat_id"));
		String in_time=request.getParameter("in_time");
		PrintWriter out=response.getWriter();
		try {
			if(DB.verify(id)) {
				int medicalProfession=10;
				int pharmacyTime=5;
				int min=2;
				int max=20;
				int dT=(int)(Math.random()*(max-min+1)+min);//ttDoctor
				int totalConsultantTime=medicalProfession+pharmacyTime+dT;
				String outtime = DB.dateTime(in_time,totalConsultantTime)+" min";//outtime
				int t=totalConsultantTime-25;//waittime
				if(t<0)
					t=0;
				DB.update(id, in_time,dT,outtime,t);
		    	 Patient p = DB.display(id);
		    	 request.setAttribute("id",p.getId());
		    	 request.setAttribute("name",p.getName());
		    	 request.setAttribute("inTime",p.getIt());
		    	 request.setAttribute("docTime",p.getTtD());
		         RequestDispatcher rd = request.getRequestDispatcher("patientEntry.jsp");
		    	  rd.forward(request, response);
			}
			else {
				
				out.println("Invalid username or password");
				response.setContentType("text/html");
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				rd.include(request,response);
			}
		} catch (Exception e) {
			out.println("FRIT");
			e.printStackTrace();
		}
	}
}
