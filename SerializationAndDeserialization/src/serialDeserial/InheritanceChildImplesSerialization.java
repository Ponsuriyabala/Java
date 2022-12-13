package serialDeserial;
import java.io.*;
public class InheritanceChildImplesSerialization {
	public static void main(String[] args) throws Exception {
		ChildImples obj=new ChildImples();
		obj.i=999;
		obj.j=444;
		FileOutputStream fos=new FileOutputStream("Dem.serialization");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);

		FileInputStream fis=new FileInputStream("Dem.serialization");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ChildImples obj2=(ChildImples)ois.readObject();
		System.out.println(obj2.i+"   "+obj2.j);
	}
}
class ParentChild{
	int i=10;
//	ParentChild(){
//		System.out.println("Parent Constructor");
//	}
}
class ChildImples extends ParentChild implements Serializable{
	int j=20;
//	ChildImples(){
//		System.out.println("Child Constructor");
//	}
}