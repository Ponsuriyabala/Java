package jDbc;
import java.util.*;
import java.sql.*;
public class fetchAnoclass{
	public static void main(String args[]) throws Exception{
	 Scanner in =new Scanner(System.in);
	 System.out.println("the age of the person is");
	 String name=in.next();
	 sQl(name);
 }
   static void sQl(String name) throws Exception {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sample");
//	   Statement st=con.createStatement("");
	   
   }
   
}