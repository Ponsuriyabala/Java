package diwaliForce;
import java.util.*;
public class waterDrop1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int num=in.nextInt();
		int count=0;
		System.out.println("Enter the array element");
		int[] watLvl=new int[num];
		for(int i=0;i<num;i++) {
			watLvl[i]=in.nextInt();
		}
		for(int i=1;i<num;i++) {
			if(watLvl[0]>watLvl[i]) {
				count+=watLvl[0]-watLvl[i];
			}
			else if(watLvl[0]<=watLvl[i]) {
				break;
			}
		}
		System.out.println(count);
	}
}
