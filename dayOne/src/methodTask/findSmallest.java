package methodTask;
import java.util.*;
public class findSmallest {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int[] num=new int[3];
		for(int i=0;i<3;i++) {
			System.out.print("Enter the "+(i+1)+" number : ");
			num[i]=in.nextInt();
		}
		System.out.println("Smallest value of numbers "+smallNum(num));
	in.close();}
	static float smallNum(int[] n) {
		for(int i=0;i<n.length-1;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					n[i]=n[i]+n[j];
					n[j]=n[i]-n[j];
					n[i]=n[i]-n[j];
				}
			}
		}
		float f=n[0];
		return f;
	}
}
/* Write a Java method to find the smallest number among three numbers.
 Input the first number: 25
 Input the Second number: 37
 Input the third number: 29
 Expected Output: The smallest value is 25.0*/