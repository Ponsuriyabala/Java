package secondPdf;
import java.util.*;
public class intPair {
	public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("Number of elements");
	int n=in.nextInt();
	System.out.println("Enter "+n+" number of element");
	int []num=new int[n];
	int i=0;
	do {
		num[i]=in.nextInt();
		i++;
	}while(i<n);
	System.out.println("Enter the number is Sum");
	int r=in.nextInt();
	for(i=0;i<n;i++) {
		if(num[i]==-1) { 
			continue;
		}
		else {
		for(int j=i+1;j<n;j++) {
			if(r==num[i]+num[j]) {
				System.out.print(" ("+num[i]+" , "+num[j]+") ");
				num[j]=-1;
			}
		}
		}
	}
	in.close();}
}
/*Given an array A[] and a number x, check for pair in A[] with sum as x.
Eg : Input {1, 2, 4, 3, 5, 6}
SUM : 5 Output : 2 (1, 4) & (2, 3)*/