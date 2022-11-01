package evoluation_One;
import java.util.*;
public class StarPattern5 {
	public static void main(String a[]) {
		Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int count=1;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(count++);
					if(j<i) {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
			count-=1;
			for(int i=1;i<=n;i++) {
				int f=count-(n-i);
				for(int j=n-i;j>=0;j--) {
					System.out.print(f++);
					count--;
					if(j>0) {
						System.out.print("*");
					}
				}
				System.out.println("");
			}
	in.close();}
}
