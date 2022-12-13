package serialDeserial;
import java.io.*;
public class MultipleObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Me me=new Me();
		You you=new You();
		Boy boy=new Boy();
		Girl girl=new Girl();
		FileOutputStream fos=new FileOutputStream("Dem.serialization");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(me);
		oos.writeObject(you);
		oos.writeObject(boy);
		oos.writeObject(girl);
		FileInputStream fis=new FileInputStream("Dem.serialization");
		ObjectInputStream ois=new ObjectInputStream(fis);
//		Me me1=(Me)ois.readObject();
//		You you1=(You)ois.readObject();
//		Boy boy1=(Boy)ois.readObject();
//		Girl girl1=(Girl)ois.readObject();
		Object obj=ois.readObject();
		if(obj instanceof Me) {
			Me me1=(Me)obj;
			System.out.println(me1.name);
		}
		else if(obj instanceof You){
			You  you1=(You)obj;
			System.out.println(you1.name);
		}
		else if(obj instanceof Boy){
			Boy boy1=(Boy)obj;
			System.out.println(boy1.name);
		}
		else{
			Girl girl1=(Girl)obj;
			System.out.println(girl1.name);
		}
//		System.out.println(me1.name+" "+you1.name+" "+boy1.name+" "+girl1.name);
	}
}

class Me implements Serializable{
	String name="Suriya";
	transient String password="0000";
}
class You implements Serializable{
	String name="Samantha";
	transient String password="0000";
}
class Boy implements Serializable{
	String name="Susa";
	transient String password="0000";
}
class Girl implements Serializable{
	String name="Sasu";
	transient String password="0000";
}