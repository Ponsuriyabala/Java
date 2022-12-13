package serialDeserial;

import java.io.*;

public class SimpleImplement {
	public static void main(String[] args) throws Exception {
		Mark obj=new Mark();
		FileOutputStream fos=new FileOutputStream("Dem.serialization");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis=new FileInputStream("Dem.serialization");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Mark obj2=(Mark)ois.readObject();
		System.out.println(obj.Tamil+"   "+obj2.Tamil);
	}
}
class Mark implements Serializable{
	int Tamil=100;
	int Engish=50;
	int Maths=100;
	int Science=90;
	int SocialScience=90;
}
