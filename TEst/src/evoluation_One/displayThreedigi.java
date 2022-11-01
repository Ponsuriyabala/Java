package evoluation_One;
import java.util.*;
public class displayThreedigi {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in) ;
		System.out.print("Enter the number");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++) {
					if(i!=j&&j!=k&&k!=i) {
						System.out.println(Integer.toString(i)+Integer.toString(j)+Integer.toString(k));
					}
				}
				
			}
		}
	in.close();}
}
