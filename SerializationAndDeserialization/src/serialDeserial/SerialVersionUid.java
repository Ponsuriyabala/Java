package serialDeserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionUid {
	public static void main(String[] args) throws IOException {
		Human obj=new Human();
		FileOutputStream fos=new FileOutputStream("Dem.serialization");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
	}
}
