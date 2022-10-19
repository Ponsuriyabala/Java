package oOPs;
class Rectangle {
	int width=2,height=3;
	void display() {
		System.out.println(width+" "+height);
	}
}
class rectangleArea extends Rectangle{
	int area;
	int read_input() {
		area=width*height;
		return area;
	}
	void display() {
		int result = read_input();
		System.out.println(result);
	}
}
class rectangle{
	public static void main(String args[]) {
		System.out.println("main claass");
//		rectangleArea r = new rectangleArea();
//		System.out.println(r.display());
	}
}