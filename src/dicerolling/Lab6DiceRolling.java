package dicerolling;

import java.util.Random;
import java.util.Scanner;

public class Lab6DiceRolling {
	static Scanner sc = new Scanner(System.in);
	static int dice;
	static String again;
	static int roll1;
	static int roll2;
	static Random rand = new Random();

	public static void main(String[] args) {

		dice();
	}

	public static void dice() {
		System.out.println("Hello gambler how many sides will each die have: ");
		dice = sc.nextInt();

		outcome();
	}

	public static void outcome() {
		System.out.println("Rolling first die.....");
		roll1 = rand.nextInt(dice) + 1;
		System.out.println(roll1);
		System.out.println("Rolling second die....");
		roll2 = rand.nextInt(dice) + 1;
		System.out.println(roll2);
		again();
	}

	public static void again() {
		System.out.println("Would you like to play again? (yes/no)");
		again = sc.next();
		if (again.equalsIgnoreCase("yes")) {
			dice();
		} else if (again.equalsIgnoreCase("no")) {
			end();
		} else {
			System.out.println("error! resetting...");
			again();
		}
	}

	public static void end() {
		System.out.println("Goodbye!");

	}
}
