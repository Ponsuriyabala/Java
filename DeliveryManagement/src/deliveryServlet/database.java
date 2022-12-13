package deliveryServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class database {
	static String url="jdbc:mysql://localhost/deliverymanagement";
	static String user="root";
	static String pass="0000";
	public static boolean verify(String id)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select id from userdata where phone_no='"+id+"'");
		if(!rs.next()) {
			return false;
		}
		con.close();
		st.close();
		return true;
	}
	public static boolean passverify(String id,String passw) throws Exception {
		boolean flag=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select userpass from userdata where phone_no='"+id+"'");
		rs.next();
		String password=rs.getString(1);
		if(passw.equals(password)) {
			flag=true;
		}
		con.close();
		st.close();
		return flag;
	}
	public static void register(String firstname,String lastname,String address,String passw,String mobile) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="insert into userdata(username,address,userpass,phone_no) values (?,?,?,?) ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		String name=firstname+" "+lastname;
		st.setString(1, name);
		st.setString(2,address);
		st.setString(3,passw);
		st.setString(4,mobile);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static boolean verifyadmin(String id, String password) throws SQLException, ClassNotFoundException {
		boolean flag=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select userpass from userdata where phone_no='"+id+"'");
		rs.next();
		String passw=rs.getString(1);
		if(passw.equals(password)) {
			flag=true;
		}
		con.close();
		st.close();
		return flag;
	}
	public static void changem(int id, int  price) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="update foodmenu set price=? where id='"+id+"' ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,price);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static boolean vmenuname(int id)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select foodname from foodmenu where id='"+id+"'");
		if(!rs.next()) {
			return false;
		}
		con.close();
		st.close();
		return true;
	}
	public static void addmenu(String name,String food,int price) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="insert into foodmenu(foodname,foodtype,price) values (?,?,?) ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, name);
		st.setString(2,food);
		st.setInt(3,price);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void deletemenu(int id, String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="delete from foodmenu where id=? ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2,name);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void addhotel(String name, String phoneno, String address, String location) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="insert into merchantfood(hotelname,phone_no,address,location) values (?,?,?,?) ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, name);
		st.setString(2,phoneno);
		st.setString(3,address);
		st.setString(4,location);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void changeaddress(int id, String address, String location) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="update merchantfood set address=?,location=? where id='"+id+"' ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,address);
		st.setString(2,location);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void changephoneno(int id, String phoneno) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="update merchantfood set phone_no=? where id='"+id+"' ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,phoneno);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void deleteHotel(int id, String name)  throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="delete from merchantfood where id=? ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void adddboy(String name, String phoneno, String address, String location) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="insert into deliveryboy(name,phone_no,address,location) values (?,?,?,?) ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, name);
		st.setString(2,phoneno);
		st.setString(3,address);
		st.setString(4,location);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void deletedboy(int id, String name)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="delete from deliveryboy where id=? ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void chngdboyph(int id, String phoneno)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="update deliveryboy set phone_no=? where id='"+id+"' ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,phoneno);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void chngdboyloc(int id, String address, String location)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="update deliveryboy set address=?,location=? where id='"+id+"' ";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,address);
		st.setString(2,location);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static ArrayList<objectHotel> hotellist() throws ClassNotFoundException, SQLException{
		ArrayList<objectHotel> Hview=new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from merchantfood");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String phoneno=rs.getString(3);
			String address=rs.getString(4);
			String location=rs.getString(5);
			objectHotel o=new objectHotel(id,name,phoneno,address,location);
			Hview.add(o);
		}
		return Hview;
	}
	public static ArrayList<objectHotel> deliverylist() throws ClassNotFoundException, SQLException{
		ArrayList<objectHotel> Dview=new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from deliveryboy");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String phoneno=rs.getString(3);
			String address=rs.getString(4);
			String location=rs.getString(5);
			objectHotel o=new objectHotel(id,name,phoneno,address,location);
			Dview.add(o);
		}
		return Dview;
	}
	public static ArrayList<objectHotel> userlist() throws ClassNotFoundException, SQLException{
		ArrayList<objectHotel> Uview=new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from userdata");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String phoneno=rs.getString(5);
			String address=rs.getString(3);
			objectHotel o=new objectHotel(id,name,phoneno,address);
			Uview.add(o);
		}
		return Uview;
	}
	public static ArrayList<objectHotel> payment() throws ClassNotFoundException, SQLException{
		ArrayList<objectHotel> payment=new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select p.id,p.payment_type,p.Total_Amt,u.id,u.username,d.id,d.phone_no from payment p,deliveryboy d,userdata u where p.delivery_id=d.id and p.user_id=u.id;");
		while(rs.next()) {
			int id=rs.getInt(1);
			String type=rs.getString(2);
			int amt=rs.getInt(3);
			int uid=rs.getInt(4);
			String uname=rs.getString(5);
			int did=rs.getInt(6);
			String num=rs.getString(7);
			objectHotel o=new objectHotel(id,type,amt,uid,uname,did,num);
			payment.add(o);
		}
		return payment;
	}
	public static ArrayList<objectHotel> menufood() throws ClassNotFoundException, SQLException{
		ArrayList<objectHotel> menulist=new ArrayList();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from foodmenu");
		while(rs.next()) {
			String dishname=rs.getString(2);
			int price=rs.getInt(4);
			objectHotel o=new objectHotel(dishname,price);
			menulist.add(o);
		}
		return menulist;
}
}

