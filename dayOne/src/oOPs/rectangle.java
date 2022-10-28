package oOPs;
import java.util.*;
class Rectangle {
	int width,height;
	void display() {
		System.out.println(width+" "+height);
	}
}
class rectangleArea extends Rectangle{
	Scanner in=new Scanner(System.in);
	int area;
	int read_input() {
		int width=in.nextInt();
		int height=in.nextInt();
		this.width=width;
		this.height=height;
		area=width*height;
		return area;
	}
	void display() {
		int result = read_input();
		System.out.println(result);
	}
}
