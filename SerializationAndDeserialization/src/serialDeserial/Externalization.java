package serialDeserial;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization {
	public static void main(String[] args) throws Exception {
		External obj=new External("Suriya",10,20);
		FileOutputStream fos=new FileOutputStream("a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis=new FileInputStream("a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		External obj2=(External)ois.readObject();
		System.out.println(obj.s+"   "+obj2.s+" "+obj.j+" "+obj2.j);
	}
}
class External implements Externalizable{//Must have constructor in externalization because of jvm 
	String s;
	int i;
	int j;
	public External() {
		System.out.println("External Constructor");
	}
	public External(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
		s=(String)in.readObject();
		i=in.readInt();
	}
}