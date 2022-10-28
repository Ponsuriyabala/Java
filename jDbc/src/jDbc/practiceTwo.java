package jDbc;
import java.sql.*;
public class practiceTwo {//fetch multiple value
	public static void main(String args[])throws Exception{
		String url="jdbc:mysql://localhost/sample";
		String uname="root";
		String pass="0000";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet re=st.executeQuery("select * from employee");
		String userData="";
		while(re.next()) {
			userData=re.getString(1)+" : "+re.getInt(2);
			System.out.println(userData);
		}
		st.close();
		con.close();
	}
}
