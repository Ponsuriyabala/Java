package multiThread;
public class beGininG {
	public static void main(String args[]) {
		Msg1 obj=new Msg1();
		Msg2 obj2=new Msg2();
		obj.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();
		
	}
}
class Msg1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			print();
			try {
				  System.out.println(
			                "Thread " + Thread.currentThread().getId()
			                + " is running");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private void print() {
		System.out.println("Helloworld");
	}
}
class Msg2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("halloworld");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
