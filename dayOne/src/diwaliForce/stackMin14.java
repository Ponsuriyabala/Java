package diwaliForce;
import java.util.*;
public class stackMin14 {
	public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int i=0,min=Integer.MAX_VALUE;
	int[] a=new int[n];
	Stack num=new Stack();
	while(i<n) {
		 a[i]=in.nextInt();
		i++;
	}
	for(i=0;i<n;i++) {
			if(min>a[i]) {
				min=a[i];
				num.push(min);
			}
			else {
				num.push(min);
			}
	}
	for(i=0;i<n;i++) {
		System.out.print(num.pop()+" ");
	}
	}
}
