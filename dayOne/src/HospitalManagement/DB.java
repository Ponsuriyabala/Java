package HospitalManagement;
import java.sql.*;
public class DB {
	public static void register(String pat_name,String pat_inTime) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st = con.createStatement();
		String query="insert into userdetail(patient_name,in_time) values ('"+pat_name+"','"+pat_inTime+"') ";
		st.executeUpdate(query);
		con.close();
		st.close();
	}
	public static void update(int pat_id,String pat_inTime) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		String sql ="update userdetail set in_time='"+pat_inTime+"' where patient_id="+pat_id+"";
		PreparedStatement st = con.prepareStatement(sql);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static boolean verify(int pat_id)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select patient_id from userdetail where patient_id="+pat_id+" ");
		if(!rs.next()) {
			return false;
		}
		con.close();
		st.close();
		return true;
	}
	public static String userinfo(int pat_id) throws Exception {
		String name="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from userdetail where patient_id="+pat_id+"");
		rs.next();
		name=rs.getString(2);
		con.close();
		st.close();
		return name;
	}
	public static void createDb() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/","root","0000");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE DATABASE IF NOT EXISTS hospital");
		con.close();
		st.close();
	}
	public static void createTable() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE TABLE IF NOT EXISTS userdetail(patient_id int primary key AUTO_INCREMENT,patient_name varchar(30) not null,in_time varchar(10) not null)");
		con.close();
		st.close();
	}
	public static void createTable2() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st=con.createStatement();
		st.executeUpdate("CREATE TABLE IF NOT EXISTS patientEntry(patient_id int primary key ,TimeTakenDoctor varchar(10) not null,out_time varchar(10) not null,Wait_time varchar(10) not null)");
		con.close();
		st.close();
	}

	public static void update2(int pat_id,String random,String outtime,int timeTaken) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		String sql ="update patiententry set out_time='"+outtime+"',TimeTakenDoctor='"+random+"',wait_time="+timeTaken+" where patient_id="+pat_id+"";
		PreparedStatement st = con.prepareStatement(sql);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static boolean verify2(int pat_id)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select patient_id from patiententry where patient_id="+pat_id+" ");
		if(!rs.next()) {
			return false;
		}
		con.close();
		st.close();
		return true;
	}
	public static void register2(int pat_id,String random,String outTime,int timeTaken) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st = con.createStatement();
		String query="insert into patiententry values("+pat_id+",'"+random+"','"+outTime+"',"+timeTaken+") ";
		st.executeUpdate(query);
		con.close();
		st.close();
	}
	public static void display() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st = con.createStatement();
		String query="select * from patiententry";
		ResultSet rs=st.executeQuery(query);
		System.out.println("---------------------------------------------");
		System.out.println("patient_id  timeTaken  out_time   waiting_time");
		while(rs.next()) {
			int id=rs.getInt(1);
			String ttD=rs.getString(2);
			String ot=rs.getString(3);
			int wt=rs.getInt(4);
			System.out.println("   "+id+"          "+ttD+"     "+ot+"            "+wt);
		} 
		System.out.println("---------------------------------------------");
		HospitalMain.mainFunction();
		con.close();
		st.close();
	}
	public static void display(int pid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st = con.createStatement();
		String query="select * from patiententry where patient_id="+pid+" ";
		ResultSet rs=st.executeQuery(query);
		System.out.println("---------------------------------------------");
		System.out.println("patient_id  timeTaken  out_time   waiting_time");
		rs.next();
			int id=rs.getInt(1);
			String ttD=rs.getString(2);
			String ot=rs.getString(3);
			int wt=rs.getInt(4);
			System.out.println("   "+id+"          "+ttD+"     "+ot+"            "+wt);
		System.out.println("---------------------------------------------");
		con.close();
		st.close();
	}
	public static void display1(int pid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st = con.createStatement();
		String query="select * from userdetail where patient_id="+pid+" ";
		ResultSet rs=st.executeQuery(query);
		System.out.println("---------------------------------------------");
		System.out.println("patient_id  name  in_time");
		rs.next();
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String it=rs.getString(3);
			System.out.println("   "+id+"        "+name+"    "+it);
		System.out.println("---------------------------------------------");
		con.close();
		st.close();
	}
	public static int registerPat_id() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","0000");
		Statement st = con.createStatement();
		String query="select patient_id from userdetail ORDER BY patient_id DESC LIMIT 1";
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int id=rs.getInt(1);
		con.close();
		st.close();
		return id;
	}
}
