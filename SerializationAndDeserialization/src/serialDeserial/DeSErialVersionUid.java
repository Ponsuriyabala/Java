package serialDeserial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSErialVersionUid {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			FileInputStream fis=new FileInputStream("Dem.serialization");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Human obj2=(Human)ois.readObject();
			System.out.println(obj2.i);
		}
}
