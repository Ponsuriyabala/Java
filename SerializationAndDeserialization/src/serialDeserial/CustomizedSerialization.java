package serialDeserial;
import java.io.*;
public class CustomizedSerialization {
	public static void main(String[] args) throws Exception {
		Password obj = new Password();
		FileOutputStream fos = new FileOutputStream("Demo.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		FileInputStream fis = new FileInputStream("Demo.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Password obj2 = (Password) ois.readObject();
		System.out.println(obj.password + "   " + obj2.password);
	}
}
class Password implements Serializable{
	String name = "Suriya";
    transient String password = "10000";
//	here customized
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String encrypt="123"+password;
		oos.writeObject(encrypt);
	}
	private void readObject(ObjectInputStream ois) throws Exception, IOException {
		ois.defaultReadObject();
		String encrypt=(String)ois.readObject();
		password=encrypt.substring(3);
	}
}
