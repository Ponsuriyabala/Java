package taskFive;
import java.util.*;
public class matricsRotate {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the element n as nxn");
		int n=in.nextInt();
		int[][] num=new int[n][n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" row elements");
			for(int j=0;j<n;j++) {
				num[i][j]=in.nextInt();
			}
		}
		
	in.close();}
}
