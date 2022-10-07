package methodTask;
import java.util.*;
public class twinPrime {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		cheCk(n);
		in.close();}
	
	static void cheCk(int n) {
		for(int i=2;i<=n;i++) {
			boolean check=isPrime(i);
			if(check==true) {
				int nextTwo=i+2;
				boolean check2=isPrime(nextTwo);
				if(check2==true) {
					System.out.println("("+i+" , "+nextTwo+") ");
				}
			}
		}
	}
	
	static boolean isPrime(int n) {
		boolean flag=true;
		for(int i=2;i<n;i++) {
		if(n%i==0) {
			flag=false;
			break;
		}
		}
		return flag;
	}
}