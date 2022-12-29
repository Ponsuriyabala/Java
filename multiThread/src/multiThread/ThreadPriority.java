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
		t2.start();
		t3.start();
//		t1.setName("Suriya");
//		t2.setName("Hari");
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
//		System.out.println(t3.getName());
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		System.out.println(t3.getPriority());
	}
}
class Msg7 implements Runnable{
	Thread t;
	public void run() {
		t=Thread.currentThread();
		for(int i=0;i<5;i++) {
			print();
//			System.out.println(t.getName()+" "+t.getPriority());
		}
	}
	private void print() {
		System.out.println(t.getName());
	}
}
class Msg8 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
