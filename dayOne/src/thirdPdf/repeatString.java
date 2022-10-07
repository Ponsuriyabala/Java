package thirdPdf;
import java.util.*;
public class repeatString {
	public static void main(String a[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the word: ");
		String str=in.nextLine();
		System.out.print("Enter How many times repeated ");
		int num=in.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print(str);
		}
	in.close();}
}
/*You just need to take a string and a integer as an input and repeat the string upto the count given
as in integer.
Sample Test Case :
Hello
2
Output :
HelloHello*/