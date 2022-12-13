package accessModifer;
import java.sql.*;
public class SqlDB {
	private static String url="jdbc:mysql://localhost/sample";
	private static String user="root";
	private static String pass="0000";
	protected void update(String name,String phoneno,String password)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		st.executeUpdate("insert into userdata(username,newphoneno,newpassword) values('"+name+"','"+phoneno+"','"+password+"')");
		con.close();
		st.close();
	} 
	protected void phoneNo(String phoneNo,String oldPhoneno)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		st.executeUpdate  ("update userdata set oldphoneno='"+oldPhoneno+"' where newphoneno='"+oldPhoneno+"' ");
		Statement st1=con.createStatement();
		st.executeUpdate("update userdata set newphoneno='"+phoneNo+"' where newphoneno='"+oldPhoneno+"'");
		con.close();
		st.close();
		st1.close();
	}
	protected void password(String password,String oldPassword,String mobile)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		st.executeUpdate  ("update userdata set oldpassword='"+oldPassword+"' where newphoneno='"+mobile+"' ");
		Statement st1=con.createStatement();
		st.executeUpdate("update userdata set newpassword='"+password+"' where newphoneno='"+mobile+"'");
		con.close();
		st.close();
		st1.close();
	} 
	protected String loginverify(String mobile,String password)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select username,newpassword from userdata where newphoneno='"+mobile+"'");
		rs.next();
		String name=rs.getString(1);
		String pass=rs.getString(2);
		if(!password.equals(pass)) {
			con.close();
			st.close();
			return null;
		}
		con.close();
		st.close();
		return name;
	} 
}
