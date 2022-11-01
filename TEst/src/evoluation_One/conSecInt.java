package evoluation_One;
import java.util.*;
public class conSecInt {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		boolean flag=false;
		for(int i=0;i<n-1;i++) {
			if(num[i]==num[i+1]-1) {
//				continue;
				flag=false;
			}
			else {
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("consective"+num[0]+" to "+num[n-1]);
		else
			System.out.print("Not consective");
	in.close();}
}
