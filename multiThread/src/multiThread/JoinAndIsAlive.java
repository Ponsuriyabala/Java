package multiThread;
public class JoinAndIsAlive {
	public static void main(String args[]) throws InterruptedException {
		Msg5 obj=new Msg5();
		Msg6 obj2=new Msg6();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj);
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		t3.start();
		t3.join(2000);
		System.out.println(t1.isAlive());
		System.out.println("Bye");
		
	}
}
class Msg5 implements Runnable{
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
class Msg6 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hall");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

