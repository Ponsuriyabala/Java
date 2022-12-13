package serialDeserial;
import java.io.*;
public class GroupSerialization {
	public static void main(String[] args) throws Exception {
		Tiger me=new Tiger();
		FileOutputStream fos=new FileOutputStream("Dem.serialization");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(me);
		FileInputStream fis=new FileInputStream("Dem.serialization");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Tiger me1=(Tiger)ois.readObject();
		System.out.println(me1.T.V.vandu);
	}
}
class Tiger implements Serializable{
	TigerF T=new TigerF();
}
class TigerF implements Serializable{
	TigerVandu V=new TigerVandu();
}
class TigerVandu implements Serializable{
	int vandu=6;
}
