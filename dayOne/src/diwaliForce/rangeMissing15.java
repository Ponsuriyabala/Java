package diwaliForce;
import java.util.*;
public class rangeMissing15 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int num=in.nextInt();
		int temp[]=new int[num];
		for(int i=0;i<num;i++) {
			temp[i]=in.nextInt();
		}
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(temp[i]>temp[j]) {
					temp[i]=temp[i]+temp[j];
					temp[j]=temp[i]-temp[j];
					temp[i]=temp[i]-temp[j];
				}
			}
		}
		for(int i=0;i<num-1;i++) {
			if(temp[i]==temp[i+1]-1) {
				continue;
			}
			else {
				System.out.println(temp[i]+1);
			}
		}
	}
}
