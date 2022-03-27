import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("---------Welcome MTB Smart Services--------");
		int password=3088;
		int pin;
		int balance=10000;
		System.out.print("Enter your pin:");
		pin=input.nextInt();
		if (pin==password) {
			System.out.print("*******Menu Bar******\n1.Withdraw\n2.Deposit\n3.Balance\n4.Cancel\n");
			int choice;
			System.out.print("Type Option:");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				int amount;
				System.out.println("Amount of withdraw money:");
				amount=input.nextInt();
				balance-=amount;
				System.out.print("Successfully you completed your truncation");
				System.out.print("Your current balance:"+balance);
			case 2:
				int amountt;
				System.out.println("Amount of deposit money:");
				amountt=input.nextInt();
				balance-=amountt;
				System.out.print("Successfully you completed your truncation");
				System.out.print("Your current balance:"+balance);
			case 3:
		        System.out.print("Your current balance:"+balance+"Tk");
			case 4:
				System.out.println("See you next time");
			}
			
		}
		else {
			System.out.print("Wrong password!!!Please try again later..");
			
			
		}
			

	}

}
