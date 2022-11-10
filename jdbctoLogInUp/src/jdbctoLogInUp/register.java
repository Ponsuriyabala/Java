package jdbctoLogInUp;
import java.sql.*;
public class register {
	public register(String name,String passW)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Userdata","root","0000");
		PreparedStatement st=con.prepareStatement("insert into accountdetail value('"+name+"','"+passW+"')");  //select password from accountdetail where name='"rajesh';truncate table accountdetail";
		System.out.println(st.executeUpdate());
		System.out.println("Register successfully");
	    st.close();
	    con.close();
	}
}