package multiThread;
public class ThreadPriority {
	public static void main(String[] args) {
		Msg7 obj=new Msg7();
		Msg8 obj2=new Msg8();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("hilloworld");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"Vandu");
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		t1.setName("Suriya");
		t2.setName("Hari");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}
class Msg7 implements Runnable{
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
class Msg8 implements Runnable{
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
