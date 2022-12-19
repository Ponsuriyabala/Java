package dayOne;

public class SampleExtends {
	public static void main(String[] args) {
		A obj=new B();
		obj.msg();
		obj.print();
//		obj.lose();// its not in A
		obj.loe();
	}
}
class A{
	public void msg() {
		System.out.println("Hlo");
	}
	public void print() {
		System.out.println("print");
	}
	public void loe() {
		System.out.println("lose");
	}
}
class B extends A{
	public void msg() {
		System.out.println("Hi");
	}
	public void print() {
		System.out.println("Printer");
	}
	public void lose() {
		System.out.println("lose");
	}
}

