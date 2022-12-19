package memoryMeangement;
public class GarbageCollector {
	public static void main(String[] args) {
		GarbageCollector Gc1=new GarbageCollector();
		GarbageCollector Gc2=new GarbageCollector();
		GarbageCollector Gc3=new GarbageCollector();
		
		Gc1=null;//nullify
		
		Gc2=Gc1;//Reassigning reference variable Gc1 is used Gc2 in active of Garbage

		Gc3=Gc2;//Gc2=Gc1 to null Gc3=Gc2 to null Gc1=Gc2 to null so its called island of isolation
		
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
		System.out.println(rt.maxMemory());
	}
	void crt() {
		GarbageCollector Gc=new GarbageCollector();//object method inside the method  definition
	}
}
