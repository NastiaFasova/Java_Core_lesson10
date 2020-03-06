package ua.lgs.lviv.task3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Enter a sentence: ");
			String str=scan.nextLine();
			if(calculateWords(str)==1) {
				System.out.println("There is 1 word in a sentence");
			} else {
				System.out.println("There are "+calculateWords(str)+ " words in a sentence");
			}
			
		}

	}
	public static int calculateWords(String s) {
		String []strings=s.split(" ");
		return strings.length;
	}

}
