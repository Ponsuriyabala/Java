package dayOne;
import java.util.Scanner;
public class SimpleRegex {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String acPwd1  = sc.next();

			String pattern = "[a-zA-Z0-9]{6}";
			if (acPwd1.matches(pattern)) {
				System.out.print(true);
			}
			else {
				System.out.print(false);
			}
		}
	}

}

