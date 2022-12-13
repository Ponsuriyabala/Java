package multiThread;
public class LambdaExpression {
	public static void main(String args[]) {
		Runnable obj=new Runnable()
		{
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("hi");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable obj1=()->
		 {
				for(int i=0;i<5;i++) {
					System.out.println("halloworld");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		};
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		Thread t3=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("hilloworld");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
				t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}