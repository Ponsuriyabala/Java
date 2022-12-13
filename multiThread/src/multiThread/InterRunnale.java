package multiThread;

public class InterRunnale {
	public static void main(String args[]) {
		Msg3 obj=new Msg3();
		Msg4 obj2=new Msg4();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
	}
}
class Msg3 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			print();
			try {
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
class Msg4 implements Runnable{
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
