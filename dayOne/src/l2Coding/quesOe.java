package l2Coding;
import java.util.*;
public class quesOe {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of element");
		int n=in.nextInt();
		String res="";
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
			res+=num[i];
		}
		int number=Integer.parseInt(res)+1;
        String result="";
        result+=number;
        System.out.println(result);
        char[] num1=new char[n];
        for(int i=0;i<result.length();i++) {
            char  r=(char)result.charAt(i);
        	num1[i]=r;
        }
        System.out.println(Arrays.toString(num1));
	in.close();}

	
}
