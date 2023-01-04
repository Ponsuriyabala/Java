package view_Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import model.DeliveryBoy;
import model.DishItem;
import model.MenuList;
import model.Resturant;
import model.User;
public class Database {
	private int id;
	private String name,email,address,contact,dishType,pass,location,availableTime;
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	void reqister(User o) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("insert into userdetail(uname, unumber, uemail, uaddress, upassword) values(?,?,?,?,?)");
			pst.setString(1, o.getName());
			pst.setString(2, o.getContact());
			pst.setString(3, o.getEmail());
			pst.setString(4, o.getAddress());
			pst.setString(5, o.getPassword());
			pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
	}
	boolean verify(String email,String password) {
		String pass = null,uemail=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select uemail,upassword from userdetail where uemail=?");
			pst.setString(1,email);
			rs=pst.executeQuery();
			if(rs.next()) {
			    uemail=rs.getString(1);
				pass=rs.getString(2);
			}
			else {
				System.out.println("Enter crt email");
				Delivery obj=new Delivery();
				obj.userOption();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
		if(pass.equals(password)&& uemail.equals(email)) {
			return true;
		}
		else {
			return false;
		}
	}
	User userDetail(String email) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select * from userdetail where uemail=?");
			pst.setString(1,email);
			rs=pst.executeQuery();
			rs.next();
			id=rs.getInt(1);
			name=rs.getString(2);
			contact=rs.getString(3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
		User obj=new User(id,name,contact);
		return obj;
	}
	void addResturant(Resturant o) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("insert into resturant(rname, rnumber, raddress, remail) values(?,?,?,?)");
			pst.setString(1, o.getName());
			pst.setString(2, o.getContact());
			pst.setString(3, o.getAddress());
			pst.setString(4, o.getEmail());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
	}
	ArrayList<Resturant> viewResturants(String location) {
		ArrayList<Resturant> hotel=new ArrayList<Resturant>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select * from resturant where rlocation=?");
			pst.setString(1, location);
			rs=pst.executeQuery();
			while(rs.next()) {
				id=rs.getInt(1);
				name=rs.getString(2);
				contact=rs.getString(3);
				address=rs.getString(4);
				email=rs.getString(5);
				location=rs.getString(6);
				Resturant obj=new Resturant(id,name,contact,email,address,location);
				hotel.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}	
		return hotel;
	}
	void addDeliveryBoy(DeliveryBoy o) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("insert into deliveryboy(dboyname, dboynumber, dboyaddress) values(?,?,?)");
			pst.setString(1, o.getName());
			pst.setString(2, o.getContact());
			pst.setString(3, o.getAddress());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
	}
	ArrayList<DeliveryBoy> listDeliveryBoy() {
		ArrayList<DeliveryBoy> dboy=new ArrayList<DeliveryBoy>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select * from deliveryBoy");
			rs=pst.executeQuery();
			while(rs.next()) {
				id=rs.getInt(1);
				name=rs.getString(2);
				contact=rs.getString(3);
				address=rs.getString(4);
				Timestamp time=rs.getTimestamp(6);
				availableTime=time.toString();
				DeliveryBoy obj=new DeliveryBoy(id,name,contact,address,availableTime);
				dboy.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
		return dboy;
	}
	void addMenu(MenuList o, int selectHotel) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("insert into pricelist(hotelid, itemid, price, dishcount) values(?,?,?,?)");
			pst.setInt(1, o.getHotelId());
			pst.setString(2, o.getItemType());
			pst.setInt(3, o.getMenuPrice());
			pst.setInt(4, o.getMenuCount());

			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
	}
	ArrayList<DishItem> viewDish() {
		ArrayList<DishItem> items=new ArrayList<DishItem>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select * from dishItem");
			rs=pst.executeQuery();
			while(rs.next()) {
				id=rs.getInt(1);
				name=rs.getString(2);
				dishType=rs.getString(3);
				DishItem obj=new DishItem(id,name,dishType);
				items.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}	
		return items;
	}
	ArrayList<MenuList> viewMenu(int hid) {
		ArrayList<MenuList> items=new ArrayList<MenuList>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select p.priceid,d.dishname,d.dishtype,p.price,p.dishcount from pricelist p left join dishitem d on p.itemid=d.dishid where hotelid=?");
			pst.setInt(1,hid);
			rs=pst.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				dishType=rs.getString(3);
				int price=rs.getInt(4);
				int count=rs.getInt(5);
				MenuList obj=new MenuList(id,name,dishType,price,count);
				items.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}	
		return items;
	}
	ArrayList<String> viewLocation() {
		ArrayList<String> hotel=new ArrayList<String>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select distinct rlocation from resturant");
			rs=pst.executeQuery();
			while(rs.next()) {
				location=rs.getString(1);
				hotel.add(location);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}	
		return hotel;
	}
	ArrayList<String> DeliveryBoy() {
		ArrayList<String> boy=new ArrayList<String>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select dboynumber from deliveryBoy");
			rs=pst.executeQuery();
			while(rs.next()) {
				contact=rs.getString(1);
				boy.add(contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
		return boy;
	}
	ArrayList<String> DeliveryBoyAvailable() {
		
		ArrayList<String> boy=new ArrayList<String>();
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("select dboyavailablefrom from deliveryBoy");
			rs=pst.executeQuery();
			while(rs.next()) {
				Timestamp timestampobj=rs.getTimestamp(1);
				String time=timestampobj.toString();
				boy.add(time);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}	
		return boy;
	}
	public void changeAvailabletime(String contact) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/food_delivery","root","0000");
			pst=con.prepareStatement("update deliveryboy set dboyavailablefrom=? where dboynumber=?");
			pst.setString(2, contact);
			DateTimeFormatter df = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		    LocalDateTime lt =LocalDateTime.now();
		    String time=df.format(lt.plusMinutes(5));
		    Timestamp ts=Timestamp.valueOf(time);
		    pst.setTimestamp(1, ts);
		    pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			objClose();
		}
	}
	void objClose() {
		try {
			
			if(rs!=null) {
				rs.close();
				rs=null;
			}
			
			if(pst!=null) {
				pst.close();
				pst=null;
			}
			
			if(con!=null) {
				con.close();
				con=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}