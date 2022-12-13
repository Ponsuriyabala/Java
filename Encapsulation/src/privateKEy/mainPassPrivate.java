package privateKEy;
import java.util.*;
public class mainPassPrivate {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String pin=in.next();
		setAndget pass=new setAndget();
		System.out.println(pass.getPin());
		pass.setPin(pin);
		System.out.println(pass.getPin());
	}
}
