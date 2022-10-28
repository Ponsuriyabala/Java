package jDbc;
import java.sql.*;
public class insertJdbc {
	public static void main(String args[])throws Exception {
	String url="jdbc:mysql://localhost/sample";
	String uname="root";
	String pass="0000";
	String username="ra";
	int userage=45; 
	String query="insert into employee value ('"+username+"','"+userage+"') ";
//	String query="insert into employee value (?,?) ";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	PreparedStatement st=con.prepareStatement(query);
//	st.setString(1,username);
//	st.setInt(2, userage);
	st.executeUpdate();
	st.close();
	con.close();
	}
}
