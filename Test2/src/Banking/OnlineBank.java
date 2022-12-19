package Banking;
import java.util.Scanner;
public class OnlineBank {
	protected int withDrawal(int money,int balance) {
		balance=balance-money;
		return balance;
	}
	protected int Deposit(int money,int balance) {
		balance=balance+money;
		return balance;
	}
}
