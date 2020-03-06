package ua.lgs.lviv.task2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a string: ");
			String str = scan.nextLine();
			System.out.println("Your string after changes: "+changeStr(str));
		}
	}

	public static String changeStr(String s) {
		return s.replaceAll("a", "-").replaceAll("o", "-").replaceAll("e", "-").replaceAll("i", "-")
				.replaceAll("u", "-").replaceAll("y", "-");
	}
}
