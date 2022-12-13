package classObject;
//public class StudentObject {
//	int roll_no;
//	String name;
//	StudentObject(int roll_no,String name){
//		this.roll_no=roll_no;
//		this.name=name;
//	}
//	public static void main(String args[]) {
//		StudentObject obj=new StudentObject(2,"John");
//		System.out.println(obj.roll_no);
//		System.out.println(obj.name);
//	}
//}






class Rectangle{
	int breadth;
	int length;
	Rectangle(int breadth,int length){
		this.breadth=breadth;
		this.length=length;
	}
	int area() {
		int area=breadth*length;
		return area;
	}
}
class StudentObject{
	public static void main(String args[]) {
		Rectangle obj=new Rectangle(4,5);
		System.out.println(obj.area());
		Rectangle obj1=new Rectangle(5,8);
		System.out.println(obj1.area());
	}
}