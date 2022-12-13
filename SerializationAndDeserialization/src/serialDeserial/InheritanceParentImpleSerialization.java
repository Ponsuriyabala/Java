package serialDeserial;
import java.io.*;
public class InheritanceParentImpleSerialization {
	public static void main(String[] args) throws Exception {
		Child obj=new Child();
		FileOutputStream fos=new FileOutputStream("Dem.serialization");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis=new FileInputStream("Dem.serialization");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child obj2=(Child)ois.readObject();
		System.out.println(obj.i+"   "+obj2.j);
	}
}
class Parent implements Serializable{
	int i=10;
}
class Child extends Parent{
	int j=20;
}