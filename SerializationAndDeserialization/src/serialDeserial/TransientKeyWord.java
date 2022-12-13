package serialDeserial;
import java.io.*;
public class TransientKeyWord {
	public static void main(String[] args) throws Exception {
		User obj = new User();
		FileOutputStream fos = new FileOutputStream("Demo.serialization");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		FileInputStream fis = new FileInputStream("Demo.serialization");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User obj2 = (User) ois.readObject();
		System.out.println(obj.password + "   " + obj2.password);
		System.out.println(obj.phoneNo + "   " + obj2.phoneNo);
		System.out.println(obj.collageCode + "   " + obj2.collageCode);
	}
}

class User implements Serializable {
	String name = "Suriya";
	transient String password = "0000";
	transient static String phoneNo="9876543210"; //no use when transient as static
	transient final int collageCode=8100;//no use when transient as final
}