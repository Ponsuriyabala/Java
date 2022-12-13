package HospitalSer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class list
 */
@WebServlet("/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ServletHospital","root","0000");
			Statement st = con.createStatement();
			String query="select * from entry";
			ResultSet rs=st.executeQuery(query);
//			if (rs.next()) {
//				out.println("-----------------------------------------------------------------");
//				out.println("Name        In-Time   Treatment-Time    Out-Time  Waiting-Time");
//				do {
//					out.println(rs.getString(2) + "     " + rs.getString(3) + "            " + rs.getString(4)
//					+ "              " + rs.getString(5) + "      " + rs.getString(6));
//				} while (rs.next());
//				out.println("-----------------------------------------------------------------");
//			} else {
//				out.println("No Out Patients");
//			}
			out.println("<html>");
			out.println("<head><title>Display</title></head>");
			out.println("<body>");
			out.println("<table>");

			if (rs.next()) {
				
				
				out.println("<tr><td>Name</td>"
						+ "<td>In-Time</td>"
						+ "<td>Treatment-Time</td>"
						+ "<td>Out-Time</td>"
						+ "<td>Waiting-Time</td>");
				do {
					out.println("<tr><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td>"
							+ "<td>"+rs.getInt(4)+"</td><td>"+rs.getString(5)+"</td>"
									+ "<td>"+rs.getInt(6)+"</td></tr>");
					
				} while (rs.next());
				
				out.println("</table>");
				out.println("</body></html>");
				out.close();
			} else {
				out.println("No Out Patients");
			}
			con.close();
			st.close();
			response.setContentType("text/html");
			RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
