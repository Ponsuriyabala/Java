package methodTask;
import java.util.*;
public class Holiday {
	private String name;
	private int day;
	private String month;
	
	public Holiday(String name,int day,String month) {
		this.name=name;
		this.day=day;
		this.month=month;
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		Holiday h1=new Holiday("New year",1,"January");
		Holiday h2=new Holiday("Pongal",15,"January");
		Holiday h3=new Holiday("Republic Day",26,"January");
		Holiday h4=new Holiday("Independence day",15,"August");
		
		if(inSameMonth(h1.month,h2.month)==true) {
			System.out.println("Two month are same");
		}
		else {
			System.out.println("Two month are different");
		}
	in.close();}
	    
	static boolean inSameMonth(String fMonth,String sMonth) {
	boolean flag=false;
	if(fMonth==sMonth) {
		flag=true;
	}
	return flag;
	}
}
