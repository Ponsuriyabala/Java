package evoluation_One;
import java.util.*;
public class maxiTreatment {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("No of days");
		int n=in.nextInt();
		System.out.println("Enter the no patients per day");
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("On day "+(i+1)+"  :");
			num[i]=in.nextInt();
			System.out.println();
		}
		int[] day=new int[n];
		System.out.print("Enter no of days take treatment");
		int k=in.nextInt();
		int temp=0;
		int max=0;
		int days=0;
		for(int i=0;i<k;i++) {
				temp+=num[i];
				day[i]=temp;
				System.out.println("On day "+(i+1)+" = "+temp);
			}
		for(int i=k;i<n;i++) {
			temp=temp+num[i]-num[i-k];
			day[i]=temp;
			System.out.println("On day "+(i+1)+" = "+temp);
		}
		for(int i=1;i<=n;i++) {
			for(int j=i+1;j<n;j++) {
				if(day[i]<day[j]) {
					max=day[j];
					days=i+1;
				}
			}
		}
		System.out.println("The Hosiptal has treated "+max+" patients on day "+days);
	in.close();}
}
