package methodTask;
import java.util.*;
public class inVest {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the investment amount");
		float iAmo=in.nextFloat();
		System.out.print("Enter the investment Interest");
		float inTerest=in.nextFloat();
		System.out.print("Enter the investment Years");
		float yrs=in.nextFloat();
		
		for(int i=1;i<=yrs;i++) {
		System.out.println(i+" "+calCul(iAmo,inTerest,i));
		}
	in.close();}
	static float calCul(float a,float i,float t) {
		float f , x;
		x = (float) Math.pow((1+(i/1200)), 12*t);
		f=a*x;
	return f;}
}
/*. Write a Java method to compute the future investment value at a given interest rate for a
specified number of years.
 Sample data (Monthly compounded) and Output:
 Input the investment amount: 1000
 Input the rate of interest: 10
 Input number of years: 5
Expected Output:
Years FutureValue
1 1104.71
2 1220.39
3 1348.18
4 1489.35
5 1645.31
*/