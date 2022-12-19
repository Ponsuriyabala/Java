package objectInsertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class insertObjectIntoSet {
	public static void main(String args[])throws Exception {
		String url="jdbc:mysql://localhost/sample";
		String uname="root";
		String pass="0000";
		ArrayList<Customer> list=new ArrayList<Customer>();
		Customer obj=new Customer("Suriya",25);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
//		PreparedStatement st=con.prepareStatement(query);
//		st.executeUpdate();
//		st.close();
		con.close();
		}
}
