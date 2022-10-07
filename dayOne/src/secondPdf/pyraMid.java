package secondPdf;
import java.util.*;
public class pyraMid {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int r=1,s=0;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			r=s+i;
			s = r;
			for(int k=0;k<i;k++) {
				System.out.print(r-- +" ");
			}
			System.out.println();
		}
		r=r+n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n-i;k>0;k--) {
				System.out.print(r--+" ");
			}

			System.out.println();
		}
		in.close();}
}
/* 1
  3 2
 6 5 4
10 9 8 7
10 9 8 7
 6 5 4
 3 2
  1
 */