package HospitalSer;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/register")
public class register extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
	    String name=req.getParameter("pat_name");
	    String intime=req.getParameter("in_time");
	    int medicalProfession=10;
		int pharmacyTime=5;
		int min=2;
		int max=20;
		int dT=(int)(Math.random()*(max-min+1)+min);//ttDoctor
		int totalConsultantTime=medicalProfession+pharmacyTime+dT;
		String outtime = DB.dateTime(intime,totalConsultantTime)+" min";//outtime
		int t=totalConsultantTime-25;//waittime
		if(t<0)
			t=0;
	    try {
	    	 DB.register(name,intime,dT,outtime,t);
	    	 int pid=DB.registerPat_id();
	    	 Patient p = DB.display(pid);
	    	 req.setAttribute("id",p.getId());
	    	 req.setAttribute("name",p.getName());
	    	 req.setAttribute("inTime",p.getIt());
	    	 req.setAttribute("docTime",p.getTtD());
	         RequestDispatcher rd = req.getRequestDispatcher("patientEntry.jsp");
	    	  rd.forward(req, res);
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    }
	}
}