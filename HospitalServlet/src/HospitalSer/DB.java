package HospitalSer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DB {
	public static void register(String pat_name,String pat_inTime,int DocTime,String out_time,int waitTime) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query="insert into entry(name,in_time,ttDoctor,out_time,wait_list) values (?,?,?,?,?) ";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ServletHospital","root","0000");
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, pat_name);
		st.setString(2,pat_inTime);
		st.setInt(3, DocTime);
		st.setString(4,out_time);
		st.setInt(5, waitTime);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static void update(int pat_id,String pat_inTime,int DocTime,String out_time,int waitTime) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ServletHospital","root","0000");
		String sql ="update entry set in_time=?,ttDoctor=?,out_time=?,wait_list=? where patient_id="+pat_id+"";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,pat_inTime);
		st.setInt(2, DocTime);
		st.setString(3,out_time);
		st.setInt(4, waitTime);
		st.executeUpdate();
		con.close();
		st.close();
	}
	public static boolean verify(int pat_id)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ServletHospital","root","0000");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select patient_id from entry where patient_id="+pat_id+" ");
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
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ServletHospital","root","0000");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from userdetail where patient_id="+pat_id+"");
		rs.next();
		name=rs.getString(2);
		con.close();
		st.close();
		return name;
	}
	public static void display() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ServletHospital","root","0000");
		Statement st = con.createStatement();
		String query="select * from patiententry";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			int id=rs.getInt(1);
			String ttD=rs.getString(2);
			String ot=rs.getString(3);
			int wt=rs.getInt(4);
			System.out.println("   "+id+"          "+ttD+"     "+ot+"            "+wt);
		}
		con.close();
		st.close();
	}
	public static Patient display(int pid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ServletHospital","root","0000");
		Statement st = con.createStatement();
		String query="select * from entry where patient_id="+pid+" ";
		ResultSet rs=st.executeQuery(query);
			rs.next();
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String it=rs.getString(3);
			int ttD=rs.getInt(4);
			String ot=rs.getString(5);
			int wt=rs.getInt(6);
//			System.out.println(id);
		Patient p = new Patient(id,name,it,ttD,ot,wt);	
		con.close();
		st.close();
		return p;
	}
	static String dateTime(String pat_inTime,int totalConsultantTime) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt=LocalTime.parse(pat_inTime);
		String outTime=df.format(lt.plusMinutes(totalConsultantTime));
		return outTime;
	}
	public static int registerPat_id() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/servlethospital","root","0000");
		Statement st = con.createStatement();
		String query="select patient_id from entry ORDER BY patient_id DESC LIMIT 1";
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int id=rs.getInt(1);
		con.close();
		st.close();
		return id;
	}
	public static int count() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/servlethospital","root","0000");
		Statement st = con.createStatement();
		String query="select count(*) from entry where patient_id";
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int id=rs.getInt(1);
		con.close();
		st.close();
		return id;
	}
}