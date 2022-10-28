package diwaliForce;
import java.util.*;
public class thirdLargest7 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the no of element");
		int num=in.nextInt();
		if(num<3) {
			int[] wasteInd=new int[num];
			for(int i=0;i<num;i++) {
				wasteInd[i]=in.nextInt();
			}
			System.out.print("-1");
		}
		else {
			int[] wasteInd=new int[num];
			for(int i=0;i<num;i++) {
				wasteInd[i]=in.nextInt();
			}
			System.out.println("Third largest number : "+thirdLarge(wasteInd));
		}
	}
	static int thirdLarge(int num[]) {
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					num[i]=num[i]+num[j];
					num[j]=num[i]-num[j];
					num[i]=num[i]-num[j];
				}
			}
		}
		int res=num[2];
		return res;
	}
}
