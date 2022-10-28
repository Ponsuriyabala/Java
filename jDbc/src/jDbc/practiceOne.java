package jDbc;
//for name
import java.sql.*;
public class practiceOne {//fetch single value
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost/sample";
			String uname="root";
			String pass="0000";
			String query="select * from employee;";
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString(1);
		System.out.println(name);
		st.close();
		con.close();
	}
	}
