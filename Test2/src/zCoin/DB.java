package zCoin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DB {
	static Connection con=null;
	PreparedStatement pst = null;
	Statement st=null;
	protected void register(String name,String email,String phnumber,String govermentid,String password,double amount) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		String query="insert into zcoin(uname, uemailid,phnumber, GovermentID, upassword,amount) values (?,?,?,?,?,?) ";
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zcoin","root","0000");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			pst = con.prepareStatement(query);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			System.out.println(name);
			pst.setString(1,name);
			pst.setString(2,email);
			pst.setString(3,phnumber);
			pst.setString(4,govermentid);
			pst.setString(5,password);
			pst.setDouble(6, amount);;
			pst.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			pst.close();
			pst=null;
			con.close();
			con=null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected boolean userLogVerify(String mail,String password){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/zcoin","root","0000");
			st=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs;
		try {
			rs = st.executeQuery("select upassword from zcoin where uemailid='"+mail+"' ");
			if(!rs.next()) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
			con=null;
			st.close();
			st=null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	protected AccountCreation display(String uemail){
		AccountCreation p = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/zcoin","root","0000");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query="select * from zcoin where uemail="+uemail+" ";
		ResultSet rs;
		try {
			rs = st.executeQuery(query);
			rs.next();
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			String phnumber=rs.getString(4);
			String hid=rs.getString(5);
			String password=rs.getString(6);
			double amount=rs.getDouble(7);
			p = new AccountCreation(id,name,email,phnumber,hid,password,amount);	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
			con=null;
			st.close();
			st=null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	protected void display(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/zcoin","root","0000");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query="select * from transaction";
		ResultSet rs;
		try {
			rs = st.executeQuery(query);
			while(rs.next()) {
				int transid=rs.getInt(1);
			String sendname=rs.getString(2);
			double amount=rs.getDouble(3);
			String receivename=rs.getString(4);
			System.out.println(sendname+"  "+amount+"  "+receivename);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
			con=null;
			st.close();
			st=null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void personTrans(int id){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/zcoin","root","0000");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query="select * from transaction where senderid="+id+"";
		ResultSet rs;
		try {
			rs = st.executeQuery(query);
			while(rs.next()) {
				int transid=rs.getInt(1);
			String sendname=rs.getString(2);
			double amount=rs.getDouble(3);
			String receivename=rs.getString(4);
			System.out.println(sendname+"  "+amount+"  "+receivename);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
			con=null;
			st.close();
			st=null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
