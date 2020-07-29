package Package1;

import java.util.Scanner;

public class StringPrg2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text to append ");
		String text1 = input.next();
		String text2 = input.next();
		String text3 = input.next();
		String text4 = input.next();
		String text5 = input.next();
		String text6 = input.next();
		String text7 = input.next();
		String text8 = input.next();
		String text9 = input.next();
		String text10 = input.next();
		String op = text1.concat(" "+text2+" "+text3+" "+text4+" "+text5+" "+text6+" "+text7+" "+text8+" "+text9+" "+text10);
		System.out.println("Appended 10 Strings output: "+op);
	}
}
