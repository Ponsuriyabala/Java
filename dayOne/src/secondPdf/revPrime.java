package secondPdf;
import java.util.*;
public class revPrime {
	public static void main(String a[]) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		revPrime obj=new revPrime();
		obj.primeRnot(num);
		int r=obj.revInt(num);
		System.out.println(r);
		obj.primeRnot(r);
		in.close();}
	void primeRnot(int n) {
		int count=0;
		if(n<=1) {
			System.out.println(n);
		}
		else {
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==1)
				System.out.println("Prime");
			else
				System.out.println("not prime");
		}
	}
	int revInt(int n) {
		int rev=0;
		while(n!=0){
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
}
/*
 A number is said to be twisted prime if it is a prime number and reverse of the number is also a
prime number.
Input : 97 Output : Twisted Prime Number
Explanation: 97 is a prime number and its reverse 79 is also a prime
number.
 */