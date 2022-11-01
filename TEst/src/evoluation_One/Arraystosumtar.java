package evoluation_One;
import java.util.*;
public class Arraystosumtar {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of element");
		int n=in.nextInt();
		System.out.println("Enter the target element");
		int k=in.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int res=num[i];
			for(int j=i+1;j<n;j++) {
				res+=num[j];
				if(res<k) {
					continue;
				}
				else if(res>k) {
					break;
				}
				else {
					for(int f=i;f<=j;f++){
						System.out.print(num[f]+" ");
					}	
				}
			}
			System.out.println();
		}

		in.close();}
}
