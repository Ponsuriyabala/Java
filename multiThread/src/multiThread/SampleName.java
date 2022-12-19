package multiThread;
public class SampleName {
	public static void main(String[] args) {
		int n = 1; // Number of threads
		for (int i = 0; i < n; i++) {
			Msg17 object
			= new Msg17();
			object.start();//start the thread with whole process execution
			object.run();//run is method when its finished then execute another
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Msg18 object1=new Msg18();
			Thread obj=new Thread(object1);
			obj.run();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Msg17 extends Thread{
	public synchronized void run(){
		for(int i=0;i<5;i++) {
		print();
		System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	private void print() {
		System.out.println("Hello");
	}
}
class Msg18 implements Runnable{
	public void run() {
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
	private void print() {
		System.out.println("world");
	}
}